# Einsendeaufgaben 63611 – Lektion 05 (EA5)

> Format: kompakte Aufgabenübersicht im Stil einer „EA*.md“-Zusammenfassung.  
> Hinweis: Die folgenden Aufgabenstellungen sind **inhaltlich** aus dem PDF übernommen, aber **sprachlich neu formuliert** (paraphrasiert).

---

## Aufgabe 1 – Anonyme Klassen & Lambda-Ausdrücke (20 Punkte)

### Gegeben
Du hast ein funktionales Interface `IntIntFunction` (int → int) und einen Operator, der die Funktion wiederholt ausführt, bis ein Zielwert erreicht ist.

**Vorgaben (sinngemäß):**
```java
public interface IntIntFunction {
    int perform(int input);
}

public class FunctionOperator {
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
```

### Aufgabe: `FunctionOperatorTest`
Schreibe eine Klasse `FunctionOperatorTest` mit `main`, in der du zuerst `FunctionOperator op = new FunctionOperator();` erzeugst und dann:

#### a) Anonyme Klasse für f1 (3 Punkte)
- Erzeuge eine **anonyme Klasse**, die `IntIntFunction` implementiert, sodass `perform` der Funktion  
  **f1(x) = x − 1** entspricht.
- Rufe `op.operate(...)` mit Start **10** und Ziel **-10** auf.
- Gib die Anzahl der Aufrufe auf der Konsole aus.

#### b) Anonyme Klasse für f2 (4 Punkte)
- Erzeuge eine **anonyme Klasse** für die Funktion  
  **f2(x) = x/2 (falls x gerade)**, sonst **f2(x) = 3x + 1**.
- Rufe `op.operate(...)` mit Start **27** und Ziel **1** auf.
- Gib das Ergebnis (entspricht „wunder(27)“) aus.

#### c) Lambda für f1 (5 Punkte)
- Rufe `op.operate(...)` auf und übergib diesmal einen **Lambda-Ausdruck** für **f1(x)=x−1**.
- Start **10**, Ziel **-10**, Ergebnis ausgeben.

#### d) Lambda für f2 (8 Punkte)
- Rufe `op.operate(...)` auf und übergib einen **Lambda-Ausdruck** für **f2** (wie in b).
- Start **27**, Ziel **1**, Ergebnis ausgeben.
- Tipp aus dem Skript: Nutze einen Ausdruck, der wie „if-else“ funktioniert (typisch: ternärer Operator `?:`).

---

## Aufgabe 2 – AWT Zeichnen (30 Punkte)

### Gegeben: Model
Ein Model für einen Kurzzeitwecker:

```java
public class EggTimerModel {
    private int totalTimeInSeconds;
    private int elapsedTimeInSeconds;

    public EggTimerModel(int totalTimeInSeconds) {
        this.totalTimeInSeconds = totalTimeInSeconds;
    }

    public double getElapsedPart() {
        return (double) elapsedTimeInSeconds / totalTimeInSeconds;
    }

    public void increaseElapsedTime() {
        elapsedTimeInSeconds++;
    }
}
```

### a) `EggTimerCanvas` (20 Punkte)
Erstelle eine Klasse `EggTimerCanvas extends java.awt.Canvas`, die den Zustand des `EggTimerModel`
als **Tortendiagramm** visualisiert.

**Anforderungen:**
1. `EggTimerCanvas` **kennt** genau ein `EggTimerModel` (hat-ein).  
   → Übergabe der Model-Referenz im Konstruktor.
2. Setze im Konstruktor eine **Preferred Size** von **320×320** (über `setPreferredSize(new Dimension(...))`).
3. Zeichne in `paint(Graphics g)` ein Tortendiagramm:
    - Kreis-Durchmesser: **300 px**
    - Kreis **zentriert** im Canvas
    - Du nutzt passende Methoden aus `java.awt.Graphics` zum Zeichnen/Füllen von Kreis/Kreisbögen.

### b) Testklasse `EggTimerCanvasTest` (10 Punkte)
Ergänze die vorgegebene Test-Skizze so, dass:
- ein `EggTimerModel` mit **60 Sekunden** erzeugt wird,
- ein `EggTimerCanvas` dieses Model benutzt,
- ein `Frame` mit Titel **"Kurzzeitwecker"** erstellt wird,
- ein **anonymer Listener** beim Schließen das Programm beendet,
- der Canvas im **Center** eingefügt wird,
- `frame.pack()` aufgerufen wird,
- das Fenster **zentriert** wird (Hinweis: „Ad-hoc-Aufgabe 5“),
- das Fenster sichtbar wird,
- danach **4×** im Abstand von **1 Sekunde**:
    - Model hochgezählt wird (`increaseElapsedTime`)
    - Canvas neu gezeichnet wird (`repaint`)

---

## Aufgabe 3 – Model & Controller (25 Punkte)

### Gegeben
- Interface `TickListener`:
```java
public interface TickListener {
    void tickPerformed();
}
```

- `EggTimerModel` (wie oben)

- `EventBasedTimer` (Sekundentakt, Observer-Prinzip):
    - `addTickListener(listener)` registriert Beobachter
    - `start()` informiert alle TickListener 1× pro Sekunde
    - `stop()` beendet den Timer

### a) `EggTimerController` (20 Punkte)
Schreibe `EggTimerController` mit folgenden Eigenschaften:

1. Controller **kennt** ein `EggTimerModel` (hat-ein) → Übergabe im Konstruktor.
2. Controller **kennt** einen `EventBasedTimer` (hat-ein) → erzeugt ihn selbst bei der Initialisierung.
3. Controller meldet sich bei seinem Timer als `TickListener` an und startet den Timer (gemäß Aufgabenblatt: direkt nach Initialisierung).
4. Bei jedem Tick:
    - `model.increaseElapsedTime()`
    - `model.getElapsedPart()` abfragen und **auf die Konsole ausgeben**
5. Wenn `elapsedPart == 1` → Timer stoppen.

### b) Testklasse (5 Punkte)
Schreibe eine `main`, die das Zusammenspiel aus `EggTimerModel`, `EggTimerController` und `EventBasedTimer` demonstriert.

---

## Aufgabe 4 – MVC komplett (25 Punkte)

Ziel: Aus Model (`EggTimerModel`), View (`EggTimerCanvas`), Controller (`EggTimerController`) und `EventBasedTimer`
ein vollständiges GUI-Programm bauen.

### a) Controller aktualisiert View statt Konsole (10 Punkte)
Ändere `EggTimerController` so, dass er **nicht mehr auf die Konsole schreibt**, sondern stattdessen die View aktualisiert:
- Controller muss `EggTimerCanvas` kennen (hat-ein),
- im Tick soll ein Update/Neuzeichnen der View ausgelöst werden.

### b) `MVCEggTimerMain` (5 Punkte)
Schreibe `MVCEggTimerMain` (mit `main`), die:
- Model, View, Controller sinnvoll verdrahtet,
- die View in einem `Frame` anzeigt,
- sich dabei an der Testklasse aus Aufgabe 2 orientiert.

### c) Start-Button steuert Start (10 Punkte)
Ändere `MVCEggTimerMain` und `EggTimerController` so, dass:

1. Im **South**-Bereich des Frames gibt es einen Button **„Start“**.
2. Der Controller wird als Listener für `actionPerformed` beim Button registriert.
3. Der Timer startet **erst nach Klick** auf „Start“.
4. Nach dem ersten Klick wird der Button **deaktiviert**, sodass weitere Klicks keine Events mehr auslösen  
   (Hinweis: Dafür gibt es eine Methode in `java.awt.Component`).

---

## Abgabe / Hinweise
- Abgabe erfolgt über das Online-Übungssystem (wie im Aufgabenblatt beschrieben).
