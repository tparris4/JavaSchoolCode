package student;

public class Node {
	private Node prev;
	private Object data;
	private Node next;
	
	// *** methods *** 
	public Node(Student s) {
		data = s;
		prev = null;
		next = null;
	}
	
	public Node(Student s, Node p, Node n) {
		data = s;
		prev = p;
		next = n;
	}
	 
	 	// access to fields
	 public Object getData() {
		 return data;
	 }
	 
	 public Node getNext() {
		 return next;
	 }
	 
	 public Node getPrev() {
		 return prev;
	 }
	 
	 // modify fields
	 public void setData(Student s) {
		 data = s;
	 }
	 
	 public void setNext(Node n) {
		 next = n;
	 }
	 
	 public void setPrev(Node p) {
		 prev = p;
	 }
 }