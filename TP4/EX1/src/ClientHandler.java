import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientHandler implements Runnable {

    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        String clientIP = clientSocket.getInetAddress().toString();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " traite le client " + clientIP);

        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Message recu : " + message);

                switch (message.toLowerCase()) {
                    case "hello":
                        out.println("Bonjour client !");
                        break;
                    case "time":
                        String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                        out.println("Date et heure : " + currentTime);
                        break;
                    case "bye":
                        out.println("Connexion fermée");
                        clientSocket.close();
                        System.out.println("Client " + clientIP + " déconnecté.");
                        return;
                    default:

                        out.println("Message recu : " + message);
                        break;
                }
            }

        } catch (IOException e) {
            System.out.println("Erreur avec le client " + clientIP + " : " + e.getMessage());
        }
    }
}