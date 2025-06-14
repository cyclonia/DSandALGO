package datastructure.linkedlist;

public class MyLinkedList {
	Node head;

	public void append(int data) {
		Node current = head;
		if (head == null) {
			head = new Node(data);
			return;
		}
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(new Node(data));
	}
	
	public void printData() {
		Node current = head;
		if(current == null) {
			System.out.println("Empty");
		}
		while (current.getNext() != null) {
			System.out.print(current.getData() + "->");
			current = current.getNext();
		}
		System.out.println(current.getData());

	}

}
