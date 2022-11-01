package LinkedList1;

public class Node {
	private Integer value;
	private Node next;
	public Node(Integer value) {
		super();
		this.setValue(value);
		this.setNext(null);
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
