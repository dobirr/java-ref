[ ] **Ad-hoc-Aufgabe 1**

Gegeben seien die folgenden beiden Listen von Objekten (bzw. Klassen von Objekten)
und Nachrichten:
Klassen: Fahrrad, Lebewesen, Biene, Motorrad, Motorfahrzeug, Objekt, Blume, Auto,
Fortbewegungsmittel
Nachrichten: starteMotor, transportierePerson, pflanzeDichFort, sammleHonig, verwelke
1. Überlegen Sie, welche Objekte welche Nachrichten verstehen könnten.
2. Versuchen Sie, die Klassen anhand dieser Eigenschaft in einer Klassenhierarchie
   analog zu Abbildung 1.1 anzuordnen.
3. Ordnen Sie jede Nachricht der Klasse zu, die in der Hierarchie möglichst weit
   oben steht und für die gilt, dass alle ihre Objekte (incl. Objekte ihrer Subklassen)
   diese Nachricht verstehen.
4. Welche der Klassen würden Sie in dieser Hierarchie als abstrakte Klassen ansehen?
   Was fällt Ihnen bzgl. deren Anordnung auf?
5. Wenn Sie jetzt eine zusätzliche Klasse Reitpferde in Ihre Hierarchie aufnehmen
   sollten, welche Folgen hätte das für die Hierarchie?



[ ] **Ad-hoc-Aufgabe 2**  

1. Wie sieht das Objektgeflecht aus, das durch folgende Anweisung erzeugt wird?
    ```java
    boolean[][] b = new boolean[2][];
    ```
2. Überlegen Sie, was passieren wird, wenn anschließend diese Anweisung ausgeführt
   wird:
    ```java
       b[0][0] = true;
    ```
3. Seien value und newValue Variablen vom Typ int. Welchen Wert hat value
   nach der folgenden Anweisung?
    ```java
       value = newValue > value ? newValue : value;
    ```


[ ] **Ad-hoc-Aufgabe 3**  

1. Erstellen Sie mit Hilfe der Entwicklungsumgebung Eclipse ein Programm, welches
   den Text „Hello World!“ auf der Standardausgabe ausgibt, übersetzen Sie es
   und führen Sie es aus.
2. Ändern Sie das Programm so ab, dass es Sie mit Ihrem Vor- und Nachnamen begrüßt.
   Den Namen und den Vornamen übergeben Sie dem Programm beim Programmstart
   als Argumente. Wie Sie die Argumente übergeben, wird im Vorkurs
   zum Modul 63611 (zu finden in Moodle) im Abschnitt „Erste Schritte mit Java und
   Eclipse“ gezeigt.
3. Was geschieht, wenn Sie dieses Programm starten und dabei statt Ihres Vor- und
   Nachnamens nur ein Argument übergeben?


[ ] **Ad-hoc-Aufgabe 4** 

Erstellen Sie mit Hilfe der Entwicklungsumgebung Eclipse ein Programm, in dessen
main-Methode Sie einige Variablen verschiedener Typen deklarieren und diesen Variablen
etwas zuweisen. Nehmen Sie dabei auch einige Zuweisungen vor, von denen Sie
erwarten, dass der Compiler sie aufgrund der Typprüfung beim Kompilieren zurückweisen
sollte. Schauen Sie sich an, wie Eclipse solche Typfehler markiert. Lesen Sie die
von Eclipse generierten Fehlerbeschreibungen und versuchen Sie, deren Aussagen nachzuvollziehen.


[ ] **Ad-hoc-Aufgabe 5** 

Die in Ad-hoc-Aufgabe 2 verwendete „unvollständige Initialisierung mehrdimensionaler
Arrays“ wird insbesondere dann benötigt, wenn man mehrdimensionale Arrays erstellen
will, die „nicht rechteckig sind“, sog. „Jagged Arrays“. Schreiben Sie ein Programm,
welches mit Hilfe zweier geschachtelter for-Schleifen ein „zweidimensionales
Zehner-int-Treppchen“ erzeugt und initialisiert, also ein int[ ][ ], dessen Elemente Referenzen
auf int[ ]-Arrays mit zunehmender Länge (von 1 bis 10) sind.
Geben Sie anschließend (also nicht schon beim Erzeugen des Arrays!) mit zwei geschachtelten
for-each-Schleifen die Elemente des „Treppchens“ so auf die Standardausgabe aus,
dass dessen Struktur erkennbar wird. Eine hübsche Ausgabe könnte z. B. so aussehen:
```java
0
0 1
0 1 2
0 1 2 3
0 1 2 3 4
0 1 2 3 4 5
0 1 2 3 4 5 6
0 1 2 3 4 5 6 7
0 1 2 3 4 5 6 7 8
0 1 2 3 4 5 6 7 8 9
```

Dabei entspricht jede Zeile einem Iterationsschritt über das „Array der ersten Dimension“,
jede Zahl in einer Zeile einem Element eines „Arrays der zweiten Dimension“.
Diese Aufgabe ist nicht ganz einfach, deshalb noch einmal der Hinweis: Fragen Sie bei
Problemen bitte im Diskussionsforum (Moodle) nach! Dort bekommen Sie ggf. erst einmal
Erklärungen und kleinere Tipps, die Ihnen weiterhelfen, was wesentlich sinnvoller
ist, als wenn Sie einfach nur in die Lösung schauen würden.


[ ] **Ad-hoc-Aufgabe 6** 

Sehen Sie sich die folgende Skizze einer Klasse mit Ausnahmebehandlung an. Ist die
skizzierte Vorgehensweise korrekt? Wenn nein, was würden Sie ändern?
```java
public class ExceptionTest {
    public static void main(String[] args) {
        try {
// allerlei Anweisungen die verschiedene
// Exceptions ausloesen können
        } catch (Exception e) {
// Behandlung
        } catch (ArrayIndexOutOfBoundsException e) {
// Behandlung
        } catch (NumberFormatException e) {
// Behandlung
        }
    }
}
```


[ ] **Ad-hoc-Aufgabe 7** 

Vorbemerkung: In dieser Aufgabe werden Sie erstmals ein Programm erstellen, das aus
mehreren von Ihnen geschriebenen Klassen besteht. Legen Sie bitte jede Klasse in einer
eigenen Übersetzungseinheit an. Wenn Sie Eclipse verwenden, erstellen Sie dazu eine
neue Klasse, indem Sie aus dem Menü „File“ den Menüpunkt „New – Class“ verwenden.
Zweite Vorbemerkung: Diese Aufgabe ist vergleichsweise schwierig. Um sie zu lösen,
müssen Sie einiges, was Sie aus der imperativen Programmierung kennen, mit dem zusammenbringen,
was Sie in dieser Lektion gelesen haben. Dafür ist sie aber gut geeignet,
häufig vorkommende Lücken und Missverständnisse aufzudecken.
Falls Sie die Aufgabe nicht auf Anhieb alleine lösen können, ist das also völlig normal
und kein Grund für Frustration. Schauen Sie dann bitte nicht direkt in die Musterlösung,
sondern versuchen Sie, im Diskussionsforum zu beschreiben, wie weit sie gekommen
sind, und wo es hakt. Dort bekommen Sie dann passende Hinweise, mit denen Sie selbst
weiterkommen.
1. Schreiben Sie eine Klasse ArrayAddressBook für einfache Adressbücher mit folgenden
   Eigenschaften:
   • Ein Adressbuch besitzt ein Attribut persons, welches vom Typ Person[]
   ist (wir verwenden hier die Klasse Person von Seite 42). Dieses Attribut
   soll im Konstruktor des Adressbuchs mit einem neu erzeugten Array initialisiert
   werden, wobei die Größe des Arrays dem Konstruktor als Parameter
   übergeben wird. Wird eine Größe kleiner als 1 übergeben, soll 1 als Größe
   verwendet werden.
   • Das Adressbuch hat eine Methode addPerson(), welche eine Referenz auf
   ein Person-Objekt als Parameter akzeptiert und die übergebene Person an
   die erste noch freie Stelle in das Array persons schreibt. Das Array wird
   also „von unten“ (beginnend mit Index 0) befüllt. Um die Einfügestelle ermitteln
   zu können, bekommt das Adressbuch ein Attribut, welches den Index
   des nächsten noch unbelegten Array-Elements repräsentiert. Dieses Attribut
   muss natürlich bei Veränderungen aktualisiert werden.
   • Damit die Anzahl der Personen, die aufgenommen werden können, nicht
   begrenzt ist, soll beim Hinzufügen einer Person mit addPerson() zunächst
   überprüft werden, ob das Array bereits voll belegt ist. Wenn ja, soll
   ein neues Array doppelter Größe angelegt und das alte Array dort hineinkopiert
   werden. Das Verdoppeln und Umkopieren soll in eine eigene Methode
   ausgelagert werden.
   • Um das Adressbuch sinnvoll testen zu können, bekommt es eine Methode
   print(). Diese gibt zunächst eine Zeile aus, in der steht, wie viele Einträge
   zur Zeit im Adressbuch sind, dann eine, in der steht, wie groß seine Kapazität
   zur Zeit ist. Anschließend ruft sie auf allen im Adressbuch enthaltenen
   Person-Objekten deren Methode print() auf.
2. Schreiben Sie eine Klasse AddressBookTest mit einer main-Methode. In dieser
   erzeugen Sie ein ArrayAddressBook mit Anfangsgröße 3. Erzeugen Sie
   dann einige Person-Objekte und legen Sie sie mit der Methode addPerson()
   ins Adressbuch. Um zu überprüfen, ob das Einfügen und das automatische Verdoppeln
   der Kapazität funktioniert, rufen Sie an geeigneten Stellen die Methode
   print() des Adressbuchs auf.
3. Erstellen Sie weitere Subklassen von Person und testen Sie Ihr Adressbuch auch
   mit Instanzen dieser Klassen. Sie können sich dabei an Abb. 1.6 orientieren. Versuchen
   Sie, mehrfach vorkommenden gleichen Code zu vermeiden, indem Sie die
   gezeigten Möglichkeiten des „Ergänzens“ von Methoden und des Aufrufs