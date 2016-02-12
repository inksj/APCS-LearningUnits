// TextLab08st.java
// This is the student starting version of the TextLab08 assignment.
// Testing <main> methods are provided for the 80-point and 100-point versions.
// This means that this version will not compile as provided.


import java.util.ArrayList;


public class TextLab08st
{
     public static void main(String args[])
     {
          System.out.println("\nLAB24A 100-POINT VERSION\n");
          
          Matrix m1 = new Matrix();
          m1.displayMatrix("Matrix m1 Default Display");
          System.out.println();
          
          Matrix m2 = new Matrix(3,5);
          int count = 100;
          for (int r = 0; r < m2.getRows(); r++)
          {
               for (int c = 0; c < m2.getCols(); c++)
               {
                    m2.setValue(r,c,count);
                    count++;
               }
          }          
          m2.displayMatrix("Matrix m2 3 X 5 Consecutive Integers Display");
          System.out.println();
          
          m2.resize(4,4);
          m2.displayMatrix("Matrix m2 After 4 X 4 Resizing Display");
          System.out.println();
          
          Matrix m3 = new Matrix(3,3,100);                    
          m3.displayMatrix("Matrix m3 3 X 3 Initialized to 100 Display");
          System.out.println();
     }
               
}
class Matrix
{                                        
     private ArrayList list;          // one-dimensional array stores matrix values
     private int listSize;          // total number of elements in the matrix
     private int numRows;          // number of rows in the matrix
     private int numCols;          // number of cols in the matrix
    
     public Matrix()
     {
          numRows = 0;
          numCols = 0;
          list = new ArrayList();
          listSize = 0;
     }
     public Matrix(int r, int c)
     {
          numRows = r;
          numCols = c;
          list = new ArrayList();
          listSize = numRows*numCols;
          for(int a =0;a<listSize;a++)
          {
               list.add(new Integer(0));
          }
     }
     public Matrix(int r, int c, int v)
     {
          numRows = r;
          numCols = c;
          list = new ArrayList();
          listSize = numRows*numCols;
          for(int a =0;a<listSize;a++)
          {
               list.add(new Integer(v));
          }
     }
     public int getRows()
     {
          return numRows;
     }
     public int getCols()
     {
          return numCols;
     }
     public int getSize()
     {
          return listSize;
     }
     public int getValue(int r, int c)
     {
          int a = (Integer)list.get(c+numCols*r);
          return a;
     }
     public void setValue(int r, int c, int v)
     {
          list.set(c+numCols*r,v);
     }
     public void displayMatrix(String message)
     {
          System.out.println(message);
          if(list.isEmpty())
               System.out.println("Matrix has no values");
          else
          {
               int count = 0;
               for(int a = 0;a<getRows();a++)
               {
                    for(int b = 0;b<getCols();b++)
                    {
                         System.out.print(getValue(a,b) + "  ");
                         count++;
                    }
                    System.out.println();     
               }
          }
     }
     public void resize(int rows, int cols)
     {
          Matrix temp = new Matrix(rows,cols,0);
          for (int r = 0; r < getRows(); r++)
          {
               for (int c = 0; c < getCols()-1; c++)
               {
                    temp.setValue(r,c,getValue(r,c));
               }
          }
          //temp.displayMatrix(" ");
          //numRows = rows;
          //numCols = cols;
          //listSize = numRows*numCols;
          for (int r = 0; r < getRows(); r++)
          {
               for (int c = 0; c < getCols()-1; c++)
               {
                    setValue(r,c,temp.getValue(r,c));
               }
          }
          displayMatrix(" ");
     }
}