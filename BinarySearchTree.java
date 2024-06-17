import java.util.Scanner;

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class BinarySearchTree
{
    Node root;
    public void insert(int data)
    {
        root = insertNode(root,data);
    }

    public Node insertNode(Node root , int data)
    {
        if(root==null)
        {
                return new Node(data);
        }

        if(data<root.data)
        {
            root.left = insertNode(root.left,data);
        }
        else
        {
            root.right = insertNode(root.right,data);
        }

        return root;
    }

    public void inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        else
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public void search(Node root ,int searchElement)
    {
        if(root == null)
        {
            System.out.println("Element not found");
            return;
        }
        if(searchElement == root.data)
        {
            System.out.println("Element founded");
            return;
        }
        else if(searchElement<root.data)
        {
            search(root.left,searchElement);
        }
        else if(searchElement>root.data)
        {
            search(root.right,searchElement);
        }
    }

    public int findMin(Node root)
    {
        if(root==null)
        {
            System.out.println("No tree exists");
        }
        else if(root.left==null)
        {
            return root.data;
        }
        return findMin(root.left);
    }

    public int findMax(Node root)
    {
        if(root==null)
        {
            System.out.println("No tree exists");
        }
        else if(root.right==null)
        {
            return root.data;
        }
        return findMin(root.right);
    }

    public int height(Node root)
    {
        if(root == null)
        {
            return -1;
        }
        else
        {
            int leftHeight = height(root.left); 
            //System.out.println("Left height: " + leftHeight);
            int rightHeight = height(root.right);
            //System.out.println("Right height: " + rightHeight);
            return (int)Math.max(leftHeight,rightHeight)+1;
        }
    }
}

class Tree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int n;
        while(true)
        {
            n = sc.nextInt();
            if(n==-1)
            {
                break;
            }
            bst.insert(n);
        }

        //inorder traversal
        bst.inorder(bst.root);

        //search
        System.out.println();
        System.out.println("Enter the element to be found: ");
        int searchElement = sc.nextInt();
        bst.search(bst.root , searchElement);

        //minimum element
        System.out.println("Minimum element: " + bst.findMin(bst.root));

        //maximum element
        System.out.println("Maximum element: " + bst.findMax(bst.root));

        //height of the tree
        System.out.print("Height of the tree: " + bst.height(bst.root));
    }
}