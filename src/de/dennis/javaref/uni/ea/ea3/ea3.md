# Einsendeaufgabe 3

---

## Aufgabe 3.1 (20 Punkte) – Aufzählungstypen

In einem Programm sollen die acht Planeten des Sonnensystems und ihre Monde repräsentiert werden. Die dazu nötigen Daten finden Sie zum Beispiel bei Wikipedia.

Testen Sie den von Ihnen zu erstellenden Aufzählungstyp mit folgender Testklasse:

```java
public class PlanetTest {
    public static void main(String[] args) {
        Planet p1 = Planet.MARS;
        Planet p2 = Planet.ERDE;
        System.out.println("Anzahl Monde " + p1 + ": " + p1.getNumberOfMoons());
        System.out.println("Anzahl Monde " + p2 + ": " + p2.getNumberOfMoons());
        if (p1 != p2) {
            if (p1.isCloserToSunThan(p2)) {
                System.out.println(p1 + " ist näher an der Sonne als " + p2);
            } else {
                System.out.println(p2 + " ist näher an der Sonne als " + p1);
            }
        }
    }
}
```

Die Ausgabe sollte lauten:

```text
Anzahl Monde MARS: 2
Anzahl Monde ERDE: 1
ERDE ist näher an der Sonne als MARS
```

### a) (6 Punkte)

Erstellen Sie einen Aufzählungstyp, welcher die Planeten repräsentiert.

### b) (7 Punkte)

Implementieren Sie innerhalb dieses Typs eine Objektmethode `getNumberOfMoons`, welche die Anzahl der Monde des Planeten zurückliefert, auf dem sie aufgerufen wird. Bei der Implementierung der Methode dürfen Sie keine expliziten Anweisungen zur Fallunterscheidung wie `if` oder `switch` verwenden.

### c) (7 Punkte)

Implementieren Sie eine Objektmethode `isCloserToSunThan(Planet other)`, welche angibt, ob der Planet, auf dem die Methode aufgerufen wurde, näher an der Sonne ist als der übergebene Planet.

---

## Aufgabe 3.2 (40 Punkte) – Subtypbeziehung und Vererbung

Das Team des Startups HagenSoft hat eine Implementierung für eine Liste geschrieben, die ihre Elemente intern in einem bei Bedarf wachsenden Array aufbewahrt und die folgende Methodenschnittstelle bietet:

```java
public class ListWithInternalArray {
    // Fügt das übergebene Element an der angegebenen Position ein. 
    // Die nachfolgenden Elemente verschieben sich nach hinten.
    public void add(Object elem, int index) { /* ... */ }

    // Liefert eine Referenz auf das Element an der angegebenen Position.
    public Object getElementAt(int index) { /* ... */ }
    
    // Liefert eine Referenz auf das Element an der angegebenen Position und entfernt es 
    // gleichzeitig aus der Liste. Nachfolgende Elemente werden ggf. nach vorne verschoben.
    public Object removeElementAt(int index) { /* ... */ }
    
    // Liefert die Anzahl der Elemente in der Liste
    public int getSize() { /* ... */ }
}
```

Nun wird aber für ein anderes Projekt eine Implementierung für die Datenstruktur **Stapel** benötigt. Deren Methodenschnittstelle soll folgendermaßen aussehen:

```java
public class Stapel {
    // legt ein Element auf den Stapel
    public void push(Object element) { /* ... */ }

    // liefert eine Referenz auf das oberste Element des Stapel
    public Object peek() { /* ... */ }

    // liefert eine Referenz auf das oberste Element des Stapel. 
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() { /* ... */ }
    
    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() { /* ... */ }
}
```

Im Modul 63611 haben die Programmierenden des Teams HagenSoft die Vererbung kennengelernt. Ihnen kommt sofort der Gedanke, dass sie die Klasse `Stapel` zu einer Subklasse der Klasse `ListWithInternalArray` machen könnten. Dann erbt `Stapel` die in `ListWithInternalArray` bereits implementierten Methoden und man kann die Methoden von `Stapel` sehr einfach implementieren, indem diese die geerbten Methoden verwenden. Und schließlich ist jeder Stapel ja eigentlich auch nur eine Liste. Gesagt, getan...

### a) (20 Punkte)

Implementieren Sie die Klassen `ListWithInternalArray` und `Stapel` so, wie das HagenSoft-Teams das vermutlich gemacht hat.

Ob Sie zwischen der Länge der Liste und der Kapazität des internen Arrays unterscheiden (vgl. Ad-hoc-Aufgabe 7 der KE1) oder aber das Array immer genau auf die aktuelle Länge der Liste anpassen, bleibt Ihnen überlassen.

Auf eine Behandlung von Fehlern dürfen Sie der Übersichtlichkeit halber verzichten, insbesondere können Sie davon ausgehen, dass bei der `ListWithInternalArray` die Methoden `getElementAt` und `removeElementAt` nur mit Indexwerten aufgerufen werden, die kleiner sind als die Listenlänge, dass die Methode `add` nur mit Indexwerten aufgerufen wird, die maximal so groß sind wie die Listenlänge, und dass beim `Stapel` die Methoden `pop` oder `peek` nicht auf einem leeren Stapel aufgerufen werden.

### b) (10 Punkte)

Was halten Sie von der Idee von Team HagenSoft? Handelt es sich um einen sinnvollen Einsatz von Vererbung? Wenn nein: Wo sehen Sie Probleme?

### c) (10 Punkte)

Es gibt eine Lösung für das Problem, die ohne Vererbung auskommt, aber trotzdem zur Implementierung der Klasse `Stapel` die Fähigkeiten der bereits existierenden Klasse `ListWithInternalArray` nutzt. Dazu sorgt man dafür, dass jede Instanz von `Stapel` intern eine Instanz von `ListWithInternalArray` hat (**Has-a-Beziehung**). Dann kann sie in ihren Methoden die jeweilige Aufgabe an passende Methoden dieser `ListWithInternalArray` delegieren.

Schreiben Sie eine neue Klasse `Stapel`, die dieses Prinzip umsetzt (also **nicht** Subklasse von `ListWithInternalArray` ist).

---

## Aufgabe 3.3 (20 Punkte) – Auflösen überladener Methodenaufrufe

Gegeben sei das folgende Beispiel mit sechs Methodenaufrufen. Geben Sie für jeden Aufruf detailliert an, welche Schritte durchgeführt werden, um den Aufruf aufzulösen. Wenn der Aufruf erfolgreich aufgelöst werden kann, geben Sie an, welche Methode letztlich ausgeführt würde, wenn nicht, warum er nicht aufgelöst werden kann.

```java
public class Test {
    public static void main(String[] args) {
        Super s1 = new Super();
        Super s2 = new Sub();
        
        Fisch f = new Forelle();
        Forelle fo = new Forelle();
        Vogel v = new Vogel();
        Huhn h = new Huhn();

        s1.m(v, f);  // Aufruf A
        s2.m(v, f);  // Aufruf B
        s1.m(v, h);  // Aufruf C
        s2.m(v, h);  // Aufruf D
        s1.m(h, fo); // Aufruf E
        s1.m(h, h);  // Aufruf F
    }
}

class Super {
    void m(Tier t, Fisch f) {
        System.out.println("1");
    }

    void m(Vogel v, Forelle f) {
        System.out.println("2");
    }

    void m(Tier t, Huhn v) {
        System.out.println("3");
    }

    void m(Huhn h, Vogel v) {
        System.out.println("4");
    }
}

class Sub extends Super {
    void m(Vogel v, Huhn h) {
        System.out.println("5");
    }

    void m(Tier t, Fisch f) {
        System.out.println("6");
    }
}

class Tier { }

class Vogel extends Tier { }

class Huhn extends Vogel { }

class Fisch extends Tier { }

class Karpfen extends Fisch { }

class Forelle extends Fisch { }
```

---

## Aufgabe 3.4 (20 Punkte) – Abstrakte Klassen

Den Programmierenden des Startups HagenSoft ist spätestens seit Einsendeaufgabe 2 der ersten Lektion klar, wozu ihnen die Objektorientierung dienlich sein kann. Sie möchten ihr Tierpark-Programm noch einmal neu schreiben – dieses Mal aber objektorientiert.

Zur Erinnerung: Der Benutzer gibt dem Programm als Parameter eine Art von Tieren an und das Programm nennt daraufhin ein paar elementare Eigenschaften dieser Tiere. Beim Neuschreiben des Programms hat sich das Team zunächst auf zwei Eigenschaften beschränkt. Wird das Programm mit dem Parameter `Hai` aufgerufen, könnte die Ausgabe

```text
Hai:
0 Beine
gefährlich für Menschen: ja
```

lauten.

Dem HagenSoft-Team ist klar, dass sie jede Art von Tieren als einen eigenen Typ realisieren möchten. Ihr Programm nimmt den String-Parameter entgegen und ruft einen entsprechenden Konstruktor auf. Eine Methode `druckeEigenschaften()` innerhalb von `Tier` – einer Superklasse aller Tier-Klassen – soll die verschiedenen Eigenschaften des jeweiligen Tiers auf der Konsole ausgeben. Folgendes haben sie bereits implementiert:

```java
public class AnimalInformationSystem {
    /*
     * Diese Methode liefert Informationen über die Eigenschaften eines Tiers. Dazu 
     * muss der Name der Tier-Art als erster Parameter der Methode übergeben werden.
     */
    public static void main(String[] args) {
        String artName = args[0];
        Tier tier = null;
        if (artName.equals("Pinguin")) {
            tier = new Pinguin();
        }
        if (artName.equals("Löwe")) {
            tier = new Loewe();
        }
        if (artName.equals("Schmetterling")) {
            tier = new Schmetterling();
        }
        
        /* Hier könnten weitere if-Anweisungen für weitere Tierarten stehen. */
        
        if (tier == null) {
            System.out.println("Das Tier " + artName + " wurde noch nicht implementiert.");
        } else {
            System.out.println(artName + ":");
            tier.druckeEigenschaften();
        }
    }
}
```

Bei der Erstellung der Klasse `Tier` ist das Team allerdings ratlos. Die Methode `druckeEigenschaften()` gehört ganz klar in `Tier`, schließlich soll jedes Tier Aussagen über seine Eigenschaften machen können. Umgekehrt kann aber `Tier` die Eigenschaften gar nicht kennen, schließlich sind sie ja unterschiedlich, je nachdem, was für ein Tier sich hinter dem Tier wirklich verbirgt.

### a) (10 Punkte)

Erklären Sie, welches komfortable Konstrukt in Java erlaubt, das beschriebene Problem zu lösen. Vergessen Sie aber nicht zu erwähnen, was für Einschränkungen sich daraus ergeben – auch wenn sie in dem Tierpark-Programm nicht zutage treten.

### b) (10 Punkte)

Implementieren Sie entsprechend die Klassen `Pinguin`, `Loewe`, `Schmetterling` und `Tier` und lassen Sie `druckeEigenschaften()` zu jedem Tier-Objekt ausgeben, wie viele Beine es hat und ob es gefährlich für Menschen ist. Verwenden Sie dazu bitte in Ihren Klassen **keine expliziten Attribute**, also weder Instanzvariablen noch Klassenvariablen noch benannte Konstanten!
