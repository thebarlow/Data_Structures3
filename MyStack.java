//Matthew Barlow
import java.util.*;

public class MyStack<AnyType> {
	private ArrayList<AnyType> stack;
	public MyStack() {
		stack = new ArrayList<AnyType>();
		}
	public AnyType pop() {
		if (stack.size() == 0) {
			return null;
		} else {
			return stack.remove(stack.size() - 1); 
		}
	}
	public AnyType push(AnyType x) {
		stack.add(x);
		return x;
	}
	public AnyType peek() {
		if(!stack.isEmpty()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}
	public Boolean isEmpty() {
		return (stack.size() == 0);
	}
	public String toString() {
		return stack.toString();
	}
}