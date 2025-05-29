
import java.util.*;

public class BreadthFirstSearch {
    static Map<String, List<String>> graph = new HashMap<>();

    public static void bfs(String start, String target) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.println("Mengunjungi: " + current);

            if (current.equals(target)){
                System.out.println("Node ditemukan: " + target);
            }

            for (String neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

      public static void main(String[] args) {
        // inisialisasi graf (relasi antar node)
        graph.put("a1", Arrays.asList("a2", "a3"));
        graph.put("a2", Arrays.asList("a1", "a4", "a5"));
        graph.put("a3", Arrays.asList("a1", "a6"));
        graph.put("a4", Arrays.asList("a2"));
        graph.put("a5", Arrays.asList("a2"));
        graph.put("a6", Arrays.asList("a3", "a7"));
        graph.put("a7", Arrays.asList("a6"));

        String start = "a1";
        String target = "a7"; // nilai n (node yang akan dicari)
        bfs(start, target);
    }
}