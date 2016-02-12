// Java1424.java
// This program implement the <List> interface.
// The interface and the implementation are now generic.
// In this program every instance of E will be replaced by String.


public class Java1424
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1424.JAVA\n");
		MyList<String> names = new MyList<String>();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		System.out.println("names size is " + names.Size());
		names.display();

		names.add(1,"Maria");
		System.out.println("names size is " + names.Size());
		names.display();

  		System.out.println("Element at index 2 is " + names.get(2) + "\n");

  		names.set(2,"Heidi");
		System.out.println("names size is " + names.Size());
		names.display();

		names.remove(1);
		System.out.println("names size is " + names.Size());
		names.display();
	}
}


interface List<E>
{
	public int Size();

	public boolean add(E obj);

	public void add(int index, E obj);

	public E get(int index);

	public E set(int index, E obj);

	public E remove(int index);
}


class MyList<E> implements List<E>
{
	private Object array[];
	private int size;

	public MyList()
	{
		array = new Object[10000];
		size = 0;
	}

	public int Size()
	{
		return size;
	}

	public boolean add(E obj)
	{
		array[size] = obj;
		size++;
		return true;
	}

	public void add(int index, E obj)
	{
		for (int k = size; k >= index; k--)
			array[k] = array[k-1];
		array[index] = obj;
		size++;
	}

	public E get(int index)
	{
		return (E) array[index];
	}

	public E set(int index, E obj)
	{
		E temp = (E) array[index];
		array[index] = obj;
		return temp;
	}

	public E remove(int index)
	{
		E temp = (E) array[index];
		for (int k = index; k < size-1; k++)
			array[k] = array[k+1];
		size--;
		return temp;
	}

	public void display()
	{
		for (int k = 0; k < size; k++)
			System.out.print(array[k] + " ");
		System.out.println("\n");
	}
}



