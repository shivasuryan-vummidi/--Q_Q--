public class Ticket implements Comparable {
    
    private int ID;

    private int VIPLevel;

    private String problem;

    private boolean solved;

    private String name;

    private String solution;

    //Constructor
    public Ticket(int setID, int setVIP, String setProblem, String setName) {
	ID = setID;
	VIPLevel = setVIP;
	problem = setProblem;
	solved = false;
	name = setName;
	solution = "";
    }

    /*****************ACCESSORS*****************/

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

    /***************END ACCESSORS***************/


    /*****************MUTATORS*****************/

    public boolean setSolved(setSolved) {
	boolean temp = getSolved();
	solved = setSolved;
	return temp;
    }

    public String setSolution(setSolution) {
	String temp = getSolution();
	solution = setSolution;
	return temp;
    }

    /***************END MUTATORS***************/

    public int compareTo(Object a) {
	return getVIP() - ((Ticket)a).getVIP();
    }

    
}
