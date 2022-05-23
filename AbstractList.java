
/**
 * Interface to represent an AbstractList
 * @param <T> type of data stored by this list
 */

package uk.ac.rgu.cm2100;

public interface AbstractList <T>{
    
    /**
     * Add the given item to this list
     * @param item
     * @return 
     */
    
    public boolean add(T item);
    
    /**
     * Get the item at the given index
     * @param index
     * @return 
     */
    public T get(int index);
    
    /**
     * Remove the given item if it appears
     * @param item
     * @return 
     */
    public boolean remove(T item);
   
    /**
     * Get the size of this list
     * @return 
     */
    public int size();   
       
}
