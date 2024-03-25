package BST;

import BST.NodeType;

public class BinarySearchTree<T extends Comparable<T>> {
    private NodeType<T> root;

    public BinarySearchTree() {
        root = new NodeType<T>();
    }

    public void insert(T key) {
        if (key == null) {
            return;
        }

        if (root == null) {
            root = new NodeType<T>(key);
        }

        if (root.info == null) {
            root.info = key;
        }

        NodeType<T> prev = null;
        NodeType<T> temp = root;
        while (temp != null) {
            prev = temp;
            if (key.compareTo(root.info) == 0) {
                System.out.println("Already in the tree.");
                return;
            }
            else if (key.compareTo(root.info) > 0) {
                temp = temp.right;
            }
            else {
                temp = temp.left;
            }
        }

        if (key.compareTo(prev.info) < 0) {
            prev.left = new NodeType<>(key);
        }
        else {
            prev.right = new NodeType<>(key);
        }
    }

    public void delete(T key) {

    }

    public boolean retrieve (T item) {
        return true;
    }

    public void inOrder() {
        System.out.print("In order: ");
        iterate(root);
        System.out.print("\n");
    }

    public void iterate(NodeType<T> node) {
        if (node == null || node.info == null) {
            return;
        }

        iterate(node.left);
        System.out.print("" + node.info + " ");
        iterate(node.right);

    }

    public void getSingleParent() {

    }

    public void getNumLeafNodes() {

    }

    public void getCousins(T item) {
        System.out.println(item);
        return;
    }
}
