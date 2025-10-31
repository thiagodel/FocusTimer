import java.net.ServerSocket;

public class FocusServer {

    public static void main (String[] args)
    throws Exception {
        ServerSocket server = new ServerSocket(8080)
        System.out.println("Servidor FocusTimer rodando na porta 8080...");

        while (true) {
            Socket client = server.accept();
            new Thread(() -> handleClient(client)).start();
        }

    } 

    
}
