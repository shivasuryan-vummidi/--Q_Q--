# (insert team name)
APCS2 pd5
<br>
Ryan Siu, Shiva Vummidi, Clive Johnston

## Description
This project simulates a help desk app by asking the user (presumably an employee) to request tickets to resolve, and then giving them the next highest priority ticket and recording their solutions to the problem. This ticket is then removed from the priority queue. A visual representation of this process can be found [here](https://github.com/shivasuryan-vummidi/DABS-A-NIIIICE/blob/master/HelpDesk.pdf).

## Design
With the goals of simplicity, reliability, and sensibility in mind, we wanted to set a clear role for each of our classes.

  Class                   | Purpose
  ----------------------- | ----------------------------------------------------------
  PriorityQueue.java      | Contains the interface for ```ArrayPriorityQueue.java```. Modeled off of the API page for PriorityQueues.
  ArrayPriorityQueue.java | Provides an ArrayPriorityQueue data structure.
  Ticket.java             | Models a help desk request.
  HelpDesk.java           | Simulate a help desk application.
  
While there wasn't much space for design decisions in the ```PriorityQueue``` and ```Ticket``` classes, we did have to plan out the 
other two classes. We decided to go with an ArrayPriorityQueue that enqueues by adding an element to the end, and dequeues by iterating through the underlying ArrayList and removing the element with the minimum value. While the binary search and insertion method might be [faster](https://groups.google.com/a/stuy.edu/forum/?utm_source=digest&utm_medium=email#!category-topic/apcs16-17/ai_Dom-kUik), the runtimes are equivalent (both are O(1) for either enqueueing or dequeueing and O(1) for the other), and our method is simpler to implement.

In the ```HelpDesk``` class, we decided to write wrapper methods for editing the **private** ArrayPriorityQueue that holds the Tickets. This provides us with more flexibility in using the HelpDesk class; if, for example, we wanted to create a Customer class that can add Tickets, we could use the public wrapper method in our HelpDesk class to do so. Without this method, the private ArrayPriorityQueue couldn't be accessed outside the HelpDesk class.

## Embellishments
 - We used InputStreamReader and BufferedReader to get user input in the terminal via prompts in our HelpDesk class. 
 - With [help](https://groups.google.com/a/stuy.edu/forum/?utm_source=digest&utm_medium=email#!category-topic/apcs16-17/aV5QNleukaw) from Gilvir, we were able to generically type our ArrayPriorityQueue to work with all classes that implement Comparable.  
 - We added wrapper methods to HelpDesk, as explained above.
