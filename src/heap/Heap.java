package heap;

import java.util.ArrayList;

public abstract class Heap {
	
ArrayList<Integer> heap;
	
	int size ;
	
	
	public Heap(){
		heap = new ArrayList<Integer>();
		size = 100; //Arraylist defaults to size 100
		
	}
	
	public Heap(int size){
		heap = new ArrayList<Integer>(size);
		this.size = size;
		
	}
	
	public void insert(int input) throws Exception{
		if(size < heap.size()+1){
			throw new Exception("Heap Full");
		}
		
		heap.add(input);
		siftUp();
		
	}
	
	public void printHeap(){
		System.out.println(heap.toString());
	}
	
	
	protected abstract void siftUp();
	
	public int size(){
		return heap.size();
	}
	
	

	protected boolean isEmpty(){
		return heap.size()==0?true:false;
	}
	
	protected abstract void siftDown();
	
	public int delete() throws Exception{
		if(heap.size()==0){
			throw new Exception("Heap Empty"); 
		}
		int item = heap.get(0); // hold the item
		heap.set(0,heap.get(heap.size()-1)); // swap the last node to root
		heap.remove(heap.size()-1); // remove the last node
		siftDown();
		return item;
	}
	/**
	 * @param currentIndex
	 */
	protected void swap(int currentIndex, int swapIndex) {
		int temp = heap.get(currentIndex);
		heap.set(currentIndex,heap.get(swapIndex)) ;
		heap.set(swapIndex, temp);
	}


}
