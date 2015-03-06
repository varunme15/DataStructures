package heap;

public class MaxHeap extends Heap {
	
	
	
	public MaxHeap(){
		super();
		
	}
	
	public MaxHeap(int size){
		super(size);
		
	}
	
	
	
	protected void siftUp() { //manages the heap property while insertion
		int currentIndex = heap.size() - 1; 
		
		while(currentIndex > 0){
			int parentIndex = (currentIndex - 1)/2;
			int item = heap.get(currentIndex);
			int parent = heap.get(parentIndex);
			if(item > parent){
				swap(parentIndex,currentIndex);
				currentIndex = parentIndex;
			}else{
				break;
			}
			
		}
	}
	
	
	
	protected void siftDown() { //manages the heap property while delete
		
		int parent = 0;
		int child = 2 * parent + 1;
		while(child < heap.size()){
			 
			int max = child;
			int rChild = max + 1;
			if(rChild<heap.size()){
				if(heap.get(max)< heap.get(rChild)){
					max = rChild;              // finding out maximum of two children
				}
				
			}
			if(heap.get(max) > heap.get(parent)){ 
				swap(max,parent);  //swap the parent with child
				parent = max; // update the parent
				child = 2*parent + 1; // update the child
			}else{
				break;
			}
		}
		
	}
	
	
}
