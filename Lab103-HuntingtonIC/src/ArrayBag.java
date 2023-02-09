/**
 * A stack version of a bag that is array based
 * @author Isaac Huntington
 * @version 20232401
 */

import java.util.Random;

/**
 *
 * @author isaac
 * @param <E>
 */
public class ArrayBag<E> implements Bag<E>
{
    private E[] list;
    private int count = 0;
    
    /**
     * Default Constructor
     */
    public ArrayBag()
    {
        list = (E[]) new Object[2];
    }
    
    /**
     * Overloaded Constructor
     * @param length length of the stack
     */
    public ArrayBag(int length)
    {
        list = (E[]) new Object[length];
    }
    
    /**
     *
     * @return the number of items in the list 
     */
    @Override
    public int size() {return count;}
    
    /**
     *
     * @return true if the count is 0 
     */
    @Override
    public boolean isEmpty() { return count == 0;}
    
    /**
     * Set all values to a default of 0
     */
    @Override
    public void clear()
    {
        for (int i = 0; i < list.length; i++)
            list[i] = null; 
        
        count = 0;
    }
    
    /**
     *
     * @param e
     * @return the total occurrences of the object 
     */
    @Override
    public int getFrequencyOf(E e)
    {
        int total = 0; 
        for(int i = 0; i < count - 1; i++)
        {
            if( list[i].equals(e))
                total++;
        }
        return total;
    }
    
    /**
     *
     * @param e the number to search for since we do not sort our list we use linear search 
     * @return true if the value is contained in the list 
     */
    @Override
    public boolean contains(E e)
    {
        for(int i = 0; i < count; i++)
        {
            if( list[i].equals(e))
                return true;
        }
        return false;
    }
    
    /**
     *
     * @param e add the number to the list 
     */
    @Override
    public void add(E e)
    {
        //make sure there is space to add to 
        if(count == list.length)
        {
            E[] temp = (E[]) new Object[list.length*2];
            for(int i = 0; i < count; i++)
                temp[i] = list[i];
            list = temp;
            temp = null;
        }
        
        list[count] = e;
        count++;
    }
    
    /**
     * 
     * @param e 
     * @return the number removed if found 
     * @throws IllegalStateException if the number is not found 
     */
    public E remove(E e) throws IllegalStateException
    {
      for(int i = 0; i < count; i++)
      {
          if (list[i].equals(e) )
          {
              E temp = list[i]; 
              regularize(i);
              return temp;
          }
      }
      throw new IllegalStateException();
    }
    
    /**
     *
     * @return a randomly removed number
     * @throws IllegalStateException if the list is empty
     */
    @Override
    public E remove() throws IllegalStateException
    {
        if (isEmpty())
            throw new IllegalStateException();
        
        Random rand = new Random();
        int randomIndex = rand.nextInt( count );
        E randomValue = list[randomIndex];
        regularize(randomIndex);
        
        return randomValue;
    }
    
    /**
     *
     * @param i the index to get
     * @return the number at the index 
     * @throws ArrayIndexOutOfBoundsException
     */
    @Override
    public E get(int i) throws ArrayIndexOutOfBoundsException 
    {
        if (isEmpty() || i > count)
            throw new ArrayIndexOutOfBoundsException();
        
        return list[i];
    }
    
    /**
     *
     * @return the instances data in a string 
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++)
        {
            sb.append(get(i));
            sb.append(':');
        }
        
        return getClass().getName() + "@" + count + ":" + sb.toString();
    }
    
    /**
     *
     * @param o Object to compare
     * @return true if the all data matches, else returns false 
     */
    @Override
    public boolean equals(Object o)
    {
        if ( !( o instanceof ArrayBag ) )
            return false;
        
       ArrayBag ab = ( ArrayBag ) o;
        
        if (size() != ab.size())
            return false;
        
        for (int i = 0; i < size(); i++)
        {
            if (!list[i].equals(ab.get(i)))
                return false;
        }
           
        return true;
             
    }
    
    /**
       A helper method to method that will shift items based on the index removed 
    */
    private void regularize(int indexRemoved)
    {
        for (int i = indexRemoved; i < count - 1; i++)
            list[i] = list[i+1];
        count--;
    }
}
