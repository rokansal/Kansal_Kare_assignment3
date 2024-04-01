# Kansal_Kare_assignment3

# Compiling

    - Compile and run with the command "./run.sh".
      - run.sh contains java command and by default contains int-input.txt to run with integers
      - Go into shell file and change text file name to use different text file
    - Alternatively after compiled you can use java -cp bin BST.BinarySearchTreeDriver *inputfile here* to run code

# Contributors
    - Yatin Kare yk72286@uga.edu
        - Constructors, NodeType, Insert, In order, Get Cousins, Get Num Leaf Nodes.
    - Rohan Kansal rk66422@uga.edu
        - Driver file, Retrieve, Delete, Get Single Parent.

# getSingleParent(NodeType<T> node)
    ## Psuedocode
      if node is null, return

      call node.left
      
      check if node only one of node.left and node.right is null, or that node only has one child
      
      call node.right

    ## Discussion
        - Recurrence Relation: T(n) = T(n-1) + 1. a=1, b=1, d=0, so it is in O(n)
        The complexity of this operation is O(n) because the function recursively visits every node in the tree.

# getNumLeafNodes
    ## PsuedoCode

    intersection()
        String Array [] with all values of user numbers
        NodeType n = head
        String final list;

        for each num in array:
            if this.search(num) > 0
                final list += num

#getCousins


    ## Discussion
        The complexity of this operations is O(n) because the string array, temp node, and string of final list are all constant time operations. There is a for loop that loops over each num in the array, n times and a if condition is ran n times. The statement inside the if conditional is a constant time operation. Overall this means that the total time complexity falls under O(n)
