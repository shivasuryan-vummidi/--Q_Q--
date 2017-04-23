# Ticket implements Comparable
- Instance Variables
- `int ID //Unique ID number for each ticket
- `int VIPLevel //Priority level - 0 being the highest priotity
- `String problem //Describes problem
- `boolean solved`//Denotes whether problem has been solved
- `String name` //Name of user who created Ticker
- `String solution` //Solution to problem

- Methods
- int compareTo(Ticket a) //returns positive in if calling Ticket is larger than Ticket a




# HelpDesk.java
- `int ticketBeingProcessed //For ID tracking`
- `Ticket[] PQ //Holds a priority queue of tickets`
