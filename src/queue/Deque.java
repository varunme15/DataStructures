package queue;

import java.util.Iterator;
import java.util.LinkedList;



public class Deque implements QueueInterface {

	LinkedList<String> deque = new LinkedList<String>();
	
	@Override
	public void enqueue(String input) {
		deque.add(input);

	}

	public void enqueueFirst(String input) {
		deque.addFirst(input);

	}

	public void enqueueLast(String input) {
		deque.addLast(input);

	}
	
	
	
	@Override
	public String dequeue() {
		// TODO Auto-generated method stub
		return deque.remove();
	}

	
	public String dequeueFirst() {
		// TODO Auto-generated method stub
		return deque.removeFirst();
	}
	
	public String dequeueLast() {
		// TODO Auto-generated method stub
		return deque.removeLast();
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return deque.size();
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return deque.getFirst();
	}
	
	public String peekLast() {
		// TODO Auto-generated method stub
		return deque.getLast();
	}
	
	@Override
	public Iterator<String> getIterator() {
		// TODO Auto-generated method stub
		return deque.iterator();
	}

}
