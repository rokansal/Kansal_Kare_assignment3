package BST;

public class NodeType<T extends Comparable<T>> {
    public T info;
    public NodeType<T> left;
    public NodeType<T> right;

    public NodeType(T value) {
        info = value;
        left = null;
        right = null;
    }

    public NodeType() {
        info = null;
        left = null;
        right = null;
    }

}