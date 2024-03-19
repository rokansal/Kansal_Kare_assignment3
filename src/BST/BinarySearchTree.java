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

        if (root.info == null) {
            root.info = key;
        }


    }

    public void delete(T key) {

    }

    public boolean retrieve (T item) {
        return true;
    }

    public void inOrder() {
        System.out.print("In order: ");
        
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
