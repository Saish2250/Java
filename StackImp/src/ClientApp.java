import Stack1.Stackimp;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackimp Mystack = new Stackimp();
		System.out.println("Printing Stack");
		Mystack.push(21);
		Mystack.push(81);
		Mystack.push(100);
		Mystack.push(81);
		Mystack.push(25);
		Mystack.push(76);
		Mystack.push(45);
		Mystack.push(50);
		
		
		Mystack.printStack();
		
		
		System.out.println("Popping Element");
		Mystack.pop();
		Mystack.pop();
		
		System.out.println("Peek");
		Mystack.peek();
		
		Mystack.printStack();
	}

}
