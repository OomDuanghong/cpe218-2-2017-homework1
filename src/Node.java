public class Node {
    char data;
    public Node left;
    public Node right;

    public Node(char _data) {
        data = _data;
        left = right = null;
    }

    public String toString() {
        return String.valueOf(data);
    }
}
