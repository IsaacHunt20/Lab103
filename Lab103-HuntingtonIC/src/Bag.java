/**
 *
 * @author isaac huntington
 * @version 20230202
 * @param <E> the type
 */
public interface Bag<E> 
{

    /**
     * Blah
     * @return the size of the bag
     */
    int size();
    
    /**
     *
     * @return true if the bag is empty
     */
    boolean isEmpty();
    
    /**
     * Empty the bag
     */
    void clear();
    
    /**
     *
     * @param e the object to compare 
     * @return
     */
    int getFrequencyOf(E e);
    
    /**
     *
     * @param e the object to find
     * @return true if the object is in the bag
     */
    boolean contains(E e);
    
    /**
     *
     * @param e object to add to the bag
     */
    void add(E e);
    
    /**
     *
     * @return a randomly removed object from the bag
     */
    E remove();
    
    /**
     *
     * @param i get the element at the index
     * @return a referecn to the object at the bag
     */
    E get(int i);
    
    /**
     *
     * @return the contents of the bag
     */
    String toString();
    
    /**
     *
     * @param o the object to compare
     * @return true if the bags are the same 
     */ 
    boolean equals(Object o);
    
    
}
