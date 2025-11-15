package de.dennis.javaref.uni.ea.ea3.list;

import java.util.Stack;

public class listMain {
    public static void  main(String[] args) {
        ListWithInternalArray list = new ListWithInternalArray();
        StackWithInternalArray stack = new StackWithInternalArray();

       /* list.add("A", 0);
        list.add("B", 1);
        list.add("C", 2);
        list.add("D", 3);
        list.add("E", 4);
        list.add("F", 5);
        list.add("G", 6);
        list.add("H", 7);
        list.add("I", 8);
        list.add("J", 9);
        list.add("K", 10);
        list.removeElementAt(2);
        list.print();
        list.add("C", 2);
        list.print();*/
      /*  list.add("K", 10);
        list.add("B", 1);
        list.print();
        list.removeElementAt(1);
        list.removeElementAt(1);
        list.removeElementAt(1);
        list.print();*/



        /*stack.push("A");*/

        stack.push("A");
        stack.print();
        stack.push("B");
        stack.print();
        stack.push("C");
        stack.print();
        stack.push("D");
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();

    }
}


