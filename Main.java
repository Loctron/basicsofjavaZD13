import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        List<String> firstClients = List.of(
                "Anya",
                "Sveta",
                "Olya",
                "Alexandra",
                "Ruslana",
                "Olesya",
                "Vika"
        );

        Queue<String> clients = new LinkedList<>(firstClients);

        while (!clients.isEmpty()) {
            String client = clients.poll();

            System.out.println(client + " сделала новый маникюр.");
            
            if (Math.random() < 0.5) {
                String friend = "a friend of " + client;
                clients.add(friend);

                System.out.println(friend + " записалась на маникюр.");
            }
        }
    }
}