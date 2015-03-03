package linkedList;

public class Node {
	
	public String data;
	public Node next;
	public Node prev;
	
	//for single linked list
	public Node(String data, Node next){
		this.data = data;
		this.next = next;
	}
	
	// doubleLinkedList
	public Node(String data, Node next,Node prev){
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	public Node(String data){
		this.data = data;
		
	}

	//getter and setters
	public void setData(String data){
		this.data = data;
	}
	
	public String getData(){
		return data;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setPrev(Node prev){
		this.prev = prev;
	}
	
	public Node getPrev(){
		return prev;
	}
}
