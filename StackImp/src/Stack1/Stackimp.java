package Stack1;

import LinkedList1.Linkedlist;

public class Stackimp {
	private Linkedlist linkedlist = new Linkedlist(); 
	Boolean insertatbeg = false;
	Boolean deleteatbeg = false;
	public void push(Integer value) {
		if(insertatbeg) {
			linkedlist.insertatbeg(value);
		}else {
			linkedlist.inesertatend(value);
		}
	}
	
	public Integer pop() {
		if(deleteatbeg) {
			return linkedlist.deleteatbeg();
		}else {
			return linkedlist.deleteatend();
		}
		
	}
	
	public void printStack() {
		linkedlist.printList();
	}
	
	public Integer peek() {
		if(insertatbeg) {
			return linkedlist.getTop();
		}else {
			return linkedlist.last();
		}
	}
}
