
package uk.ac.rgu.cm2100;

/**
 * Interface to represent an abstract stack
 * @author Robert Tunn, 2015065
 * @param <T> type of data stored by this stack
 */
public interface AbstractStack<T>{
    
    /**
     * Method to push the given item to the top of the stack
     * @param item
     * @return 
     */
    public boolean push(T item)throws StackUnderflowException;
    
    /**
     * Method to pop the item from the top of the stack
     * @return
     * @throws uk.ac.rgu.cm2100.AbstractStack.StackUnderflowException 
     */
    public T pop() throws StackUnderflowException;
    
    /**
     * Method to view the item at the top of the stack without popping it
     * @return
     * @throws uk.ac.rgu.cm2100.AbstractStack.StackUnderflowException 
     */
    public T peek() throws StackUnderflowException;
    
    /**
     * Method to get the size of this stack
     * @return 
     */
    public int size();

    
    /**
     * Class for stack underflow exceptions - you don't need to edit this
     */
    public static class StackUnderflowException extends Exception{
        public StackUnderflowException(String msg){
            super(msg);
        }

        StackUnderflowException() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
