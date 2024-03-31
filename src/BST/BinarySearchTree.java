package BST;

// import BST.NodeType;

public class BinarySearchTree<T extends Comparable<T>> {
    private NodeType<T> root;

    public NodeType<T> getRoot() {
        return root;
    }

    public BinarySearchTree() {
        root = new NodeType<T>();
    }

    public void insert(T key) {
        if (key == null) {
            return;
        }

        if (root == null) {
            root = new NodeType<T>(key);
            return;
        }

        if (root.info == null) {
            root.info = key;
            return;
        }

        NodeType<T> prev = null;
        NodeType<T> temp = root;
        while (temp != null) {
            prev = temp;
            if (key.compareTo(root.info) == 0) {
                System.out.println("Already in the tree.");
                return;
            }
            else if (key.compareTo(temp.info) > 0) {
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
        NodeType<T> prev = null;
        NodeType<T> temp = root;
        while (temp != null) {
            if (key.compareTo(temp.info) == 0) {
                if (temp.left == null && temp.right == null) {
                    if (prev.info.compareTo(key) < 0) {
                        prev.right = null;
                    }
                    else {
                        prev.left = null;
                    }
                } else if (temp.left == null || temp.right == null) {
                    if (temp.left == null) {
                        if (prev.info.compareTo(key) < 0) {
                            prev.right = temp.right;
                        }
                        else {
                            prev.left = temp.right;
                        }
                    }
                    else {
                        if (prev.info.compareTo(key) > 0) {
                            prev.right = temp.left;
                        }
                        else {
                            prev.left = temp.left;
                        }
                    }
                } else {
                    NodeType<T> successor = temp.right;
                    NodeType<T> prevSuccessor = temp;
                    boolean b = true;
                    while (successor.left != null) {
                        b = false;
                        prevSuccessor = successor;
                        successor = successor.left;
                    }
                    temp.info = successor.info;
                    if (b)
                        prevSuccessor.right = null;
                    else
                        prevSuccessor.left = null;
                }
                return;
            }
            prev = temp;
            if (key.compareTo(temp.info) > 0) {
                temp = temp.right;
            }
            else {
                temp = temp.left;
            }
        }
        System.out.println("Element is not in tree");
    }

    public boolean retrieve (T item) {
        if (item == null || root == null) {
            return false;
        }
        
        NodeType<T> temp = root;
        while (temp != null) {
            if (temp.info.compareTo(item) == 0) {
                return true;
            }
            if (temp.info.compareTo(item) > 0) {
                temp = temp.left;
            }
            else {
                temp = temp.right;
            }
        }
        return false;
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

    public void getSingleParent(NodeType<T> node) {
        if (node == null) {
            return;
        }
        getSingleParent(node.left);
        if ((node.left == null || node.right == null) && !(node.left == null && node.right == null)) {
            System.out.print("" + node.info + " ");
        }
        getSingleParent(node.right);
    }

    public void getNumLeafNodes() {

    }

    public void getCousins(T item) {
        System.out.println(item);
        return;
    }
}