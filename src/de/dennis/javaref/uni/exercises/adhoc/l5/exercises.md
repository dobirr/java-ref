[ ] **Ad-hoc-Aufgabe 1**

1. Ergänzen Sie das obige Beispiel um ein Filterprädikat, welches für alle Personen
   steht, die leichter als 60.0 kg sind.
2. Bauen Sie das Beispiel so um, dass aus einer Liste von Zeichenketten alle Palindrome
   auf die Standardausgabe ausgegeben werden. Palindrome sind Zeichenketten,
   die vorwärts wie rückwärts gelesen identisch sind. Sie können den entsprechenden
   Test komplett selbst programmieren oder dazu die Methode reverse der
   Klasse StringBuilder „erforschen“ (siehe API-Doku dieser Klasse). Die Methode
   equalsIgnoreCase der Klasse String könnte ebenfalls nützlich sein.


[ ] **Ad-hoc-Aufgabe 2**

Ändern Sie das Anwendungsbeispiel für die Klasse PredicatePalindrom aus der
Musterlösung zur Ad-hoc-Aufgabe 1 so ab, dass diese Klasse nicht mehr benötigt wird.
Stattdessen soll in der Klasse PalindromTest eine Instanz einer entsprechenden anonymen
lokalen Klasse als Filterprädikat verwendet werden.


[ ] **Ad-hoc-Aufgabe 3**

Ändern Sie das Anwendungsbeispiel für die Klasse PredicatePalindrom aus der
Musterlösung zur Ad-hoc-Aufgabe 1 so ab, dass diese Klasse nicht mehr benötigt wird.
Stattdessen soll in der Klasse PalindromTest ein Lambda-Ausdruck als Filterprädikat
verwendet werden.


[ ] **Ad-hoc-Aufgabe 4**

Es soll ein Weckdienst programmiert werden, bei dem sich Kundinnen und Kunden anmelden
können, die dann zu einer bestimmten Uhrzeit (nur volle Stunden) geweckt werden.
Dazu bestehen folgende Vorgaben:

1. Der Weckdienst selbst wird durch die Klasse WakeUpService realisiert.
2. Die Weckzeit eines bestimmten Weckdienstes wird dem Konstruktor der Klasse
   WakeUpService als int-Wert zwischen 0 und 23 übergeben.
3. Bei einem Weckdienst lassen sich Objekte des Typs WakeUpServiceClient anmelden.
   Dazu existiert in der Klasse WakeUpService eine Methode register.
   Der Typ WakeUpServiceClient ist ein Interfacetyp und deklariert eine Methode
   wakeUp der man die Uhrzeit als Parameter vom Typ int übergeben kann. Der
   Rückgabetyp der Methode wakeUp ist void.
4. Nach dem Anmelden der zuWeckenden wird derWeckdienst durch Aufruf seiner
   Methode startService gestartet und prüft nun regelmäßig, ob seine Weckzeit
   erreicht ist.
5. Wenn die Weckzeit erreicht ist, werden alle zu Weckenden durch Aufruf ihrer im
   Interface WakeUpServiceClient deklarierten Methode wakeUp benachrichtigt.
   Der Methode wakeUp wird die Uhrzeit als Parameter vom Typ int übergeben.
   Anschließend beendet sich der Weckdienst.

Erstellen Sie die benötigten Klassen bzw. Interfaces für den oben beschriebenen Weckdienst.
Orientieren Sie sich dabei am Beobachter-Entwurfsmuster.
Für die Klasse WakeUpService haben wir eine Grundstruktur erstellt, in welcher die
Methode startService bereits ausprogrammiert wurde. Die Arbeitsweise dieser Methode
müssen Sie nicht im Detail verstehen, da sie Elemente enthält, die im Lehrtext nicht
oder erst später behandelt werden. Sie finden diese Grundstruktur und die Fortsetzung
der Aufgabe auf der folgenden Seite.

Erstellen Sie eine Testklasse, in der Sie eine Instanz der Klasse WakeUpService für eine
bevorstehende Uhrzeit erzeugen. Melden Sie einige Kundinnen und Kunden an, die mit
unterschiedlichen Ausgaben auf den Weckvorgang reagieren und starten Sie den Weckdienst.
Als Kundinnen und Kunden verwenden Sie bitte Instanzen sowohl benannter
Klassen als auch anonymer lokaler Klassen.
Simulieren Sie einen weiteren Kunden, indem Sie der Anmelde-Methode des Weckdiensts
einen Lambda-Ausdruck (siehe Abschn. 11.1.4) als “Erfüllung“ der Methode
wakeup() übergeben. Dieser soll lediglich eine passende Meldung auf die Standardausgabe
ausgeben, an der man erkennt, dass er ausgewertet wurde. Da die Methode wakeUp
als void deklariert ist, handelt es sich hier um einen etwas untypischen Anwendungsfall
für einen Lambda-Ausdruck: Es werden nicht Eingangsparameter auf einen Rückgabewert
abgebildet, sondern Eingangsparameter auf eine oder mehrere Anweisungen. Für
solche Fälle ist es möglich, rechts vom Pfeil des Lambda-Ausdrucks die entsprechende
Anweisung zu notieren. Handelt es sich um mehrere Anweisungen, können diese als
Block (in Schweifklammern) notiert werden.

Grundstruktur für die Klasse WakeUpService:

```java
public class WakeUpService {
    // Attribute
    // Konstruktor
    // Methoden
    public void startService() {
        boolean finished = false;
        System.out.println("Weckdienst für Weckzeit " +
        wakeUpTime + ":00 Uhr gestartet.");
        while (!finished) {
            int currentHour = LocalTime.now().getHour();
            if (currentHour == wakeUpTime) {
            wakeUpAllClients();
            finished = true;
        }
        try {
            Thread.sleep(1000); // Eine Sekunde Pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```


[ ] **Ad-hoc-Aufgabe 5**

1. Ändern Sie die Klasse FrameTest von S. 322 so ab, dass das Programm sich beendet,
   wenn Benutzende ein Schließen des Fensters anfordern (beispielsweise durch
   Anklicken der rechten oberen Schaltfläche × unter MS-Windows). Wenn dazu
   weitere Klassen oder Interfaces benötigt werden, erstellen Sie diese. Hinweise:
   • Durch diese Benutzenden-Aktion tritt am Fenster das Ereignis windowClosing
   ein.
   • Zum Beenden des Programms können Sie die Anweisung
   System.exit(0) verwenden.
   • Alle weiteren benötigten Informationen finden Sie in Abschn. 12.2.2.4, insbesondere
   auf S. 319.
2. Neben der Methode setLocation besitzt ein Frame-Objekt auch die von der Superklasse
   Window geerbte Methode setLocationRelativeTo. Versuchen Sie,
   mit Hilfe der API-Dokumentation dieser Methode herauszufinden, wie Sie erreichen
   können, dass das Fenster auf dem Bildschirm zentriert dargestellt wird.


[ ] **Ad-hoc-Aufgabe 6**

Da die Klasse ClosingBeobachter nur innerhalb des Konstruktors von BaseFrame
verwendet wird, bietet es sich an, sie als anonyme Klasse (vgl. Abschn. 11.1.3, S. 296) zu
realisieren. Ändern Sie die Klasse BaseFrame entsprechend ab und schreiben Sie einen
passenden Test.


[ ] **Ad-hoc-Aufgabe 7**

Ändern Sie das ButtonTest-Beispiel so ab, dass Benutzende die Anwendung zwar weiterhin
sowohl über das entsprechende Bedienelement des Fensters als auch über den
„Programm beenden“-Knopf beenden können, die entsprechende Aktion aber nur noch
an einer Stelle implementiert ist. Schreiben Sie dazu einen flexibel einsetzbaren separaten
„Baustein“, den man bei beliebigen Quellen für die Ereignisse windowClosing und actionPerformed
anmelden kann. (Die Verwendung der auf den ersten Blick so praktischen
Klasse BaseFrame entfällt dabei zwangsläufig).