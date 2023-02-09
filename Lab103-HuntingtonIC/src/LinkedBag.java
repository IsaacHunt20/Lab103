/**
 * A linked version of a bag class
 *
 * @author isaac huntington
 * @version 20230205
 */
import java.util.Random;

/**
 *
 * @param <E> type of object 
 */
public class LinkedBag<E> implements Bag<E> 
{
     //create an instance of a SinglyLinkedList
    private SinglyLinkedList<E> list;

    /**
     * Default constructor creates an instance of a SLL
     */
    public LinkedBag() 
    {
        list = new SinglyLinkedList<>();
    }

    /**
     *
     * @param length initial size
     */
    public LinkedBag(int length) 
    {
        //we ignore the param since we aren't using an array
        list = new SinglyLinkedList<>();
    }

    /**
     *
     * @return the number of objects 
     */
    @Override
    public int size() 
    {
        return list.size();
    }

    /**
     *
     * @return if the list is empty 
     */
    @Override
    public boolean isEmpty() 
    {
        return list.isEmpty();
    }

    /**
     * Empty the list 
     */
    @Override
    public void clear() {
        while (!list.isEmpty()) {
            list.removeFirst();
        }
    }

    /**
     *
     * @param e object to get count of
     * @return the total occurances of that object in the list 
     */
    @Override
    public int getFrequencyOf(E e) 
    {
        int total = 0;
        for (int i = 0; i < list.size(); i++) 
        {
            //loop over the list and find all objects equal to the parameter passed
            if (list.first().equals(e)) 
            {
                total++;
            }
            list.addLast(list.removeFirst());
        }

        return total;
    }

    /**
     *
     * @param e object to see if contained in the list 
     * @return 
     */
    @Override
    public boolean contains(E e) {
        for (int i = 0; i < list.size(); i++) {
            if (list.first().equals(e)) {
                return true;
            }
            list.addLast(list.removeFirst());
        }
        return false;

    }

    /**
     *
     * @param e the object to add
     */
    @Override
    public void add(E e) 
    {
        list.addLast(e);
    }

    /**
     *
     * @param e the object to remove 
     * @return the object if found else return null
     */
    public E remove(E e) {
        if(list.isEmpty())
            return null;
        
        E search = null;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.first().equals(e)) 
                 search = list.removeFirst();
            list.addLast(list.removeFirst());
        }
        return search;
    }

    /**
     *
     * @return a random object removed from the list 
     */
    @Override
    public E remove() {
        if (list.isEmpty()) 
            return null;
        
        //using the random object get a random index
        Random r = new Random();
        int limit = r.nextInt(list.size());
        E indexReturn = null;
        for (int i = 0; i < size(); i++) 
        {
            if(i == limit)
                indexReturn = list.removeFirst();
            list.addLast(list.removeFirst());
        }
        
        return indexReturn;

    }

    /**
     *
     * @param index the i'th position to retrieve
     * @return the object at the requested position
     */
    @Override
    public E get(int index) 
    {
        if (index > list.size() || list.isEmpty())
            return null;
        
        E indexReturn = null;
        for(int i = 0; i < size(); i++)
        {
            if( i == index)
                indexReturn = list.first();
            list.addLast(list.removeFirst());
        }
        return indexReturn;
    }
    
    /**
     *
     * @param o the object to return
     * @return true if the lists contain the same objects 
     */
    @Override
    public boolean equals(Object o)
    {
        if ( !( o instanceof LinkedBag ) )
            return false;
        
        LinkedBag lb = ( LinkedBag ) o;
        
        if (size() != lb.size())
            return false;
        
        for (int i = 0; i < size(); i++)
        {
            if (!list.first().equals(lb.get(i)))
                return false;
            list.addLast(list.removeFirst());
        }
           
        return true;
             
    }
    
    /**
     *
     * @return the list data as a string
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("@");
        sb.append(size());
        sb.append(':');
        for (int i = 0; i < size(); i++)
        {
            sb.append(list.first().toString());
            list.addLast(list.removeFirst());
        }
        
        return sb.toString();
            
    }

}
