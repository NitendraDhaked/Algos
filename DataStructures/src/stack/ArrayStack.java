package stack;

public class ArrayStack
{
	private int size;
	private Object stackElement[];
	private int currentPos=-1;
	public ArrayStack(int size)
	{
		this.size=size;
		stackElement= new Object[size];
	}
	
	public void push(Object p) throws Exception
	{
		if(currentPos>=size-1)
		{
		throw new Exception("Stack is not empty");
		}
		stackElement[++currentPos]=p;
	}
	
	public Object pop() throws Exception
	{
		if(currentPos<0)
		throw new Exception("Stack is empty");
		return stackElement[currentPos--];
	}
	public Object top() throws Exception
	{
		if(currentPos<0)
		throw new Exception("no element present");
		return stackElement[currentPos];
	}
	public boolean isEmpty()
	{
		if(currentPos<stackElement.length-1)
		return true;
		return false;
	}
	public int getCapacity()
	{
		return size;
	}
}
