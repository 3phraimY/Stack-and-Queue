
public class MyQueue<T> extends MyDoublyLinkedList implements Queue<T> {

	@Override
	public void Enqueue(T x) {
		this.Prepend(x);
	}

	@Override
	public T Dequeue() {
		MyDoubleNode<T> tempNode = this.Tail;
		this.remove(tempNode.Data);
		return tempNode.Data;
	}

	@Override
	public T Peek() {
		MyDoubleNode<T> tempNode = this.Tail;
		return tempNode.Data;
	}

	@Override
	public boolean IsEmpty() {
		if(this.Head == null)
		{
			return true;
		}
		return false;
	}

	@Override
	public int GetLength() {
		return this.Size;
	}

}
