import java.io.*;
import java.util.*;

public class HelpDesk {
    
    private ArrayPriorityQueue<Ticket> _data;
    private InputStreamReader isr;
    private BufferedReader in;
    private boolean _running;
	
    public HelpDesk() {
	_data = new ArrayPriorityQueue<Ticket>();
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	_running = true;
    }
    
    public void addTicket( Ticket issue ){
	_data.add( issue );
    }

    public boolean isEmpty() {
	return _data.isEmpty();
    }

    public Ticket peekTicket() {
	return _data.peekMin();
    }

    public Ticket removeTicket() {
	return _data.removeMin();
    }

    public String toString() {
	return _data.toString();
    }

    public void session(){
	System.out.println("Enter 0 to view all tickets, 1 to quit, or anything else to handle a ticket.");
	System.out.print(">> ");

	String mode = "";
	try {
	    mode = in.readLine();
	}
	catch(IOException e){ }

	System.out.println();
	if ( mode.equals("0") ) {
	    System.out.println( this + "\n" );
	    return;
	} else if ( mode.equals("1") ) {
	    _running = false;
	    return;
	}
		    
	Ticket a = peekTicket();
	System.out.println("TICKET");
	System.out.println("User: " + a.getName() + "\nProblem: " + a.getProblem() + "\n");

	String solution = "";
	while ( solution.equals("") ) {
	    
	    System.out.println("Solution");
	    System.out.print(">> ");
	    try {
		solution = in.readLine();
		a.setSolution(solution);
	    }
	    catch(IOException e){ }
	    
	}

	System.out.println( "\nThe following ticket has been resolved." );
	System.out.println("TICKET " + a.getID() + "\nName: " + a.getName() +
			   "\nProblem: " + a.getProblem() + "\nSolution: " +
			   a.getSolution() + "\n");
	removeTicket();

	if ( isEmpty() ) {
	    _running = false;
	}
    }

    public static void main( String[] args ) {
	HelpDesk h = new HelpDesk();
	h.addTicket( new Ticket(0, 5, "Computer froze.", "Ryan") );
	h.addTicket( new Ticket(1, 3, "My screen suddenly turned blue. Help!", "Joe") );
	h.addTicket( new Ticket(2, 0, "Is there supposed to be smoke coming out of my phone?", "Bob") );

	System.out.println("\n--------- HELP DESK APP v1 ---------");
	System.out.println("by Ryan, Shiva, and Clive\n");
	while (h._running){
	    h.session();
	}

	if ( h.isEmpty() ) {
	    System.out.println("All the tickets have been resolved.");
	} else {
	    System.out.println("User aborted program.");
	}
	System.out.println("------------------------------------");
    }
}
