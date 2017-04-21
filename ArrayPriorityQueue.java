import java.util.ArrayList;
import java.lang.RuntimeException;

public class ArrayPriorityQueue implements PriorityQueue {
    
    private ArrayList<Ticket> _data;
    
    public ArrayPriorityQueue(){
	_data = new ArrayList<Ticket>();
    }
    
    public void add(Ticket x){
	_data.add(x);
    }//O(1)
    
    public boolean isEmpty(){
	return _data.size() == 0;
    }//O(1)
    
    public Ticket peekMin(){
	if (isEmpty()){
	    throw new RuntimeException();
	}
	Ticket x = _data.get(0);
	for (int i = 1; i < _data.size(); i ++){
	    Ticket curr = _data.get(i);
	    if (curr.compareTo(x) < 0){
		x = curr;
	    }
	}
	return x;
    }//O(n)
    
    public Ticket removeMin(){
	if (isEmpty()){
	    throw new RuntimeException();
	}
	Ticket x = _data.get(0);
	int index = 0;
	for (int i = 1; i < _data.size(); i ++){
	    if (_data.get(i).compareTo(x) < 0){
		x = _data.get(i);
		index = i;
	    }
	}
	_data.remove(index);
	return x;
    }//O(n)
    
    public String toString(){
	return _data.toString();
    }
    
    public static void main(String[] args){
	ArrayPriorityQueue bob = new ArrayPriorityQueue();
	bob.add(new Ticket(0));
	System.out.println(bob);
	bob.add(new Ticket(1));
	System.out.println(bob);
	bob.add(new Ticket(2));
	System.out.println(bob);
	System.out.println( bob.removeMin() );
	System.out.println(bob);
    }

}
