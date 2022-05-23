package uk.ac.rgu.cm2100;

/**
 * @author Robert Tunn, 2015065
 * Last modified 19 April 2022
 */

public class LinkedList <T> implements AbstractList{

    public int size = 0;
    
    private static class ListNode<T> {
               
        T value;
        
        ListNode next;
        
        ListNode(T value){
            this.value = value;
            next = null;
        }   
        
        public T getValue() {
            return this.value;
        }

        public ListNode getNext() {
            return this.next;
        };
    }
    
    ListNode head;
    
    @Override
    public boolean add(Object item) {
    
        ListNode node = new ListNode(item);
        
        if (this.head == null) {
            this.head = node;
            //System.out.println("Linked list started...");
            //System.out.println(node.getValue());
            size++;
            return true;
        }
        
        ListNode temp = this.head;
        
        while(temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = node;
        //System.out.println("..subsequent T type added");
        //System.out.println(node.getValue());
        size++;
        return true;
    }

    @Override
    public Object get(int index) {

        if (this.head == null) {
            return null;
        }
        
        int counter = 0;
        
        ListNode temp = this.head;
        
        while (counter < index) {
            temp = temp.next;
            counter = counter +1;
        }
        
        if (temp != null) {
            return temp.value;
        } else {
            return null;
        }
    }

    @Override
    public boolean remove(Object item) {

        if (this.head == null) {
            return false;
        }
        
        if (this.head.value == item) {
            this.head = this.head.next;
            size--;
            return true;
        }
        
        ListNode temp = this.head;
        
        while (temp.next != null) {
            if (temp.next.value == item) {
                temp.next = temp.next.next;
                size--;
                return true;
            }
            temp = temp.next;
        }
        
        return false;
    }
    
    @Override
    public int size() {        
        return size;
    }       
}
