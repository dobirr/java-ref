package de.dennis.javaref.uni.ea.ea3.list;

import java.util.Arrays;

public class StackWithInternalArray {

    private int count;
    private Object[] internalArray;
    public StackWithInternalArray() {
        count = 0;
        this.internalArray =  new Object[10];
    }

    // legt ein Element auf den Stapel
    public void push(Object element) {
        if (count == internalArray.length) {
            internalArray = Arrays.copyOf(internalArray, internalArray.length + 10);
        }

        internalArray[count] = element;
        count++;
    }

    // liefert eine Referenz auf das oberste Element des Stapel
    public Object peek() {
        return internalArray[count - 1];
    }

    // liefert eine Referenz auf das oberste Element des Stapel.
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() {
        Object removed = internalArray[count - 1];
        internalArray[count - 1] = null;
        count--;
        return removed;
    }

    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() {
        return count == 0;
    }

    // gibt das aktuelle interne array aus
    public void print() {
        for(int i = 0; i < internalArray.length; i++) {
            System.out.print(internalArray[i] + " ");
        }
        System.out.println();
    }
}
