import java.util.*;

class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    Node head;
    public void insert(int data) //insert at beginning
    {
       Node newNode = new Node(data); 
       if(head==null)
       {
        head = newNode;
       }
       else
       {
        newNode.next = head;
        head = newNode;
       }
    }

    public void display()
    {
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int n;
        while(true)
        {
            n = sc.nextInt();
            ll.insert(n);
            if(n==-1)
            {
                break;
            }
        }
        ll.display();
    }
}