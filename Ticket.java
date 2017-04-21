public class Ticket implements Comparable {
    
    private int ID;

    private int VIPLevel;

    private String problem;

    private boolean solved;

    private String name;

    private String solution;


    public Ticket(int setVIP) {
	ID = 0;
	solved = false;
    }

    public int getID() {
	return ID;
    }

    public int getVIP() {
	return VIPLevel;
    }

    public String getProblem() {
	return problem;
    }

    public boolean getSolved() {
	return solved;
    }

    public String getName() {
	return name;
    }

    public String getSolution() {
	return solution;
    }

    public int compareTo(Object a) {
	return getVIP() - ((Ticket)a).getVIP();
    }

    
}
