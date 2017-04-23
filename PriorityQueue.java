public interface PriorityQueue <T extends Comparable <T>>{

    //Adds an item to this priority queue.
    public void add(T x);

    //Returns true if this stack is empty, otherwise returns false.
    public boolean isEmpty();

    //Returns the smallest item stored in this priority queue without removing it.
    public T peekMin();

    //Removes and returns the smallest item stored in this priority queue.
    public T removeMin();

}
