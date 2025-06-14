package datastructure.linkedlist;

public class TestClientForLinkedList {
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		
		list.appendWithArray(new int[] {6, 7, 8, 9});
		list.printData();
	}

}
