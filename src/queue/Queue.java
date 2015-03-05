package queue;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue implements QueueInterface{
	
	private LinkedList<String> queue;
	public int size = -1;
	
	public Queue(int size){
		 queue = new LinkedList<String>();
	}
	public void enqueue(String input){
		if(size >= 0 || queue.size()< size){
		queue.add(input);
		}else{
			throw new Error("Queue out of bound");
		}
	}
	
	public String dequeue(){
		if(queue.size()>0){
			return queue.remove();
		}else{
			throw new Error("No element to Dequeue ");
		}
	}
	
	
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return queue.size();
	}
	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return queue.peek();
	}
	@Override
	public Iterator<String> getIterator() {
		// TODO Auto-generated method stub
		return queue.iterator();
	}
	
	
}
