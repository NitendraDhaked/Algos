package test.stack;
import stack.ArrayStack;
public class ArrayStackTest {

	public static void main(String ...args)
	{
		try
		{
		ArrayStack arystk = new ArrayStack(3);
		//arystk.top();
		arystk.push(5);
		arystk.push("Hello");
		System.out.println(arystk.isEmpty());
		arystk.push('c');
		//arystk.push("A");
		//arystk.push(1000);
		//arystk.push("Hello");
		System.out.println(arystk.isEmpty());
		System.out.println(arystk.top());
		System.out.println(arystk.pop());
		System.out.println(arystk.pop());
		System.out.println(arystk.getCapacity());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
