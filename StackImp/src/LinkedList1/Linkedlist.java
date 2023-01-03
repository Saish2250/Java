package LinkedList1;

public class Linkedlist {
	private Node head;
	
	private Node temp;
	
	public void linkedlist1(){
		
	}
	
	public void insertatbeg(Integer value) {
		if(head==null) {
		head=new Node(value);
		}else {
			temp=new Node(value);
			temp.setNext(head);
			head=temp;
		}
	}
	public Integer deleteatend() {
		if(head==null) {
			System.out.println("Underflow");
			return null;
		}else {
			Node temp1 = head;
			while(temp1.getNext()!=null) {
			temp = temp1;
			temp1=temp1.getNext();
			}
			temp.setNext(null);
			return temp1.getValue();
		}
		
	}
	
	public void inesertatend(Integer value) {
		temp = new Node(value);
		Node temp1 = head;
		if(temp1==null) {
			head=temp;
		}else {
			while(temp1.getNext()!=null) {
				temp1=temp1.getNext();
			}
			temp1.setNext(temp);
		}
	}
	public Integer deleteatbeg() {
		if(temp==null) {
			System.out.println("Underflow");
			return null;
		}else {
			Node temp1 = head;
			head = temp1.getNext();
			return temp1.getValue();
		}
	}
	
	
	
	public void printList() {
		Node tempo=head;
		if(tempo==null) {
			System.out.println("List is Empty");
		}else {
			while(tempo!=null) {
				System.out.println(tempo.getValue());
				tempo=tempo.getNext();
			}
		}
	}
	
	public Integer last() {
		if(head==null) {
			System.out.println("List is empty");
			return null;
		}else {
			Node temp4=head;
			while(temp4.getNext()!=null) {
				return temp4.getValue();
			}
		}
		return null;
	}
	
	public Integer getTop() {
		if(head == null) {
			System.out.println("Empty");
			return null;
		} else {
			return head.getValue();
		}
	}
	

}
