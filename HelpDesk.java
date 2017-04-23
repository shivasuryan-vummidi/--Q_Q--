import java.io.*;
import java.util.*;
public class HelpDesk {
    
    private ArrayPriorityQueue _data;
    private int ticketCounter = 0;
	private InputStreamReader isr;
    private BufferedReader in;
	
    public HelpDesk() {
		_data = new ArrayPriorityQueue();
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
    }
	public void session(){
		System.out.println("=---HELP DESK---\n");
		String solution = "";
		while (isEmpty() == false){
			Ticket a = peekTicket();
			System.out.println("Problem for user " + a.getName() + ": " + a.getProblem() + "\n");
			try{
				solution = in.readLine();
				a.setSolved();
			}
			catch(Exception e){
				solution = "N/A";
			}
			a.setSolution(solution);
			System.out.println(a + "\n"); //DEBUG
			removeTicket();
		}
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

    public static void main( String[] args ) {
		HelpDesk h = new HelpDesk();
		h.addTicket( new Ticket(0, 1, "malfunction", "Ryan") );
		h.addTicket( new Ticket(1, 0, "error", "Joe") );
		h.session();
		/*
		System.out.println( h );
		System.out.println( h.removeTicket() );
		System.out.println( h.removeTicket() );
		System.out.println( h );
		*/
    }
}
