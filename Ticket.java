public class Ticket implements Comparable<Ticket> {
    
    private int _ID;

    private int _VIPLevel;

    private String _problem;

    private String _name;

    private String _solution;

    //Constructor
    public Ticket(int setID, int setVIP, String setProblem, String setName) {
	_ID = setID;
	_VIPLevel = setVIP;
	_problem = setProblem;
	_name = setName;
	_solution = "";
    }

    /*****************ACCESSORS*****************/

    public int getID() {
	return _ID;
    }

    public int getVIP() {
	return _VIPLevel;
    }

    public String getProblem() {
	return _problem;
    }

    public String getName() {
	return _name;
    }

    public String getSolution() {
	return _solution;
    }

    /***************END ACCESSORS***************/


    /*****************MUTATORS*****************/

    public void setSolution(String solution) {
	_solution = solution;
    }

    /***************END MUTATORS***************/

    public int compareTo(Ticket a) {
	return getVIP() - a.getVIP();
    }

    public String toString() {
	return "\nTicket " + getID() + "\nName: " + getName();
    }

    
}
