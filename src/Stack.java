
public interface Stack<T> {
	void Push(T x);
	T Pop();
	T Peek();
	boolean IsEmpty();
	int GetLength();
}
