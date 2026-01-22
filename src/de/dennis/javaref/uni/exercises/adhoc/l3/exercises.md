[ ] **Ad-hoc-Aufgabe 1**

Gegeben seien die folgenden acht Typen: Dog, Object, Parcel (Päckchen),
Weighable, PostalItem, Letter, PDFDocument und Printable. Dabei können
Hunde, Päckchen und Briefe gewogen werden, Päckchen und Briefe sind mit der Post
versendbar, Briefe und PDF-Dokumente können gedruckt werden.

Versuchen Sie zunächst, die angegebenen Typen zeichnerisch als Typhierarchie darzustellen.
Dabei können Sie sich an den Hierarchien in Abb. 4.1 auf S. 128 orientieren.
Überlegen Sie anschließend, welche der Typen Sie als Klassen- und welche als Interfacetypen
modellieren würden. Sie sind dabei ausdrücklich nicht an die entsprechenden
Festlegungen gebunden, die wir bzgl. einiger der Typen im vorigen Abschnitt getroffen
haben. Bedenken Sie aber, dass Klassen in Java nur eine direkte Superklasse haben
dürfen.


[ ] **Ad-hoc-Aufgabe 2**

Nachdem Sie Ihre Lösung der vorigen Aufgabe mit der Musterlösung vergleichen haben,
programmieren Sie diese bitte aus, indem Sie die beteiligten Klassen (abgesehen
von Object) und Interfaces erstellen und mit sinnvollen Methoden und (bei den Klassen)
Instanzvariablen und ggf. Konstruktoren versehen. Versuchen Sie dabei, Implementierungsbestandteile,
die mehreren Klassen gemeinsam sind, möglichst nur einmal zu
implementieren.


[ ] **Ad-hoc-Aufgabe 3**

```java
class Super {
        void x() {
        System.out.println("Start Methode x in Super");
        y();
        System.out.println("Ende Methode x in Super");
    }
    void y() {
        System.out.println("Start Methode y in Super");
        System.out.println("Ende Methode y in Super");
    }
}
class Sub extends Super {
    void x() {
        System.out.println("Start Methode x in Sub");
        super.x();
        System.out.println("Ende Methode x in Sub");
    }
    void y() {
        System.out.println("Start Methode y in Sub");
        System.out.println("Ende Methode y in Sub");
    }
}
public class VererbungsTest {
    public static void main(String[] args) {
        Super s = new Sub();
        s.x();
    }
}
```

Beschreiben Sie, wie die Ausgabe des obigen Programms aussieht (natürlich, ohne es
zuvor auszuführen).


[ ] **Ad-hoc-Aufgabe 4**

```java
class Professor extends Person {
    private int earnings;
    
    Professor(String name, int earnings) {
        this.earnings = earnings;
    }
    Professor(String name) {
        this(name, 5500);
    }
}
```

Wie müsste das Beispiel geändert werden, um den Compilerfehler zu beseitigen?


[ ] **Ad-hoc-Aufgabe 5**

```java
public class KonstruktorTest {
    public static void main(String[] args) {
        new Sub();
    }
}
class Super {
    Super() {
        System.out.println("Super-Konstruktor");
        m();
    }
    void m() {
        System.out.println("Methode m() von Super");
    }
}

class Sub extends Super {
    Person p = new Person();
    Sub() {
        System.out.println("Sub-Konstruktor");
        m();
    }
    @Override
    void m() {
        System.out.println("Methode m() von Sub");
        System.out.println(p.getName());
    }
}

class Person {
    String getName() {
        return "Müller-Lüdenscheidt";
    }
}
```