#! /bin/bash -ex
javac -d bin src/BST/NodeType.java
javac -d bin -cp bin src/BST/BinarySearchTree.java
javac -d bin -cp bin src/BST/BinarySearchTreeDriver.java
java -cp bin BST.BinarySearchTreeDriver string-input.txt