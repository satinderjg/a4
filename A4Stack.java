public class A4Stack<T> implements Stack<T> {
	
	private Node<T> head;

	public A4Stack() {
		head = null;
	}
	
	public void push(T v) {
		// TODO: implement this
		Node<T> n = new Node<T>(v);
		
		if(isEmpty()){
			//System.out.print("__");
			head = n;
			return;
		}
		//System.out.print("~~");
		n.setNext(head);
		head =n;

	}
	
	public T pop() {
		if (isEmpty()) {
			// exception handling is done for you -- we will learn about
			// expections in the next unit. Don't change this.
			throw new EmptyStackException("Can't pop - stack is empty");
		}
		// TODO: implement this	
		Node<T> n;
		n = head;
		this.head = head.getNext();

		return n.getData(); // so it compiles
	}
	
	public void popAll() {
		// TODO: implement this	
		head = null;
	}
	
	public boolean isEmpty() {
		// TODO: implement this	

		return (head==null); // so it compiles
	}
	
	public T top() {
		if (isEmpty()) {
			// exception handling is done for you -- we will learn about
			// expections in the next unit. Don't change this.
			throw new EmptyStackException("Can't pop - stack is empty");
		}
		// TODO: implement this	

		return head.getData(); // so it compiles
	}
}