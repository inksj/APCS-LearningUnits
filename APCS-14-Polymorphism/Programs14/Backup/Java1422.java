// Java1422.java
// This is a not a runnable program.
// You see the <List> interface below, as it is described by the
// College Board AP Computer Science course description.


interface List<E>
{
	public int Size();
	// returns the number of elements in list

	public boolean add(E obj);
	// appends obj to the end of list; returns true

	public void add(int index, E obj);
	// inserts obj at position  index (0 <= index <= size),
	// moving elements to the right (adds 1 to their indices) and adjusts size

	public E get(int index);
	// returns element at position index

	public E set(int index, E obj);
	// replaces the element at position index with obj
	// returns the element formerly at the specified position

	public E remove(int index);
	// removes element from position index, moving elements
	// at position index+1 and higher to the left
	// (subtracts 1 from their indices) and adjusts size
	// returns the element formerly at the specified position
}

