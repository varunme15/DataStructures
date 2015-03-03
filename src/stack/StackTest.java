package stack;

import java.util.Arrays;

import stack.Stack;

public class StackTest {

	public static void main(String[] args){
		Stack testStack = new Stack(10); // Instantiating an array of maxSize = 10;
		/*--------------------- Testing Push ------------------*/	
		for(int i = 0;i<10;i++){
			try {
				testStack.push(i+"");
			} catch (Exception e) {
				
				e.getMessage();
				
			}
		}
		
		try {
			System.out.println(testStack.peek()); // should be 10
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		/*--------------------- Testing Push ------------------*/		
		
		/*--------------------- Testing Push ------------------*/
		/*
		 * try {
			testStack.push("11");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace(); //should throw error
		}
		*/
		/*--------------------- Testing Push ------------------*/
		/*--------------------- Testing Pop ------------------*/
		for(int i = 0;i<5;i++){
			try {
				testStack.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			System.out.println(testStack.peek());//should be 4
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*for(int i = 0;i<5;i++){   // should throw an error 
			try {
				testStack.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		
		
		/*--------------------- Testing Pop ------------------*/
		/*--------------------- Testing Peek ------------------*/
		
			try {
				System.out.println(testStack.peek()); // should be 4
				System.out.println(testStack.peek());// should be 4 again
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*--------------------- Testing Peek ------------------*/	
		
	}
}
