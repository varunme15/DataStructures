package linkedList.doubleLinkedList;

import linkedList.Node;

/**
 * @author varun
 *
 */

public class DoubleLinkedList {

		Node head;
		int size = 0;
		
		public DoubleLinkedList() {
			//head as senital node
			Node head = new Node(null,null,null);
			this.head = head;
		}
		
		// adding a node to front of the list
		public void addFront(String data){
			Node newNode = new Node(data,head.next,head);
			head.setNext(newNode);
			size++;
		}
		
		// adding a node at the end of the list
		public void addLast(String data){
			Node newNode = new Node(data);
			Node current = head;
			while(current.next !=null){
				current = current.next;
			}
			current.setNext(newNode);
			newNode.setPrev(current);
			newNode.setNext(null);
			size++;
		}
		
		// adding a node at particular index
		public void addIndex(String data,int index) throws Exception{
			Node newNode = new Node(data);
			Node current = head;
			if(index > size){
				throw new Exception("Index Can't be greater than Size of List");
			}
			
			for(int i=0;i<=index;i++){
				
				current = current.next;
			}
			newNode.setNext(current.next);
			newNode.setPrev(current);
			current.setNext(newNode);
			size++;
		}
		
		
		public void removeFront(){
			head.next = head.next.next;
			head.next.prev = head;
			size --;
		}
		
		public void removeLast(){
			
			Node current = head;
			while(current.next.next !=null){
				current = current.next;
			}
			current.next.setPrev(null);
			current.setNext(null);
			size--;
		}
		
		public void removeIndex(int index) throws Exception{
			
			Node current = head;
			if(index > size){
				throw new Exception("Index Can't be greater than Size of List");
			}
			
			for(int i=0;i< index;i++){
				
				current = current.next;
			}
			
			current.setNext(current.next.next);
			current.next.setPrev(current);
			size --; 
		}
		

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			DoubleLinkedList l1 = new DoubleLinkedList();
			l1.addFront("4");
			l1.addFront("2");
			l1.addFront("1");
			try {
				l1.addIndex("3", 1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l1.addLast("5");
			l1.addLast("6");
			l1.addLast("7");
			int data = 8;
			for(int i=0;i<10;i++){
				
				l1.addLast(data+"");
				data++;
			}
			
			Node current = l1.head;
			for(int i =0;i<l1.size;i++){
				current = current.next;
				System.out.println(current.data);
				
			}
			
			System.out.println("------------Before Remove Test-------------");
			
			for(int i=0;i<3;i++){
				
				l1.removeFront();
				
			}
			
			current = l1.head;
			for(int i =0;i<l1.size;i++){
				current = current.next;
				System.out.println(current.data);
				
			}
			System.out.println("------------After RemoveFront Test-------------");
			
			for(int i=0;i<3;i++){
				
				l1.removeLast();
				
			}
			current = l1.head;
			for(int i =0;i<l1.size;i++){
				current = current.next;
				System.out.println(current.data);
				
			}
			System.out.println("------------After RemoveLast Test-------------");
			
			try {
				//remove 8
				l1.removeIndex(4);
				//remove 9
				l1.removeIndex(4);
				//remove 10
				l1.removeIndex(4);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			current = l1.head;
			
			for(int i =0;i<l1.size;i++){
				current = current.next;
				System.out.println(current.data);
				
			}
			System.out.println("size"+l1.size);

			System.out.println("------------After RemoveIndex Test-------------");
			
		}

	

	
	
}
