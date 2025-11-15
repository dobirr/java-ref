package de.dennis.javaref.uni.ea.ea3.list;

import java.util.Arrays;

public class ListWithInternalArray {

    private int count;
    private Object[] internalArray;
    public ListWithInternalArray() {
        this.count = 0;
        this.internalArray =  new Object[10];
    }


    // Fügt das übergebene Element an der angegebenen Position ein.
    // Die nachfolgenden Elemente verschieben sich nach hinten.
    public void add(Object elem, int index) {
        if (count == internalArray.length) {
            internalArray = Arrays.copyOf(internalArray, internalArray.length + 10);
        }

        for(int i = count - 1; i >= index; i--){
            internalArray[i + 1] = internalArray[i];
        }
        internalArray[index] = elem;

        count++;

    }

    // Liefert eine Referenz auf das Element an der angegebenen Position.
    public Object getElementAt(int index) {
        return internalArray[index];
    }

    // Liefert eine Referenz auf das Element an der angegebenen Position und entfernt es
    // gleichzeitig aus der Liste. Nachfolgende Elemente werden ggf. nach vorne verschoben.
    public Object removeElementAt(int index) {
        Object removed = internalArray[index];
        for(int i = index + 1; i < count; i++) {
            internalArray[i - 1] = internalArray[i];
        }

        internalArray[count - 1] = null;

        count--;
        return removed;
    }

    // Liefert die Anzahl der Elemente in der Liste
    public int getSize() {
        return count;
    }

    // gibt das aktuelle interne array aus
    public void print() {
        for(int i = 0; i < internalArray.length; i++) {
            System.out.print(internalArray[i] + " ");
        }
        System.out.println();
    }

}
