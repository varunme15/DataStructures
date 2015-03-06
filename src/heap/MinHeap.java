package heap;

public class MinHeap extends Heap {

	public MinHeap() {
		super();
	}

	public MinHeap(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void siftUp() {
		
	int currentIndex = heap.size() - 1; 
		
		while(currentIndex > 0){
			int parentIndex = (currentIndex - 1)/2;
			int item = heap.get(currentIndex);
			int parent = heap.get(parentIndex);
			if(item < parent){
				swap(parentIndex,currentIndex);
				currentIndex = parentIndex;
			}else{
				break;
			}
			
		}
		

	}

	@Override
	protected void siftDown() {
		int parent = 0;
		int child = 2 * parent + 1;
		while(child < heap.size()){
			 
			int min = child;
			int rChild = min + 1;
			if(rChild<heap.size()){
				if(heap.get(min)> heap.get(rChild)){
					min = rChild;              // finding out maximum of two children
				}
				
			}
			if(heap.get(min) < heap.get(parent)){ 
				swap(min,parent);  //swap the parent with child
				parent = min; // update the parent
				child = 2*parent + 1; // update the child
			}else{
				break;
			}
		}
		
	}
	

}
