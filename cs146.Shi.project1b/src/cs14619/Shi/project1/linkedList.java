package cs14619.Shi.project1;

public class linkedList {
	private Node first;
	private Node last;
	private int size;

	public linkedList() {
		first = null;
		last = null;
	}

	public Node getFirst() {
		return first;
	}

	//Inserts node
	public void insert(int prisonerNum) {
		Node newPrisoner = new Node(prisonerNum);

		if (first == null) {
			first = newPrisoner;
			first.setNext(first);

		} else {
			Node temp = first;
			while (temp.getNext() != first) {
				temp = temp.getNext();
			}

			temp.setNext(newPrisoner);
			temp.getNext().setNext(first);

		}

		// increment size
		size++;
	}

	//Checks if list is empty
	public boolean isEmpty() {
		return (first == null);
	}

	//returns size
	public int size() {
		return size;
	}

	
	//Take the number of times to be skipped
	//return remaining prisoner number
	public int remove(int k) {
		Node cur = first;

		Node curfront = cur.getNext();

		Node curbehind = last;

		int countdown = k;

		while (this.size() != 1) {

			// Find the node that needs to be removed
			// by hopping k times
			while (countdown != 0) {
				curbehind = cur;
				cur = cur.getNext();
				curfront = cur.getNext();
				countdown--;
			}

			// reset countdown
			countdown = k;

			// delete the node
			curbehind.setNext(curfront);
			cur = curfront;
			curfront = cur.getNext();

			size--;
		}

		// return freedPrisoner;
		return cur.getPrisoner();

	}

}
