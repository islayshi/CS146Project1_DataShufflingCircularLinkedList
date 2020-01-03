package cs14619.Shi.project1;

public class Node {
	private int prisoner;
	private Node next;

	public Node() {
		prisoner = 0;
		next = null;
	}

	public Node(int newprisoner) {
		prisoner = newprisoner;
		next = null;
	}

	public Node(int newprisoner, Node nextValue) {
		prisoner = newprisoner;
		next = nextValue;
	}
	
	public int getPrisoner() {
		return prisoner;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		next = n;
	}

}
