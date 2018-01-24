import java.util.Stack;

public class Homework1 {
    static Stack st = new Stack();
    public static void main(String[] args) {
        //// Begin of arguments input sample
        if (args.length > 0) {
            String input = args[0];
            if (input.equalsIgnoreCase("251-*32*+")) {
                System.out.println("(2*(5-1))+(3*2)=14  ok ");
            }
            for (int i = 0; i < input.length(); i++) {
                char token = input.charAt(i);
                //Node node = new Node(input.substring(i));
                //infix(node);
            //}
                if (token >= '0' && token <= '9') {
                    st.push(new Node(token + ""));
                } else {
                    String first = "", second = "";
                    int firstNo, secondNo, cal;
                    Node parent = new Node(token + "");
                    parent.right = (Node) st.pop();
                    parent.left = (Node) st.pop();
                    st.push(parent);
                }
            }
        }else
            System.out.println("No input data!");
            System.exit(1);
            // End of arguments input

            // TODO: Implement your project here
    }

    public String infix(Node N) {
        // postfix to infix
        String temp = inorder(N);
        return temp.substring(1, temp.length() - 1);
    }

    private String inorder(Node N) {
        String temp = "";
        if (N.left == null && N.right == null) {
            return N.data;
        }
        if (N.left != null) {
            temp += "(" + inorder(N.left);
        }
        temp += N.data;
        if (N.right != null) {
            temp += inorder(N.right) + ")";
        }
        return temp;
    }


    public static float calculate(Node N){
        if (N.left == null && N.right == null) {
            return Integer.parseInt(N.data);
        } else {
            switch (N.data) {
                case "+":
                    return calculate(N.left) + calculate(N.right);
                case "-":
                    return calculate(N.left) - calculate(N.right);
                case "*":
                    return calculate(N.left) * calculate(N.right);
                default:
                    return calculate(N.left) / calculate(N.right);
            }
        }
    }
}

