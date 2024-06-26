# Kansal_Kare_assignment3

# Compiling

    - Compile and run with the command "./run.sh".
      - run.sh contains java command and by default contains int-input.txt to run with integers
      - Go into shell file and change text file name to use different text file
    - Alternatively after compiled you can use "java -cp bin BST.BinarySearchTreeDriver *inputfile here*" to run code

# Contributors
    - Yatin Kare yk72286@uga.edu
        - Constructors, NodeType, Insert, In order, Get Cousins, Get Num Leaf Nodes.
    - Rohan Kansal rk66422@uga.edu
        - Driver file, Retrieve, Delete, Get Single Parent.

# getSingleParent
    ## Psuedocode
    
    public void getSingleParent(NodeType<T> node)
      if node is null, return
      call node.left
      check if node only one of node.left and node.right is null, or that node only has one child
      call node.right

    ## Discussion
        - Recurrence Relation: T(n) = 2T(n/2) + 1. a=2, b=2, d=0, so it is in O(n)
        The complexity of this operation is O(n) because the function recursively visits every node in the tree.

# getNumLeafNodes
    ## PsuedoCode

    public int getNumLeafNodes(NodeType<T> node)
        if node is null, return 0
        if node is leaf node (both pointers are null), return 1
        return addition of recursive calls of function for node.left and node.right

    - Recurrence Relation: T(n) = 2T(n/2) + 1. a=2, b=2, d=0, so it is in O(n)
        The complexity of this operation is O(n) because the function recursively visits every node in the tree.

  ## getCousinscode
      ## PsuedoCode
  ```java
  public void printCousins(NodeType<T> temp, T item, int level)
    if level is < 2 return;
    if level is 2
      check if current node has left and right children
      if so, print respectivie children
    else if level > 2
      printCousins(node.left, item, level - 1);
      printCousins(node.right, item, level - 1);
  ```
  ```java
  public int getLevel(T item) 
    NodeType<T> node = root
    white (node != null)
      if node.info  == item
        return level
      if node.inof > item
        node = node.left;
        level++
      if node.info < item
        node = node.right
        level++
  ```

  - Total Reccurence Relation: T(n) = 2T(n/2) + 1. a = 2, b = 2, d = 0, so it is in O(n)
    - The complexity of this operation is O(n) because the function is recursively called twice for every node in the tree.


