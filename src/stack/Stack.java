package stack;

public class Stack {
	private String[] stack; 
	int maxSize; //max maxSize
	int currentSize = -1; //current maxSize or currentSize
	
	public Stack(){
		stack = new String[100]; // maxsize to 100 by default
		this.maxSize = 100;
	}
	
	public Stack(int  maxSize){
		stack = new String[ maxSize];
		this.maxSize = maxSize;
	}
	
	public String pop() throws Exception{
		if(currentSize == 0){
			throw new Exception("Stack Empty");
		}
		String output = stack[currentSize];
		stack[currentSize] = null;
		currentSize --;
		return output;
 	}

	public void push(String data) throws Exception{
		if(currentSize >= maxSize){
			throw new Exception("Stack is Full");
		}
		stack[++currentSize] = data;
		
	};

	public String peek() throws Exception{
		if(currentSize <= 0){
			throw new Exception("Stack is Empty");
		}
		
		return stack[currentSize];
		
	};
}
