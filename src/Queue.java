
public interface Queue<T> {
	void Enqueue(T x);
	T Dequeue();
	T Peek();
	boolean IsEmpty();
	int GetLength();
}
