// SortingDemo.java


import java.awt.*;
import java.applet.*;


public class SortingDemo extends Applet
{
    int numbers[];
    int size;
    int timeDelay;
    char choice;
    TimeTest timeElapsed;
    
    public void init()
    {
    	size = 650;
    	numbers = new int[size];
    	for (int j = 0; j < size; j++)
    		numbers[j] = Expo.random(0,999);
    	timeElapsed = new TimeTest();	
    	boolean inputOK;
    	
    	do
    	{	
    	    choice = Expo.enterCharGUI("SORTING DEMO BY: MR. JOHN SCHRAM JPII HS \nTimeTest Class BY: MR. LEON SCHRAM JPII HS \n\nPlease select a sort from the list below: \nA - Bubble Sort \nB - Smart Bubble Sort \nC - Shaker Sort \nD - Selection Sort \nE - Insertion Sort \nF - Shell Mentzer Sort \nG - Heap Sort \nH - Quick Sort \n\n");	
    	    inputOK = (choice >= 'A' && choice <= 'H') || (choice >= 'a' && choice <= 'h');
    	    if (!inputOK)
    	    	Expo.displayGUI("INPUT ERROR! \n\nPlease enter A, B, C, D, E, F, G or H.");
    	}
    	while (!inputOK);    	
    		
    	timeDelay = Expo.enterIntGUI("Enter a timeDelay. {0-1000}");	
    }
    
	public void paint(Graphics g)
	{
		displayRandomPoints(g);
		timeElapsed.startClock();
		switch(choice)
		{
			case 'A': case 'a' : bubbleSort(g); break;
			case 'B': case 'b' : smartBubbleSort(g); break;
			case 'C': case 'c' : shakerSort(g); break;
			case 'D': case 'd' : selectionSort(g); break;
			case 'E': case 'e' : insertionSort(g); break;
			case 'F': case 'f' : shellSort(g); break;
			case 'G': case 'g' : heapSort(g); break;
			case 'H': case 'h' : quickSort(g,0,size-1); 
		}	
		timeElapsed.stopClock();
		displayConclusion(g);
	}
	
	public void displayRandomPoints(Graphics g)
	{
		for(int y = 0; y < size; y++)
		{
			int x = numbers[y];
			Expo.setColor(g,x);
			Expo.drawPoint(g,x,y);
		}
	}
	
	public void displayConclusion(Graphics g)
	{
		Expo.setColor(g,Expo.black);
		g.setFont(new Font("Arial",Font.BOLD,24));
		g.drawString("Sorting Complete.   Time Elapsed: " + timeElapsed,400,100);
	}	

	public void bubbleSort(Graphics g)
	{
		for (int p = 1; p < size; p++)
		{	
		    Expo.delay(timeDelay);			
			for (int q = 0; q < size-1; q++)
				if (numbers[q] > numbers[q+1])
					swap(g,q,q+1);
		}			
	}
	
	public void smartBubbleSort(Graphics g)
	{
		int p = 1;
		boolean sorted;
		do
		{	
			sorted = true;
		    Expo.delay(timeDelay);			
			for (int q = 0; q < size-p; q++)
				if (numbers[q] > numbers[q+1])
				{
					swap(g,q,q+1);
					sorted = false;
				}	
		}	
		while (!sorted);			
	}
	
	public void shakerSort(Graphics g)
	{
		for (int p = 1; p < size/2; p++)
		{	
		    Expo.delay(timeDelay);			
			for (int q = 0; q < size-1; q++)
				if (numbers[q] > numbers[q+1])
					swap(g,q,q+1);
					
		    Expo.delay(timeDelay);			
			for (int q = size-p-1; q >= p; q--)
				if (numbers[q] < numbers[q-1])
					swap(g,q,q-1);					
		}			
	}
	
	public void selectionSort(Graphics g)
    {
	    int smallest = 0;
	    for (int p = 0; p < size; p++)
	    {
	    	Expo.delay(timeDelay);
           	smallest = p;
    	    for (int q = p+1; q < size; q++)
 		    if (numbers[q] < numbers[smallest])
    			    smallest = q;
    	    if (numbers[p] != numbers[smallest])
				swap(g,p,smallest);
        }
    }


    public int linearSearch(int searchNumber, int n)
    {
       int index = 0;
       while (index < n && searchNumber > numbers[index])
          index++;
       return index;   
    }


    public void insertItem(Graphics g, int SearchNumber, int n, int index)
    {
       int k;
       for (k = n-1; k > index; k--)
       {
          swap(g,k,k-1);  // Used to make graphics work but actually slows down efficiency
          Expo.delay(timeDelay);
       }
       numbers[index] = SearchNumber;
    }

    public void insertionSort(Graphics g)
    {
       int index,k;
       int tempSize;
       for (k = 1; k < size; k++)
       {
          tempSize = k + 1;
          index = linearSearch(numbers[k],tempSize);
          insertItem(g,numbers[k],tempSize,index);
       }
    }

    public void shellSort(Graphics g)
    {
	   int jump, m, n, t;
       boolean done;
       jump = size;
       while (jump > 1) 
	   {
   	      jump /= 2;
   	      do 
	      {
	      	 Expo.delay(timeDelay);	
   		     done = true;
   		     for (m = 0; m < size-jump; m++) 
			 {
     			n = m + jump;
        		if (numbers[m] > numbers[n])  
				{ 
					swap(g,m,n);
					done = false;
        		}
      		 }
     	  }  
	      while (!done);
       }
    }
	


    public int partition(Graphics g, int first, int last)
    {
       int temp;
       int k;
       int pivotValue = numbers[first];
       int pivotIndex = first;
       
       Expo.delay(timeDelay);
       for (k = first+1; k <= last; k++)
       {
           if (numbers[k] <= pivotValue)
           {
	           pivotIndex++;
	           swap(g,k,pivotIndex);
           }
       }
       swap(g,pivotIndex,first);
       return pivotIndex;
    }


    public void quickSort(Graphics g, int first, int last)
    {
       int pivotIndex;
       if (first < last)
       {
           pivotIndex = partition(g,first,last);
           quickSort(g,first,pivotIndex-1);
           quickSort(g,pivotIndex+1,last);
       }
    }


    void fixHeap(Graphics g, int top, int bottom)
    {
       int k,t;
       k = top * 2;
       if (k <= bottom)
       {
          if (k < bottom)
	         if (numbers[k] < numbers[k+1]) 
	         	k++;
          if (numbers[top] < numbers[k])
          {
	         swap(g,top,k);
	         fixHeap(g,k,bottom);
          }
       }
    }

    void heapSort(Graphics g)
    {
       int k,t;
       int n = size;
       for (k = (n-1)/2; k >= 0; k--)
       {
          fixHeap(g,k,n-1);
          Expo.delay(timeDelay);
       }   
       for (k = n-1; k >= 0; k--)
       {
          swap(g,0,k);
          fixHeap(g,0,k-1);
          Expo.delay(timeDelay);
       }
    }
	
	public void swap(Graphics g, int y1, int y2)
	{
		Expo.setColor(g,Expo.white);
		int x1 = numbers[y1];
		int x2 = numbers[y2];
		Expo.drawPoint(g,x1,y1);
		Expo.drawPoint(g,x2,y2);
		numbers[y1] = x2;
		numbers[y2] = x1;
		x1 = numbers[y1];
		x2 = numbers[y2];	
		Expo.setColor(g,x1);
		Expo.drawPoint(g,x1,y1);
		Expo.setColor(g,x2);
		Expo.drawPoint(g,x2,y2);
		
	}				
}


