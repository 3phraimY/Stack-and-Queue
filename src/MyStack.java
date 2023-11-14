
public class MyStack<T> extends MyDoublyLinkedList implements Stack<T> {

	@Override
	public void Push(T x) {
		this.Prepend(x);
		return;
	}

	@Override
	public T Pop() {
		MyDoubleNode<T> tempNode = this.Head;
		this.remove(tempNode.Data);
		return tempNode.Data;
	}

	@Override
	public T Peek() {
		MyDoubleNode<T> tempNode = this.Head;
		return tempNode.Data;
	}

	@Override
	public boolean IsEmpty() {
		if(this.Head != null)
		{
			return false;
		}
		return true;
	}

	@Override
	public int GetLength() {
		return this.Size;
	}

}
