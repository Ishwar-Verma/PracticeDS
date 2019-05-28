package linkedList;

public class LinkedList {
	private int size;
	private Node head;
	private Node tail;
	LinkedList (){
		this.size=0;
		this.head=null;
	}
	
	public void addFirst(int num) {
		size++;
		Node n = new Node(num);
		n.next = head;
		head = n;
	}
	
	// add and addLast are same
	public void add(int num) {
		size++;
		Node n = new Node(num);
		if (head == null) {
			head = n;
			tail = n;
		}
		else {
				tail.next = n;
				tail = tail.next;
		}
	}
	
	public void remove(int index) {
		
	}
	
	public int size() {
		return this.size;
	}
	
	public void print() {
		Node temp = head;
		System.out.print("[");
		while(temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		
		System.out.println("]");
	}
}
