package de.dennis.javaref.uni.ea.ea3.list;

public class Stack extends ListWithInternalArray {
    // legt ein Element auf den Stapel
    public void push(Object element) {
        this.add(element, getSize());
    }

    // liefert eine Referenz auf das oberste Element des Stapel
    public Object peek() {
        return getElementAt(getSize() - 1);
    }

    // liefert eine Referenz auf das oberste Element des Stapel.
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() {
        return removeElementAt(getSize() - 1);
    }

    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void print() {
      this.print();
    }
}
