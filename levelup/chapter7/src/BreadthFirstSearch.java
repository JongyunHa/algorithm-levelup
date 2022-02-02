import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    static class Node {

        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                "data=" + data +
                ", lt=" + lt +
                ", rt=" + rt +
                '}';
        }
    }

    public static void Bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int L = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            System.out.print(L + " : ");
            for (int i = 0; i < length; i++) {
                Node current = queue.poll();
                System.out.println(current);
                if (current.lt != null) {
                    queue.offer(current.lt);
                }
                if (current.rt != null) {
                    queue.offer(current.rt);
                }
            }
            L++;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        Bfs(root);
    }
}
