/**
 * Created by oom on 23/1/2018 AD.
 */
public class Node{
    public String data;
    public Node left;
    public Node right;

    public Node(){
        this.data = "";
        this.left = null;
        this.right = null;
    }

    public Node(String input){
        this.data = input;
    }

    public Node(Node Left, Node Right, String data){
        this.left  = Left;
        this.right = Right;
        this.data  = data;
    }
}
