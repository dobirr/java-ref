package de.dennis.javaref.uni.ea.ea5.a1;

public class FunctionOperator {
    // Führt eine übergebene Funktion so oft aus, bis der gewünschte Zielwert erreicht ist.
    // Beim ersten Aufruf wird der übergebene Startwert als Eingabe der Funktion verwendet,
    // bei den folgenden Aufrufen dann jeweils das Ergebnis des letzten Aufrufs. Am Ende
    // wird die Anzahl der Aufrufe zurückgegeben, die zum Erreichen des Zielwertes nötig war.
    public int operate(IntIntFunction function, int start, int target) {
        int counter = 0;
        int value = start;
        while (value != target) {
            value = function.perform(value);
            counter++;
        }
        return counter;
    }
}