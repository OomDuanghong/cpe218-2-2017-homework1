import java.util.Stack;
import javax.swing.*;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import java.net.URL;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Homework1 extends JPanel implements TreeSelectionListener {
    private static Stack<Node> st = new Stack<>();
    private JEditorPane htmlPane;
    private JTree tree;

    private Homework1(Node n) {
        super(new GridLayout(1,0));

        DefaultMutableTreeNode top = new DefaultMutableTreeNode(n);
        createNodes(top);

        //Create a tree that allows one selection at a time.
        tree = new JTree(top);
        java.net.URL img = Homework1.class.getResource("middle.gif");
        ImageIcon icon = new ImageIcon(img);
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setOpenIcon(icon);
        renderer.setClosedIcon(icon);
        tree.setCellRenderer(renderer);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        //Listen for when the selection changes.
        tree.addTreeSelectionListener(this);
        tree.putClientProperty("JTree.lineStyle", "None");
        //Create the scroll pane and add the tree to it.
        JScrollPane treeView = new JScrollPane(tree);

        //Create the HTML viewing pane.
        htmlPane = new JEditorPane();
        htmlPane.setEditable(false);
        JScrollPane htmlView = new JScrollPane(htmlPane);
        //Add the scroll panes to a split pane.
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPane.setTopComponent(treeView);
        splitPane.setBottomComponent(htmlView);

        Dimension minimumSize = new Dimension(100, 50);
        htmlView.setMinimumSize(minimumSize);
        treeView.setMinimumSize(minimumSize);
        splitPane.setDividerLocation(100);
        splitPane.setPreferredSize(new Dimension(500, 300));

        //Add the split pane to this panel.
        add(splitPane);
        }

        public static void main(String[] args) {
            if (args.length > 0) {
                String input = args[0];
                Node node;
                Node root = null;


                for (int i = 0; i < input.length(); i++) {
                    node = new Node(input.charAt(i));
                    infix(node);
                    root = node;
                }


                Node finalRoot = root;
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        createAndShowGUI(finalRoot);
                    }
                });
            }
        } //end main


        private static void infix(Node n) {

            if(Character.isDigit(n.data))
                st.push(n);
            else {
                n.right = st.pop();
                n.left = st.pop();
                st.push(n);
            }
    } //end infix

        private static String inorder(Node n){
            String temp = "";
            if (!Character.isDigit(n.data) && n != st.peek()) temp += '(';
                if (n.left != null) temp += inorder(n.left);
                temp += n.data;
                if (n.right != null) temp += inorder(n.right);
            if (!Character.isDigit(n.data) && n != st.peek()) temp += ')';
            return temp;
        } //end inorder

        private static float calculate(Node N){
            switch (N.data) {
                case '+':
                    return calculate(N.left) + calculate(N.right);
                case '-':
                    return calculate(N.left) - calculate(N.right);
                case '*':
                    return calculate(N.left) * calculate(N.right);
                case '/':
                    return calculate(N.left) / calculate(N.right);
                default:
                    return Character.getNumericValue(N.data);
            }
        } //end calculate
        public void valueChanged(TreeSelectionEvent e){
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
            Node temp = (Node) node.getUserObject();
            st.push(temp);
            String text = inorder(temp);
            if (text.length() > 1) {
                text += '=';
                float x = calculate(temp);
                if (x == (int) x) text += (int) x;
                else text += x;
            }
            st.pop();
            htmlPane.setText(text);
        }
        private void createNodes (DefaultMutableTreeNode top){
            DefaultMutableTreeNode temp;
            Node node = (Node) top.getUserObject();
            if (node.left != null) {
                temp = new DefaultMutableTreeNode(node.left);
                top.add(temp);
                createNodes(temp);
            }
            if (node.right != null) {
                temp = new DefaultMutableTreeNode(node.right);
                top.add(temp);
                createNodes(temp);
            }
        }
        private static void createAndShowGUI(Node node){
            //Create and set up the window.
            JFrame frame = new JFrame("Binary Tree Calculator");

            frame.add(new Homework1(node));
            frame.pack();

            frame.setVisible(true);
        }

}