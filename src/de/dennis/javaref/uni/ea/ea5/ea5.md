# Einsendeaufgaben zum Modul 63611 – „Einführung in die objektorientierte Programmierung“
## Lektion 05

Bitte beachten Sie: Die Einsendeaufgaben sind bei Modul 63611 nicht ohne weiteres mit den Klausuraufgaben gleichzusetzen. In der Klausur kommen auch Aufgaben vor, zu deren Lösung Sie Begriffe und/oder konzeptionelle Zusammenhänge erklären müssen. Diese können den Einsendeaufgaben nicht sinnvoll abgefragt werden, weil man die Antworten einfach im Lehrtext nachlesen kann.

Das Lehrgebiet stellt Ihnen aber die Klausuren der letzten Semester incl. Musterlösungen zur Verfügung, damit Sie einen realistischen Eindruck von der Klausur bekommen können. Sie finden diese in der Moodle-Umgebung des Moduls unter „Arbeitsmaterial“.

1. Die Abgabe erfolgt ausschließlich über das Online-Übungssystem.
2. Als Beleger bzw. Belegerin des Moduls 63611 können Sie mit Ihrem FernUni-Account Ihre Lösungen dort einstellen.
3. Eine Handkorrektur Ihrer Einsendung erfolgt nicht automatisch, sondern nur auf Anforderung. Weitere Informationen dazu finden Sie im Moodle des Moduls unter „Einsendeaufgaben“.
4. Sobald eine Korrektur der Aufgaben für Sie bereitsteht, werden Sie per E-Mail informiert.
5. Sollten Sie in Sonderfällen das Online-Übungssystem nicht nutzen können (z.B. wegen körperlicher Einschränkungen oder als JVA-Insasse), nehmen Sie bitte telefonisch (02331 - 987 - 2998) oder per E-Mail (sekretariat.steimann@fernuni-hagen.de) Kontakt mit unserem Sekretariat auf.

---

## Aufgabe 1: Anonyme Klassen und Lambda-Ausdrücke (20 Punkte)

Gegeben seien die folgenden Deklarationen:

```java
// Ein Interface für Funktionen, welche eine Ganzzahl auf eine andere abbilden
public interface IntIntFunction {
    int perform(int input);
}

public class FunctionOperator {

    // Führt eine übergebene Funktion so oft aus, bis der gewünschte Zielwert erreicht ist.
    // Beim ersten Aufruf wird der übergebene Startwert als Eingabe der Funktion verwendet,
    // bei den folgenden Aufrufen dann jeweils das Ergebnis des letzten Aufrufs. Am Ende
    // wird die Anzahl der Aufrufe zurückgegeben, die zum Erreichen des Zielwertes nötig war.
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

Schreiben Sie eine Klasse **FunctionOperatorTest** in deren **main**-Methode Sie zunächst eine Instanz der Klasse **FunctionOperator** erzeugen. Ergänzen Sie Ihre **main**-Methode dann um die folgenden Aktionen:

### a) (3 Punkte)
Erzeugen Sie eine Instanz einer anonymen Klasse, die das Interface **IntIntFunction** so implementiert, dass die Methode **perform** der Funktion **f1(x) = x - 1** entspricht. Rufen Sie auf Ihrem **FunctionOperator** die Methode **operate** auf und übergeben Sie Ihre Instanz der anonymen Klasse, den Startwert **10** und den Zielwert **-10**. Geben Sie den Rückgabewert der Methode **operate** auf die Konsole aus.

### b) (4 Punkte)
Erzeugen Sie eine Instanz einer anonymen Klasse, die das Interface **IntIntFunction** so implementiert, dass die Methode **perform** der folgenden Funktion entspricht:

- **f2(x) = x/2** wenn x gerade
- **f2(x) = 3x + 1** wenn x ungerade.

Diese Funktion sollte Ihnen von den „wundersamen Zahlen“ her bekannt vorkommen. Rufen Sie auf Ihrem **FunctionOperator** die Methode **operate** auf und übergeben Sie Ihre Instanz der anonymen Klasse, den Startwert **27** und den Zielwert **1**. Geben Sie den Rückgabewert der Methode **operate** – also **wunder(27)** – auf die Konsole aus.

### c) (5 Punkte)
Rufen Sie auf Ihrem **FunctionOperator** die Methode **operate** auf und übergeben Sie einen **Lambda-Ausdruck**, welcher der obigen Funktion **f1** entspricht, den Startwert **10** und den Zielwert **-10**. Geben Sie den Rückgabewert der Methode **operate** auf die Konsole aus.

### d) (8 Punkte)
Rufen Sie auf Ihrem **FunctionOperator** die Methode **operate** auf und übergeben Sie einen **Lambda-Ausdruck**, welcher der obigen Funktion **f2** entspricht, den Startwert **27** und den Zielwert **1**. Geben Sie den Rückgabewert der Methode **operate** – also **wunder(27)** – auf die Konsole aus.

**Tipp:** Aus Kurseinheit 1 kennen Sie einen Ausdruck, der Ähnliches leistet, wie eine If-Else-Anweisung. Das könnte hier sehr nützlich sein…

---

## Aufgabe 2: AWT – Zeichnen (30 Punkte)

Gegeben sei die folgende Klasse, die als Model für die Implementierung eines Kurzzeitweckers dienen soll:

```java
public class EggTimerModel {

    // vorgesehene Laufzeit in Sekunden
    private int totalTimeInSeconds;

    // verstrichene Zeit in Sekunden
    private int elapsedTimeInSeconds;

    // erzeugt eine neue Instanz dieser Klasse für die angegebene Laufzeit
    public EggTimerModel(int totalTimeInSeconds) {
        this.totalTimeInSeconds = totalTimeInSeconds;
    }

    // liefert den Zeitanteil, der bereits verstrichen ist
    public double getElapsedPart() {
        return (double) elapsedTimeInSeconds / totalTimeInSeconds;
    }

    // erhöht die verstrichene Zeit um eine Sekunde
    public void increaseElapsedTime() {
        elapsedTimeInSeconds++;
    }
}
```

### a) (20 Punkte)
Erstellen Sie eine von **java.awt.Canvas** abgeleitete Klasse **EggTimerCanvas**, welche den Zustand eines solchen Models in Form eines **Tortendiagramms** grafisch darstellt. Orientieren Sie sich dabei an folgender Abbildung, in der ein Model dargestellt wird, bei dem **4 von 60 Sekunden** bereits vergangen sind.

**Hinweise zur Umsetzung der Aufgabe:**

1. Instanzen der Klasse **EggTimerCanvas** sollen jeweils eine Instanz der Klasse **EggTimerModel** kennen („Hat-ein-Beziehung“). Eine Referenz auf „sein“ Model soll einem **EggTimerCanvas** in seinem Konstruktor übergeben werden.
2. Mit der Methode **setPreferredSize** kann man die „Wunschgröße“ einer Komponente festlegen. Der Methode muss ein Objekt der Klasse **java.awt.Dimension** übergeben werden. Finden Sie mit Hilfe der API-Dokumentation der Java-Standard-Klassenbibliothek heraus, wie Sie ein solches Objekt erzeugen und setzen Sie die Wunschgröße Ihrer **EggTimerCanvas**-Instanzen im Konstruktor ihrer Klasse auf **320 x 320 Pixel**.
3. Der Kreis des Tortendiagramms soll einen Durchmesser von **300 Pixeln** haben und **mittig** auf das **EggTimerCanvas** gezeichnet werden. Geeignete Methoden zum Zeichnen bzw. Füllen von Kreisen und Kreisbögen finden Sie in der Klasse **java.awt.Graphics**. Verwenden Sie diese Methoden in der Methode **paint** Ihrer Klasse **EggTimerCanvas** auf dem **Graphics**-Objekt, welches das AWT-Framework dieser Methode beim Aufruf übergibt, wenn es ein Neuzeichnen des **EggTimerCanvas** durchführt.

### b) (10 Punkte)
Schreiben Sie eine Testklasse für Ihre Klasse **EggTimerCanvas**. Ergänzen Sie dazu die untenstehenden Klassenskizze, indem Sie unter den Kommentaren entsprechenden Quellcode einfügen.

Wenn Sie alles richtig gemacht haben, wird zunächst ein Tortendiagramm angezeigt, welches das Model in dem Zustand zeigt, den es bei der Erzeugung hat (**0 von 60 Sekunden** verstrichen). Jede Sekunde vergrößert sich der grüne Bereich, bis nach vier Sekunden dann der oben abgebildete Zustand erreicht ist (**4 von 60 Sekunden** verstrichen).

```java
import java.awt.Frame;
import java.awt.event.*;

public class EggTimerCanvasTest {

    public static void main(String[] args) {

        // Erzeugen eines EggTimerModel für eine Laufzeit von 60 Sekunden.

        // Erzeugen eines EggTimerCanvas, das das oben erzeugte Model verwendet.

        // Erzeugen eines Haupfensters mit dem Titel "Kurzzeitwecker".

        // Anmelden eines "anonymen" Listeners, der beim Schließen des
        // Hauptfensters die Anwendung beendet.

        // Einfügen des EggTimerCanvas im Zentralbereich des Hauptfensters.

        // Dieser Aufruf sorgt dafür, dass der LayoutManager des Hauptfensters
        // dessen Größe gemäß der Wunschgrößen der auf diesem angeordneten
        // Komponenten berechnet. Hier müssen Sie nichts einfügen.
        frame.pack();

        // Positionieren des Fensters in der Bildschirmmitte
        // (siehe Ad-hoc-Aufgabe 5 der KE5).

        // Sichtbarmachen des Fensters.
        for(int i = 0; i < 4; i++) {

            // Eine Sekunde Pause (wird in KE6 näher erläutert).
            // Hier müssen Sie nichts einfügen.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // "Hochzählen" des Models um eins

            // Anstoßen eines Neuzeichnens des EggTimerCanvas.
        }
    }
}
```

---

## Aufgabe 3: Model und Controller (25 Punkte)

Gegeben seien die folgenden Deklarationen:

```java
public interface TickListener {
    void tickPerformed();
}

public class EggTimerModel {

    // vorgesehene Laufzeit in Sekunden
    private int totalTimeInSeconds;

    // verstrichene Zeit in Sekunden
    private int elapsedTimeInSeconds;

    // erzeugt eine neue Instanz dieser Klasse für die angegebene Laufzeit
    public EggTimerModel(int totalTimeInSeconds) {
        this.totalTimeInSeconds = totalTimeInSeconds;
    }

    // liefert den Zeitanteil, der bereits verstrichen ist
    public double getElapsedPart() {
        return (double) elapsedTimeInSeconds / totalTimeInSeconds;
    }

    // erhöht die verstrichene Zeit um eine Sekunde
    public void increaseElapsedTime() {
        elapsedTimeInSeconds++;
    }
}
```

Außerdem haben wir, um die Aufgabe etwas interessanter zu gestalten, eine Klasse **EventBasedTimer** erstellt. Sie müssen den Code dieser Klasse nicht im Detail verstehen. Es reicht wenn Sie folgendes wissen:

- Instanzen der Klasse **EventBasedTimer** sind ereignisbasierte Timer: Man kann bei Ihnen mit der Methode **addTickListener** Objekte des Typs **TickListener** als Beobachter anmelden.
- Wenn der Timer gestartet wird, werden alle angemeldeten Beobachter im Sekundentakt durch Aufruf ihrer Methode **tickPerfomed** informiert, so lange der Timer läuft.
- Der Timer kann mit der Methode **start** gestartet und mit der Methode **stop** beendet werden.

```java
import java.util.*;

public class EventBasedTimer {

    private Timer internalTimer = new Timer();
    private List<TickListener> listeners = new ArrayList<TickListener>();

    // Meldet einen TickListener beim Timer an.
    public void addTickListener(TickListener listener) {
        listeners.add(listener);
    }

    // Startet diesen Timer.
    public void start() {
        internalTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (TickListener tickListener : listeners) {
                    tickListener.tickPerformed();
                }
            }
        }, 1000, 1000);
    }

    // Stoppt diesen Timer.
    public void stop() {
        internalTimer.cancel();
    }
}
```

### a) (20 Punkte)
Schreiben Sie eine Klasse **EggTimerController**, welche die folgenden Bedingungen erfüllt:

1. Instanzen der Klasse **EggTimerController** sollen jeweils eine Instanz der Klasse **EggTimerModel** kennen („Hat-ein-Beziehung“). Eine Referenz auf „sein“ Model soll einem **EggTimerController** in seinem Konstruktor übergeben werden.
2. Instanzen der Klasse **EggTimerController** sollen jeweils eine Instanz der Klasse **EventBasedTimer** kennen („Hat-ein-Beziehung“). Diesen Timer erzeugen sie sich im Zuge ihrer eigenen Initialisierung selbst.
3. Jeder **EggTimerController** meldet sich im Zuge seiner eigenen Initialisierung bei „seinem“ Timer als Beobachter an. Anschließend startet er direkt den Timer.
4. Wird ein **EggTimerController** von seinem Timer benachrichtigt, ruft er auf seinem Model dessen Methode **increaseElapsedTime** auf. Anschließend fragt er beim Model den bereits verstrichenen Zeitanteil ab und gibt das Ergebnis auf die Konsole aus.
5. Wenn der bereits verstrichene Zeitanteil gleich **1** ist, stoppt der **EggTimerController** den Timer.

### b) (5 Punkte)
Testen Sie das Zusammenspiel der Klassen **EggTimerController**, **EggTimerModel** und **EventBasedTimer** in einer Testklasse mit **main**-Methode.

---

## Aufgabe 4: Model, View, Controller (25 Punkte)

In dieser Aufgabe sollen die Klassen **EggTimerModel**, **EggTimerCanvas**, **EggTimerController** und **EventBasedTimer** aus den vorigen beiden Aufgaben zu einem vollständigen Programm mit grafischer Oberfläche zusammengefügt werden. Dazu werden Sie einige Änderungen an den Klassen vornehmen.

### a) (10 Punkte)
An der Stelle in der Klasse **EggTimerController**, an der bisher eine Ausgabe auf die Konsole erfolgte, soll stattdessen dafür gesorgt werden, dass sich das View – eine Instanz der Klasse **EggTimerCanvas** – aktualisiert. Damit der Controller diese Aktualisierung des Views auslösen kann, muss er es kennen („Hat-ein-Beziehung“). Nehmen Sie die dazu nötigen Änderungen an der Klasse **EggTimerController** vor.

### b) (5 Punkte)
Schreiben Sie eine Klasse **MVCEggTimerMain**, in deren **main**-Methode Sie Model, View und Controller auf eine sinnvolle Weise miteinander verbinden und das View in einer Instanz der Klasse **Frame** anzeigen. Sie können und sollen sich bei der Erstellung der Klasse **MVCEggTimerMain** weitgehend an der Klasse **EggTimerCanvasTest** aus Aufgabe 2 orientieren.

### c) (10 Punkte)
Bis jetzt läuft der Kurzzeitwecker sofort los, wenn das Programm gestartet wird. Ändern Sie die Klassen **MVCEggTimerMain** und **EggTimerController** so, dass die folgenden Bedingungen erfüllt sind:

1. Im Südbereich des Hauptfensters befindet sich ein Knopf mit der Aufschrift **„Start“**.
2. Der Controller wird bei diesem Knopf als Beobachter für **actionPerformed**-Ereignisse angemeldet.
3. Erst, wenn der Knopf gedrückt wird, soll der Controller den Timer starten.
4. Wenn der Knopf gedrückt wurde, soll er deaktiviert werden, so dass erneutes Drücken kein Ereignis mehr auslöst. Um Komponenten aktiv bzw. inaktiv zu schalten, gibt es eine Methode in der Klasse **Component**.
