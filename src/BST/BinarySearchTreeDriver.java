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
        BinarySearchTree<String> bst = new BinarySearchTree<>();

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

        System.out.println("Enter list type (i - int, d - double, s - std:string): ");
        userChoice = scan.nextLine();

        //tree initialization
        if (userChoice.equals("s")) {
            for (String value : vals) {
                bst.insert(value);
                System.out.println(value);
            }
        }

        boolean b = true;
        
    }
}
