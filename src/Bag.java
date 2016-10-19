import java.util.Arrays;

public class Bag {

	private int size; 	// # of elements in bag
	private int capacity; 	// maximum size of bag
	private Object[] bag;
	
	public Bag(int cap )
	{
		size = 0;
		capacity = cap;
		bag = new Object[cap];	
	}
	
	public boolean add(Object obj)
	
	
	{
		if (isFull())
		{
			return false;
		}
		else
		{
			bag[size]= obj;
			size++;
			return true;
		}
	}

	public boolean isFull()
	{
		if (size < capacity)
		{
			return false;
		}
		else
		{
			return true;
	
		}
	}
	@Override
	public String toString() {
		return "Bag [size=" + size + ", capacity=" + capacity + ", bag=" + Arrays.toString(bag) + "]";
	}
	
	
	
}
