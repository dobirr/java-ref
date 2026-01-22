[ ] **Ad-hoc-Aufgabe 1**

Das untenstehende Programmbeispiel zeigt, wie man den im Konto-Beispiel beschriebenen
Effekt tatsächlich beobachten kann. Wenn Sie den Code ausführen, werden Sie
allerdings so gut wie immer das korrekte Ergebnis (Kontostand 7000) erhalten. Das liegt
daran, dass der kritische Bereich im Beispiel sehr klein ist, und damit dieWahrscheinlichkeit
entsprechend gering, dass der Scheduler einen Thread unterbricht, während dieser
sich gerade in diesem Bereich befindet.
Die Wahrscheinlichkeit für einen fehlerhaften Ablauf lässt sich allerdings deutlich
steigern. Dazu teilen wir dem Scheduler durch Aufruf von Thread.yield() innerhalb
des kritischen Bereichs mit, dass der laufende Thread den Prozessor freigeben möchte,
provozieren also eine Unterbrechung an genau dieser Stelle. Entkommentieren Sie dazu
die betreffende Zeile und lassen Sie das Programm einige Male laufen.Welche möglichen
Ergebnisse beobachten Sie? Ist Ihnen für alle Abläufe klar, wie diese zustande kommen?
Beachten Sie: Alle Abläufe, die Sie nun beobachten, hätten auch ohne Aufruf von yield
jederzeit auftreten können!Wir haben lediglich dieWahrscheinlichkeit erhöht, dass es so
kommt.

```java
public class KontoTest {
    public static void main(String[] args) throws InterruptedException {
        Konto konto = new Konto(1000);
        Thread A = new Einzahler(konto, 2000);
        Thread B = new Einzahler(konto, 4000);
        A.start();
        B.start();
        A.join(); // Main-Thread wartet auf Beendigung von A
        B.join(); // Main-Thread wartet auf Beendigung von B
        konto.printSaldo(); // Main-Thread gibt Kontostand aus
    }
}
class Konto {
    private int saldo;
        public Konto(int saldo) {
        this.saldo = saldo;
    }
    public void einzahlen(int betrag) {
        int temp = saldo + betrag;
        // Thread.yield();
        saldo = temp;
    }
    public void printSaldo() {
        System.out.println(String.valueOf(saldo));
    }
}
class Einzahler extends Thread {
    private Konto konto;
    private int betrag;
    public Einzahler(Konto konto, int betrag) {
        this.konto = konto;
        this.betrag = betrag;
    }
    @Override
    public void run() {
        konto.einzahlen(betrag);
    }
}
```

[ ] **Ad-hoc-Aufgabe 2**

1. Testen Sie das Ringpuffer-Beispiel auf Ihrem eigenen Rechner. Erhöhen und verringern
   Sie versuchsweise die Verbrauchszeit des Verbrauchers und schauen Sie
   sich an, wie sich dadurch der Schwerpunkt der Anzahl der jeweils im Puffer befindlichen
   Produkte verschiebt.
2. Ändern Sie die Klasse ErzeugerVerbraucherTest so ab, dass Sie mehrere Erzeuger
   und/oder Verbraucher einsetzen.Was beobachten Sie?


[ ] **Ad-hoc-Aufgabe 3**

Ändern Sie die Klasse RingBuffer so ab, dass sie auch mit mehreren Erzeugern und
Verbrauchern korrekt arbeitet. Testen Sie die neue Version mit verschiedenen Zahlen von
Erzeugern und Verbrauchern.