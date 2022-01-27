import java.nio.file.Path;

public class BinaryTreeSearch {

    static class Node {

        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

    public static void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.println("root.data = " + root.data); // 전위 순회
            DFS(root.lt);
            System.out.println("root.data = " + root.data); // 중위 순회
            DFS(root.rt);
            System.out.println("root.data = " + root.data); // 후위 순회
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
        DFS(root);
    }

}
