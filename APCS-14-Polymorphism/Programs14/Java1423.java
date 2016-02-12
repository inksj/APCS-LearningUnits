// Java1423.java
// This program implement the <IntList> interface.
// The interface and the implementation is intentionally not generic.
// Every method and storage is designed to work with <int> values only.


public class Java1423
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1423.JAVA\n");
		MyIntList numbers = new MyIntList();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		System.out.println("numbers size is " + numbers.Size());
		numbers.display();

		numbers.add(1,999);
		System.out.println("numbers size is " + numbers.Size());
		numbers.display();

  		System.out.println("Element at index 2 is " + numbers.get(2) + "\n");

  		numbers.set(2,555);
  		System.out.println("numbers size is " + numbers.Size());
		numbers.display();

		numbers.remove(1);
		System.out.println("numbers size is " + numbers.Size());
		numbers.display();
	}
}


interface IntList
{
	public int Size();

	public boolean add(int num);

	public void add(int index, int num);

	public int get(int index);

	public int set(int index, int num);

	public int remove(int index);
}


class MyIntList implements IntList
{
	private int intArray[];
	private int size;

	public MyIntList()
	{
		intArray = new int[10000];
		size = 0;
	}

	public int Size()
	{
		return size;
	}

	public boolean add(int num)
	{
		intArray[size] = num;
		size++;
		return true;
	}

	public void add(int index, int num)
	{
		for (int k = size; k >= index; k--)
			intArray[k] = intArray[k-1];
		intArray[index] = num;
		size++;
	}

	public int get(int index)
	{
		return intArray[index];
	}

	public int set(int index, int num)
	{
		int temp = intArray[index];
		intArray[index] = num;
		return temp;
	}

	public int remove(int index)
	{
		int temp = intArray[index];
		for (int k = index; k < size-1; k++)
			intArray[k] = intArray[k+1];
		size--;
		return temp;
	}

	public void display()
	{
		for (int k = 0; k < size; k++)
			System.out.print(intArray[k] + " ");
		System.out.println("\n");
	}
}

