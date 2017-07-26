package webserver;

public class SimpeServer {
    public static void main(String... args) {
        try (ServerSocket ss = new ServerSocket(Integer.parseInt(args[0]))) {
//            System.out.println("Server started, please visit: http://localhost:" + args[0]);
            log.info("Server started, please visit: http://localhost:" + args[0]);
            while (!Thread.currentThread().isInterrupted()) {
                Socket s = ss.accept();
                log.info("Client accepted");
                new Thread(new HelloWorldServer(s)).start();
            }
        }
    }
}
