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
    public void insertAtBeginning(int data) //Reverse insert 5 4 3 2 1
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

    Node tail;

    public void insertAtEnd(int data) //1 2 3 4 5
    {
       Node newNode = new Node(data); 
       if(head==null)
       {
        head = newNode;
        tail = newNode;
       }
       else
       {
        tail.next = newNode;
        tail = newNode;
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
            if(n==-1)
            {
                break;
            }
            //ll.insertAtBeginning(n);
            ll.insertAtEnd(n);
        }
        ll.display();
    }
}