import java.util.*;

public class Diskusi4 {

    static final int NODE_COUNT = 5;

    // Adjacency Matrix
    static int[][] adjMatrix = new int[NODE_COUNT + 1][NODE_COUNT + 1]; // +1 biar bisa akses dari index 1

    // Adjacency List
    static List<Integer>[] adjList = new ArrayList[NODE_COUNT + 1];

    public static void main(String[] args) {
        initGraph();

        System.out.println("Adjacency Matrix:");
        printAdjMatrix();

        System.out.println("\nAdjacency List:");
        printAdjList();

        System.out.println("\nDFS traversal from Node 1 to Node 5:");
        boolean[] visited = new boolean[NODE_COUNT + 1];
        dfs(1, 5, visited, new ArrayList<>());
    }

    static void initGraph() {
        // Inisialisasi list kosong di setiap node
        for (int i = 1; i <= NODE_COUNT; i++) {
            adjList[i] = new ArrayList<>();
        }

        // Tambahkan edge sesuai dengan soal
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(3, 4);
        addEdge(3, 5);
        addEdge(4, 5);
    }

    static void addEdge(int from, int to) {
        // Untuk adjacency matrix
        adjMatrix[from][to] = 1;

        // Untuk adjacency list
        adjList[from].add(to);
    }

    static void printAdjMatrix() {
        for (int i = 1; i <= NODE_COUNT; i++) {
            for (int j = 1; j <= NODE_COUNT; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printAdjList() {
        for (int i = 1; i <= NODE_COUNT; i++) {
            System.out.print("Node " + i + ": ");
            for (int neighbor : adjList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    static void dfs(int current, int target, boolean[] visited, List<Integer> path) {
        visited[current] = true;
        path.add(current);

        if (current == target) {
            System.out.println("Path: " + path);
            return;
        }

        for (int neighbor : adjList[current]) {
            if (!visited[neighbor]) {
                dfs(neighbor, target, visited, new ArrayList<>(path));
            }
        }
    }
}
