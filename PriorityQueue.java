public interface PriorityQueue {

    //Adds an item to this priority queue.
    public void add(Ticket x);

    //Returns true if this stack is empty, otherwise returns false.
    public boolean isEmpty();

    //Returns the smallest item stored in this priority queue without removing it.
    public Ticket peekMin();

    //Removes and returns the smallest item stored in this priority queue.
    public Ticket removeMin();

}
