import java.util.PriorityQueue;
// import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // new PriorityQueue<>(Comparator.reverseOrder()); sort in desending order
        pq.add(10);
        pq.add(40);
        pq.add(50);
        pq.add(20);

        System.out.println(pq); // [10, 20, 50, 40]
        // this is because priority queue's root is only be a small number others or not as it mainly follows binary heap

        //ChatGPT - The heap only guarantees that the root element (the first element) is the smallest, but it doesn't guarantee a complete sorted order of the entire queue.

        //peek will return only top element
        //poll will remove and return the first number and continue to next

        System.out.println(pq.peek()); //50
        System.out.println(pq.peek()); //50
        System.out.println(pq.peek()); //50

        //not 50, 40, 20

        while(!pq.isEmpty()) {
            System.out.println(pq.poll()+" "); //output - 10 20 40 50
        }
    }
}
