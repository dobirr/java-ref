[ ] **Ad-hoc-Aufgabe 1**

Bei der Programmierung einer Klasse Motor wollten die Entwickler sicherstellen,
dass es in der Methode zum Starten eines Motors auf keinen Fall zu einer
NullPointerException kommen kann. Deshalb haben sie in die Methode die folgende
Prüfung eingebaut:

```java
public void start() {
    if(this != null) {
        this.running = true;
    }
}
```

Erscheint Ihnen diese Vorgehensweise sinnvoll? Begründen Sie Ihre Antwort!


[ ] **Ad-hoc-Aufgabe 2**

Erstellen Sie eine Klasse Fraction zur Beschreibung von Brüchen, welche die folgenden
Vorgaben umsetzt:
1. Ein Fraction-Objekt hat zwei ganzzahlige Instanzvariablen numerator und
denominator (Zähler und Nenner). Auf diese Instanzvariablen soll aus fremden
Klassen nicht zugegriffen werden können.
2. Die Klasse Fraction deklariert einen Konstruktor, dem zwei ganzzahlige Parameter
übergeben werden müssen. Der Konstruktor soll die Instanzvariablen des
Bruchs mit denWerten der übergebenen Parameter initialisieren. Der Konstruktor
soll deklarieren, eine Ausnahme des Typs IllegalArgumentException auslösen
zu können. Diese Ausnahme soll ausgelöst werden, wenn dem Konstruktor
für den Nenner derWert 0 übergeben wird.
3. Fraction-Objekte haben eine Methode getProductOfThisAnd, deren einziger
formaler Parameter eine Referenz auf ein weiteres Fraction-Objekt ist. Die
Methode gibt ein neues Fraction-Objekt zurück, welches das Produkt der beiden
Brüche (Nachrichtenempfänger und Parameter) repräsentiert.
4. Fraction-Objekte haben eine parameterlose Methode toString. Die Methode
gibt ein String-Objekt zurück, welches das Fraction-Objekt in der Form
Zähler-Bruchstrich-Nenner repräsentiert, also z. B. "3/4" für den Bruch mit dem
Zähler 3 und dem Nenner 4.
Testen Sie Ihre Klasse ausgiebig. Erstellen Sie dazu eine Testklasse mit main-Methode!


[ ] **Ad-hoc-Aufgabe 3**

Java besitzt eine umfangreiche Standard-Klassenbibliothek. Um mit Java sinnvoll zu arbeiten,
ist es zwingend notwendig, sich auf einfacheWeise einen Überblick darüber verschaffen
zu können, welche Komponenten (Konstruktoren, Methoden, Attribute...) die
Klassen dieser Bibliothek zur Benutzung durch Programmierende zur Verfügung stellen.
Zu diesem Zweck existiert eine Dokumentation in Form von verknüpften HTMLDateien,
welche die Programmierschnittstelle der Bibliotheksklassen dokumentiert, die
sogenannte API-Dokumentation (API = application programming interface). Sie finden
die Einstiegs-Seite dieser API-Dokumentation online unter [;APIDokuJava].
1. Schauen Sie sich die API-Dokumentation einiger der Ihnen bereits bekannten
   Klassen (z. B. String, System) aus der Standard-Klassenbibliothek an. Wo finden
   Sie den Überblick über die Konstruktoren, Methoden, Instanzvariablen, Klassenmethoden?
   Welche zusätzlichen Informationen über die Klasse finden Sie außerdem
   noch? Folgen Sie bei einigen Methoden und Konstruktoren auch dem
   Link zur detaillierten Information weiter unten auf der jeweiligen Seite.
2. Schreiben Sie ein Programm, in dessen main-Methode Sie ein int-Array der Größe
   zehn anlegen und mit beliebigen Werten initialisieren. Suchen Sie in der APIDokumentation
   der Klasse java.util.Arrays die Detail-Beschreibung der
   Klassenmethoden, welche diese Klasse zum Sortieren und zum Liefern eines das
   Array repräsentierenden Strings bereitstellt. Sortieren Sie das Array mit Hilfe der
   passenden Sortier-Methode, besorgen Sie sich seine String-Repräsentation und geben
   Sie diese aus. Beim Aufruf der Klassenmethoden verwenden Sie den vollständigen
   Klassennamen, also java.util.Arrays.
3. Falls Sie Eclipse verwenden, können Sie die API-Dokumentation einer Klasse
   aus der Standard-Klassenbibliothek auch direkt aus der IDE öffnen. Setzen
   Sie dazu den Cursor im Quellcode auf ein Element aus der Standard-
   Klassenbibliothek (z. B. einen Klassennamen, einen Konstruktor- oder Methodenaufruf)
   und drücken Sie die Tasten SHIFT und F2. Es sollte sich ein Browserfenster
   mit der Dokumentation des betreffenden Elements öffnen. Probieren Sie das
   am Besten direkt in Ihrer Klasse Fraction aus der vorigen Ad-hoc-Aufgabe mit
   dem Klassennamen IllegalArgumentException.


[ ] **Ad-hoc-Aufgabe 4**

Gegeben seien die folgenden vier Klassen:

```java
public class Toy { }
public class RubberDuck extends Toy { }
public class TeddyBear extends Toy { }
public class PlasticCar extends Toy { }
```

1. Ergänzen Sie jede der o.g. Klassen um eine Methode print. Wenn einer Instanz
   einer der Klassen die Nachricht print gesendet wird, soll sie den Namen ihrer
   Klasse ausgeben.
2. Schreiben Sie eine Klasse ToyFactory, welche eine Klassenmethode getToy besitzt,
   die als Parameter den Namen der Toy-Klasse als String entgegennimmt,
   von der die Fabrik eine Instanz erzeugen soll. Verwenden Sie in der Methode die
   Switch-Anweisung, um abhängig vom übergebenen Klassennamen das passende
   Toy-Objekt zu erzeugen und zurückzuliefern.
3. Wenn der Methode getToy ein String übergeben wird, zu dem es in der Switch-
   Anweisung keinen Fall gibt, soll eine NoSuchToyException ausgelöst werden.
   Da es diese Art von Ausnahme in der Java-Standardklassenbibliothek nicht
   gibt, schreiben Sie selbst eine Klasse NoSuchToyException, die Subklasse von
   Exception ist. Deklarieren Sie in dieser Klasse einen Konstruktor, dem man
   einen String als Parameter übergeben kann und reichen Sie den übergebenen
   String an den entsprechenden Konstruktor der Superklasse Exception weiter
   (siehe dazu S. 43). Beim Auslösen der NoSuchToyException erzeugen Sie eine
   Instanz der Klasse NoSuchToyException, wobei Sie dem Konstruktor einen
   passenden String übergeben, der das aufgetretene Problem kurz beschreibt.
4. Schreiben Sie eine Testklasse mit main-Methode, und nutzen Sie in dieser
   die Klasse ToyFactory und deren Klassenmethode getToy, um einige Spielzeuge
   zu erhalten, denen Sie dann die Nachricht print senden. Deklarieren
   Sie für die main-Methode Ihrer Testklasse, dass diese sich abrupt mit einer
   NoSuchToyException beenden kann und testen Sie auch Fälle, in denen dies
   passiert.


[ ] **Ad-hoc-Aufgabe 5**

Ergänzen Sie die Klasse LinkedListFeu aus Abbildung 2.3 um eine Methode
getElementAt, deren einziger formaler Parameter eine Ganzzahl position ist. Die
Methode liefert eine Referenz auf das Person-Objekt, welches sich an der Position
position in der Liste befindet. Dabei soll die zuerst in der Liste gespeicherte Person
die Position 0 haben. Wenn eine ungültige Position übergeben wird, soll eine
java.util.NoSuchElementException ausgelöst werden. Testen Sie die ergänzte
Klasse ausgiebig, indem Sie eine entsprechende Testklasse mit main-Methode erstellen.


[ ] **Ad-hoc-Aufgabe 6**

Zum Iterieren über alle Elemente der Liste hätten wir im obigen Beispiel statt des relativ
aufwendigen Iterators auch die Methode getElementAt aus der Lösung zur Ad-hoc-
Aufgabe 5 verwenden können, etwa so:

```java
public Person getPersonByLastName(String lastName) {
   for (int i = 0; i < personList.size; i++) {
      Person p = personList.getElementAt(i);
      if (p.getLastName().equals(lastName)) return p;
   }
   throw new java.util.NoSuchElementException();
}
```

Die Lösung mit Hilfe des Iterators hat aber einen entscheidenden Vorteil. Überlegen Sie,
worin dieser bestehen könnte.


[ ] **Ad-hoc-Aufgabe 7**

1. Schreiben Sie für die Klasse ObjectContainer eine Testklasse, in deren main-
   Methode Sie eine Instanz der Klasse ObjectContainer erzeugen.
2. Erzeugen Sie ein Person-Objekt und legen Sie es mit der Methode store in den
   Container.
3. Versuchen Sie, das abgelegte Person-Objekt mit der Methode get wieder aus
   dem Container zu holen und in einer Variablen abzulegen.
4. Rufen Sie auf der Variablen eine der in der Klasse Person deklarierten Methoden
   auf, z. B. die Methode getFirstName.
5. Was beobachten Sie beim Compilieren Ihrer Testklasse? Versuchen Sie, das Verhalten
   des Compilers zu erklären.
6. Falls Sie eine Idee haben, wie Sie das Problem (ohne Änderungen an der Klasse
   ObjectContainer!) lösen können, versuchen Sie, diese umzusetzen.
7. Lesen Sie die Erklärungen in der Musterlösung der Aufgabe!


[ ] **Ad-hoc-Aufgabe 8**

Schreiben Sie eine Testklasse für die Klasse NumberContainerWithMaximum, in deren
main-Methode Sie einen Behälter vom Typ NumberContainerWithMaximum erzeugen.
Legen Sie Werte einiger geeigneter Basisdatentypen in den Behälter und rufen
Sie das Maximum ab und geben Sie es auf die Standardausgabe aus. An welchen Stellen
im Gesamtprogramm findet automatisches Boxing bzw. Unboxing statt?


[ ] **Ad-hoc-Aufgabe 9**

Schreiben Sie eine Testklasse MaxWeightContainerTest, in deren main-Methode Sie
einen Behälter vom Typ MaxWeightContainer erzeugen. Programmieren Sie die Klassen
Animal und Apple in passender Weise aus, erzeugen Sie Instanzen und legen Sie
sie in den Behälter. Holen Sie sich das schwerste Objekt, das je im Behälter war und legen
Sie es in einer Variablen ab.Was fällt Ihnen auf?