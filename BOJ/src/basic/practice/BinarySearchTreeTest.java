package basic.practice;

/**
 * 이진 탐색 트리 예제
 * 엔지니어대한민국님 유튜브 영상 참고(https://youtu.be/9ZZbA2iPjtM)
 */
public class BinarySearchTreeTest {
    static class Tree {
        class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
            }
        }
        Node root;

        public void makeTree(int[] a) {
            root = makeTreeR(a, 0, a.length - 1);
        }

        public Node makeTreeR(int[] a, int start, int end) {
            if (start > end) return null;
            int mid = (start + end) / 2;
            Node node = new Node(a[mid]);
            node.left = makeTreeR(a, start, mid - 1);
            node.right = makeTreeR(a, mid + 1, end);
            return node;
        }

        public void searchBTree(Node n, int find) {
            if (find < n.data) {
                System.out.println("Data is smaller than " + n.data);
                searchBTree(n.left, find);
            } else if (find > n.data) {
                System.out.println("Data is bigger than " + n.data);
                searchBTree(n.right, find);
            } else {
                System.out.println("Data found!");
            }
        }
    }
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        Tree t = new Tree();
        t.makeTree(a);
        t.searchBTree(t.root, 8);
    }
}
