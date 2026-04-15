package de.dennis.javaref.uni.ea.ea1.a1.kontrollstrukturen;

public class Foo {
    // Es wird eine main Methode angelegt, die zum Ausführen benötigt wird. Diese ist statisch und somit der Klasse Foo zugehörig.
    // Es wird ein Parameter gesetzt, der ein String Array erwartet. Die Methode hat kein return value, welches durch void gesetzt wird.
    // Die Methode ist auf public gesetzt und somit auch außerhalb der Klasse aufrufbar.
    public static void main(String[] args) {

        if(args.length % 2 != 0) {
            System.out.println("Es muss eine gerade Zahl an Argumenten eingeben werden!");
            return;
        }

        // Mit der for Schleife wird durch die das args attribute, welches eine referenz auf das string arrays ist, iteriert und bei jeder iteration wird die laufvariable um 2 erhöht.
        for (int i = 0; i < args.length; i = i + 2) {
           try {
               // Hier wird eine lokale variable x deklariert und dem entsprechenden index der laufvariable im args array zugewiesen
               int x = Integer.parseInt(args[i]);
               // Hier wird eine lokale variable y deklariert und dem entsprechenden index plus 1 der laufvariable im args array zugewiesen
               int y = Integer.parseInt(args[i + 1]);
               // hier wird geprüft, ob der numerische Wert von x negative ist. Wenn das der Fall ist, wird er mit -1 multipliziert.
               // Ansonsten bleib der Wert wie er ist. In beiden Fällen wird das resultat wieder x zugewiesen.
               x = x < 0 ? x * -1 : x;
               // hier wird geprüft, ob der numerische Wert von y negative ist. Wenn das der Fall ist, wird er mit -1 multipliziert.
               // Ansonsten bleib der Wert wie er ist. In beiden Fällen wird das resultat wieder y zugewiesen.
               y = y < 0 ? y * -1 : y;
               // Hier wird die Summe aus x und y gebildet und dann der int variable ergebnis zugewiesen.
               int ergebnis = x + y;
               // Die while Schleife läuft so lange durch bis der weert der variable ergebnis kleiner oder gleich 3 ist.
               while (ergebnis >= 3) {
                   ergebnis = ergebnis - 3;
               }
               // Berechnet die Nummer des aktuellen Zahlenpaares.
               int paarNr = i / 2 + 1;
               // Die switch-Anweisung prüft den value von der variable ergebnis.
               // Je nach Wert von ergebnis wird die passende Ausgabe erzeugt.
               switch (ergebnis) {
                   case 0:
                       System.out.println(paarNr + ". Paar: 0");
                       break;
                   case 1:
                       System.out.println(paarNr + ". Paar: 1");
                       break;
                   case 2:
                       System.out.println(paarNr + ". Paar: 2");
                       break;
                   default:
                       System.out.println("Das kann nicht sein!");
                       break;
               }
           } catch(NumberFormatException e) {
                System.out.println("Es dürfen nur Zahlen als argumente eingegeben werden");
           }
        }
    }
}
