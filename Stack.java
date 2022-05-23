package uk.ac.rgu.cm2100;

/**
 * @author Robert Tunn, 2015065
 * Last modified 23 April 2022
*/

public class Stack<T> implements AbstractStack {
        
    LinkedList<T> data = new LinkedList();
                
    Stack(LinkedList<T> input){
        this.data = input;
    }   

    @Override
    public boolean push(Object item) {

        //If I have to use remove here the stack cannot handle more than one 
        //instance of the item because remove only removes the first instance
        //of it, or only the first instance of an item can be pushed to top


        LinkedList outputList = new LinkedList();
        LinkedList tempLinkedList = new LinkedList();

        //Add pushed item to top
        outputList.add(item);

        //Copy entire LinkedList
        for (int i = 0; i < this.data.size; i++) {
            tempLinkedList.add(this.data.get(i));
        }

        //Remove item from tempLinkedList
        tempLinkedList.remove(item);

        //Add tempLinkedList to outputLinkedList 
        for (int i = 0; i < tempLinkedList.size; i++) {
            outputList.add(tempLinkedList.get(i));
        }

        //Print out check
        for (int i = 0; i < outputList.size; i++) {
            System.out.println(outputList.get(i));
        }

        return true;
    }

    @Override
    public Object pop() throws StackUnderflowException{

        //Again limited by use of remove
        
        Object output = this.data.get(data.size-1);
        
        System.out.println(output + " has been removed from the stack");
        
        this.data.remove(output);
        
        return output;
    }

    @Override
    public Object peek() throws StackUnderflowException {
        
        Object last = this.data.get(this.data.size-1);
        
        System.out.println(last + " was the last item added to the stack");
        
        return last;
    }

    @Override
    public int size() {
    
        int output;
        
        output = this.data.size;

        System.out.println("The size of the stack is " + output);
        
        return output;
    }
}    

