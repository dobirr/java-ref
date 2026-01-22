[ ] **Ad-hoc-Aufgabe 1**

Schreiben Sie eine Klasse ListWithArray, welche analog zu der Klasse
LinkedListFeu von Abbildung 8.1 über die Methoden addLast, getLast,
removeLast und size verfügt. Wie LinkedListFeu soll ListWithArray einen
Typparameter ET deklarieren, der bei der Erzeugung einer solchen Liste mit einem
konkreten Elementtyp belegt werden kann. Intern soll zur Speicherung der Elemente ein
Array verwendet werden, dessen Größe bei Bedarf verdoppelt wird, so wie bei der Klasse
ArrayAddressBook aus der Musterlösung von Ad-hoc-Aufgabe 7 der Lektion 1 auf
Seite 52. Die Anfangsgröße des Arrays übergeben Sie analog zu ArrayAddressBook
in einem passenden Konstruktor.

Sie werden feststellen, dass die naheliegende Idee, ein Array vom Typ ET[ ] zu
verwenden, vom Compiler nicht akzeptiert wird.Wir verzichten an dieser Stelle darauf,
zu erklären, warum das so ist und umgehen das Problem: Verwenden Sie ein Array
mit Elementtyp Object und nehmen Sie in den Methoden, in denen Sie Elemente des
Arrays zurückliefern, entsprechende Casts auf ET vor. Die Warnungen des Compilers
nehmen wir in unserer Rolle als Erstellerin einer Bibliotheksklasse an dieser Stelle in
Kauf.

Wenn Sie sich nach dem Grund für die o.g. Einschränkung bzgl. Arrays fragen,
finden Sie eine Antwort in der „Java Generics FAQ“ von Angelika Langer
[;GenericsFAQAngelikaLanger] im Abschnitt „Can I create an array whose component
type is a concrete parameterized type?“. Das ist allerdings keine ganz leichte Kost.


[ ] **Ad-hoc-Aufgabe 2**

1. In der Java-Standardklassenbibliothek gibt es bereits eine parametrisierte Listen-
   Klasse, welche intern zur Aufbewahrung ihrer Elemente ein Array verwendet und
   ihre Kapazität bei Bedarf verdoppelt, die Klasse java.util.ArrayList. Schauen
   Sie sich in der API-Dokumentation dieser Klasse an, welche Methoden eine
   java.util.ArrayList zur Verfügung stellt.
2. Schreiben Sie dann eine Klasse ArrayListAddressBook. Objekte dieser Klasse
   sollen bzgl. ihrer Funktionalität denen der Klasse ArrayAddressBook aus der
   Musterlösung von Ad-hoc-Aufgabe 7 der Lektion 1 auf Seite 52 entsprechen. Zur
   internen Aufbewahrung der Personen verwendet ein ArrayListAddressBook
   aber statt eines Arrays eine mit dem Typ Person von Seite 94 parametrisierte Instanz
   der Klasse java.util.ArrayList, welche sie sich in ihrem Konstruktor
   selbst erzeugt.
3. Für den Verwender sollen sich die Methoden addPerson und print() einer Instanz
   der Klasse ArrayListAddressBooks analog zu denen einer Instanz der
   Klasse ArrayAddressBook verhalten, wobei wir in print auf die Ausgabe der
   Kapazität der internen ArrayList verzichten, weil wir auf diese Information keinen
   Zugriff haben.

Hinweis: Die Methode listIterator() der Klasse java.util.ArrayList hat
als Rückgabetyp den parametrisierten Typ java.util.ListIterator. Dabei handelt
es sich nicht um eine innere Klasse von java.util.ArrayList,
sondern um einen eigenständigen Top-Level-Typ, den Sie aber ansonsten analog zu „unserem“ Typ
LinkedListFeu.ListIterator verwenden können.


[ ] **Ad-hoc-Aufgabe 3**

Als Typparameter lassen sich auch Typen verwenden, die ihrerseits parametrisiert sind.
Beschreiben Sie die Objektmenge, für die der Typ ArrayList<ArrayList<String> >
steht.