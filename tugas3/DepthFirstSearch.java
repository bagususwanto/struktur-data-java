
import java.util.*;

public class DepthFirstSearch {
    static Map<String, List<String>> graph = new HashMap<>();
    static Set<String> visited = new HashSet<>();

    public static void dfs(String current, String target) {
        System.out.println("Mengunjungi: " + current);
        if (current.equals(target)){
            System.out.println("Node ditemukan: " + target);
            return;
        }

        visited.add(current);
        for (String neighbor : graph.get(current)) {
            if(!visited.contains(neighbor)) {
                dfs(neighbor, target);
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
        dfs(start, target);
    }
}