package uk.ac.rgu.cm2100;

/**
 * @author Robert Tunn, 2015065
 * Last modified 23 April 2022
 */

public class MainApp {
    
    public static void main (String[] args){

        //LINKED LIST
        
        LinkedList list = new LinkedList();
        
        //Use add function
//        list.add(0); //is removed
  //      list.add(1);
    //    list.add("a");
      //  list.add("b");
        //list.add(true);
//        list.add(false);
  //      list.add(true);
    //    list.add(27.65);
      //  list.add(9.3456);
        
        //Use get function
        Object output = list.get(3);
        
        //Use remove function
        boolean output2 = list.remove(0);
        
        //Use size function
        int outputSize = list.size();
         
        //STACK
        Stack stack = new Stack(list);
       
        //Use push function tests
        stack.push("a");
        //stack.push(true);
        
        //Use pop functions tests
        //Object output3 = stack.pop();
        //Object output4 = stack.pop();

        //Use peek function
        //Object output5 = stack.peek();
        
        //Use size function
        int number = stack.size();
    }
}






