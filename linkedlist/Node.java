/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author TylerP
 */
public class Node {
    
	public Node prev;
        public Node next;
	private StudentLink sdata;
	

	public Node(StudentLink s) {
	
		prev = null;
		next = null;
                sdata = s;
	}
	
	public Node(StudentLink s, Node p, Node n) {
	
		prev = p;
		next = n;
                sdata = s;
	}
	 
	 	// access to fields
	 public StudentLink getData() {
		 return sdata;
	 }
	 
	 public Node getNext() {
		 return next;
	 }
	 
	 public Node getPrev() {
		 return prev;
	 }
	 
	 // modify fields
	 public void setData(StudentLink s) {
		 sdata = s;
	 }
	 
	 public void setNext(Node n) {
		 next = n;
	 }
	 
	 public void setPrev(Node p) {
		 prev = p;
	 }
 
}
