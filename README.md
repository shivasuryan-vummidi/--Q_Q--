# Ticket implements Comparable
Instance Variables
- `int ID` //Unique ID number for each ticket
- `int VIPLevel` //Priority level - 0 being the highest priotity
- `String problem` //Describes problem
- `boolean solved`//Denotes whether problem has been solved
- `String name` //Name of user who created Ticket
- `String solution` //Solution to problem

Methods
- 'int compareTo(Ticket a)' //returns positive in if calling Ticket is larger than Ticket a


# ArrayPriorityQueue<T> implements PriorityQueue<T>
Instance Variables
- `ArrayList<T> data` //Stores an ArrayList of object Type T

Methods from PriorityQueue<T>
- `void add(T x)` //Adds an item to this priority queue
- `boolean isEmpty()` //Returns true if empty
- `T peekMin()` //Returns the smallest item stored in this priority queue without removing it
- `T removeMin()` //Removes and returns the smallest item stored in this priority queue.



# HelpDesk.java - not Finished 

- `int ticketBeingProcessed //For ID tracking`
- `Ticket[] PQ //Holds a priority queue of tickets`
