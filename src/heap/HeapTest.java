package heap;

import java.util.Random;

public class HeapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap testHeap = new MinHeap(10);
		Random randomGenerator = new Random();
		for(int i=0;i<10;i++){
			try {
				
				 int randomInt = randomGenerator.nextInt(100);
				 //System.out.println(randomInt);
				 testHeap.insert(randomInt);
				 testHeap.printHeap();
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage()+ e.getMessage());
				e.printStackTrace();
			}
		}
		
		for(int i=0;i<5;i++){
			try {
				
				// int randomInt = randomGenerator.nextInt(100);
				 //System.out.println(randomInt);
				 testHeap.delete();
				 testHeap.printHeap();
				
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage()+ e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
