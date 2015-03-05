package queue;

import java.util.Iterator;

public interface QueueInterface {
	
	public void enqueue(String input);
	public String dequeue();
	public int getSize();
	public String peek();
	public Iterator<String> getIterator();

}
