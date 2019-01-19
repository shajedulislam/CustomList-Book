package com.Book.CustomList;

import java.util.Arrays;

public class CustomList<E> {
	
	private int size = 0;
    
    //Default capacity of list is 1
    private static final int DEFAULT_CAPACITY = 1;
     
    //This array will store all elements added to list
    private Object elements[];
 
    //Default constructor
    public CustomList() 
    {
        elements = new Object[DEFAULT_CAPACITY];
    }
 
    //Add method
    public void add(E e) 
    {
        if (size == elements.length) 
        {
        	IncreaseCapacity();
        }
        elements[size++] = e;
    }
     
    //Get method
    public E get(int i) 
    {
        if (i >= size || i < 0) 
        {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
     
    //Remove method
    public E remove(int i) 
    {
        if (i >= size || i < 0) 
        {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        size--;
        return (E) item;
    }
     
    //Get Size of list
    public int size() 
    {
        return size;
    }
     
    //Print method
    @Override
    public String toString()
    {
         StringBuilder sb = new StringBuilder();
         
         for(int i = 0; i < size ;i++) 
         {
             sb.append(elements[i].toString());
             if(i<size-1)
             {
                 sb.append("\n\n");
             }
         }
         
         return sb.toString();
    }
    
    //Increasing method
    private void IncreaseCapacity() 
    {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

}
