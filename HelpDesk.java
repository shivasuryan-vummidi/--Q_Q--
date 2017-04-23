public class HelpDesk {
    
    private ArrayPriorityQueue _data;
    private int ticketCounter = 0;

    public HelpDesk() {
	_data = new ArrayPriorityQueue();
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
	System.out.println( h );
	System.out.println( h.removeTicket() );
	System.out.println( h.removeTicket() );
	System.out.println( h );
    }
}
