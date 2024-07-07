import java.util.*;

class Graph
{
    ArrayList<ArrayList<Integer>> l = new ArrayList<>();
    public Graph(int v)
    {
        for(int i=0;i<v;i++)
        {
            l.add( new ArrayList<Integer>() );
        }
    }

    public void addEdge(int u , int v)
    {
        l.get(u).add(v);
        l.get(v).add(u);
    }

    public void display()
    {
        for(int i=0;i<l.size();i++)
        {
            System.out.println("Element in list: " + 0);
            for(int j=0;j<l.get(i).size();j++)
            {
                System.out.println(l.get(i).get(j));
            }
        }
    }
}


class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,4);

        g.display();
    }
}