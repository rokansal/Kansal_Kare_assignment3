package BST;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import BST.BinarySearchTree;
import BST.NodeType;

public class BinarySearchTreeDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userChoice = "";
        boolean b = true;

        //file input
        String filename = args[0];
        Scanner sc = new Scanner(System.in);
        try {
            sc = new Scanner(new File("resources/" + filename));
        } catch(FileNotFoundException fne) {
            fne.printStackTrace();
        }
        String inputValues = sc.nextLine();
        String[] vals = inputValues.split(" ");
        sc.close();

        System.out.print("Enter list type (i - int, d - double, s - std:string): ");
        userChoice = scan.nextLine();

        //tree initialization
        if (userChoice.equals("s")) {
            BinarySearchTree<String> bst = new BinarySearchTree<>();
            for (String value : vals) {
                bst.insert(value);
            }
            while (b) {
                System.out.println("\nCommands:\n(i) - Insert Item \n(d) - Delete Item \n(p) - Print Tree \n(r) - Retrieve Item \n(l) - Count Leaf Nodes \n(s) - Find Single Parents \n(c) - Find Cousins \n(q) - Quit program ");
                userChoice = scan.nextLine();
                if (userChoice.equals("q")) {
                    b = false;
                } else if (userChoice.equals("i")) {
                    bst.inOrder();
                    System.out.print("Enter a string to insert: ");
                    bst.insert(scan.nextLine());
                    bst.inOrder();
                } else if (userChoice.equals("d")) {
                    bst.inOrder();
                    System.out.print("Enter a string to delete: ");
                    bst.delete(scan.nextLine());
                    bst.inOrder();
                } else if (userChoice.equals("p")) {
                    bst.inOrder();
                } else if (userChoice.equals("r")) {
                    bst.inOrder();
                    System.out.print("Enter a string to search: ");
                    if (bst.retrieve(scan.nextLine())) {
                        System.out.println("Item is present in the tree. ");
                    } else {
                        System.out.println("Item is not present in the tree. ");
                    }
                } else if (userChoice.equals("l")) {
                    System.out.print("The number of leaf nodes are ");
                    bst.getNumLeafNodes();
                } else if (userChoice.equals("s")) {
                    System.out.print("Single Parents: ");
                    bst.getSingleParent(bst.getRoot());
                    System.out.println();
                } else if (userChoice.equals("c")) {
                    bst.inOrder();
                    System.out.println("Enter a string: ");
                    String s = scan.nextLine();
                    System.out.print(s + " cousins");
                    bst.getCousins(s);
                } else {
                    System.out.println("Invalid choice. Please try again. ");
                }
            }
        } else if (userChoice.equals("i")) {
            BinarySearchTree<Integer> bst = new BinarySearchTree<>();
            for (String value : vals) {
                bst.insert(Integer.parseInt(value));
            }
            while (b) {
                System.out.println("Commands:\n(i) - Insert Item \n(d) - Delete Item \n(p) - Print Tree \n(r) - Retrieve Item \n(l) - Count Leaf Nodes \n(s) - Find Single Parents \n(c) - Find Cousins \n(q) - Quit program ");
                userChoice = scan.nextLine();
                if (userChoice.equals("q")) {
                    b = false;
                } else if (userChoice.equals("i")) {
                    bst.inOrder();
                    System.out.print("Enter an integer to insert: ");
                    bst.insert(Integer.parseInt(scan.nextLine()));
                    bst.inOrder();
                } else if (userChoice.equals("d")) {
                    bst.inOrder();
                    System.out.print("Enter an integer to delete: ");
                    bst.delete(Integer.parseInt(scan.nextLine()));
                    bst.inOrder();
                } else if (userChoice.equals("p")) {
                    bst.inOrder();
                } else if (userChoice.equals("r")) {
                    bst.inOrder();
                    System.out.print("Enter an integer to search: ");
                    if (bst.retrieve(Integer.parseInt(scan.nextLine()))) {
                        System.out.println("Item is present in the tree. ");
                    } else {
                        System.out.println("Item is not present in the tree. ");
                    }
                } else if (userChoice.equals("l")) {
                    System.out.print("The number of leaf nodes are ");
                    bst.getNumLeafNodes();
                } else if (userChoice.equals("s")) {
                    System.out.print("Single Parents: ");
                    bst.getSingleParent(bst.getRoot());
                } else if (userChoice.equals("c")) {
                    bst.inOrder();
                    System.out.println("Enter an integer: ");
                    Integer s = Integer.parseInt(scan.nextLine());
                    System.out.print(s + " cousins");
                    bst.getCousins(s);
                } else {
                    System.out.println("Invalid choice. Please try again. ");
                }
            }

        } else if (userChoice.equals("d")) {
            BinarySearchTree<Double> bst = new BinarySearchTree<>();
            for (String value : vals) {
                bst.insert(Double.parseDouble(value));
            }
            while (b) {
                System.out.println("Commands:\n(i) - Insert Item \n(d) - Delete Item \n(p) - Print Tree \n(r) - Retrieve Item \n(l) - Count Leaf Nodes \n(s) - Find Single Parents \n(c) - Find Cousins \n(q) - Quit program ");
                userChoice = scan.nextLine();
                if (userChoice.equals("q")) {
                    b = false;
                } else if (userChoice.equals("i")) {
                    bst.inOrder();
                    System.out.print("Enter a double to insert: ");
                    bst.insert(Double.parseDouble(scan.nextLine()));
                    bst.inOrder();
                } else if (userChoice.equals("d")) {
                    bst.inOrder();
                    System.out.print("Enter a double to delete: ");
                    bst.delete(Double.parseDouble(scan.nextLine()));
                    bst.inOrder();
                } else if (userChoice.equals("p")) {
                    bst.inOrder();
                } else if (userChoice.equals("r")) {
                    bst.inOrder();
                    System.out.print("Enter a double to search: ");
                    if (bst.retrieve(Double.parseDouble(scan.nextLine()))) {
                        System.out.println("Item is present in the tree. ");
                    } else {
                        System.out.println("Item is not present in the tree. ");
                    }
                } else if (userChoice.equals("l")) {
                    System.out.print("The number of leaf nodes are ");
                    bst.getNumLeafNodes();
                } else if (userChoice.equals("s")) {
                    System.out.print("Single Parents: ");
                    bst.getSingleParent(bst.getRoot());
                } else if (userChoice.equals("c")) {
                    bst.inOrder();
                    System.out.println("Enter a double: ");
                    Double s = Double.parseDouble(scan.nextLine());
                    System.out.print(s + " cousins");
                    bst.getCousins(s);
                } else {
                    System.out.println("Invalid choice. Please try again. ");
                }
            }

        } else {
            System.out.println("Invalid data type");
        }
    }
}
