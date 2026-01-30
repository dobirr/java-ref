package de.dennis.javaref.uni.exercises.adhoc.l1.a4;

public class DataTypesDemo {
    public static void main(String[] args) {
        // Referenztyp (kein primitiver Typ)
        String text = "Test";

        // Ganzzahl-Typen
        byte b = 127;
        short s = 32_000;
        int i = 1;
        long l = 55567843L;      // long-Literale mit "L"  [oai_citation:1‡Lehrtext_63611_2025_WiSe.pdf](sediment://file_0000000061ac71f4b6e547e155afaf70)

        // Gleitkomma-Typen (floating-point numbers)
        float f = 1.23F;        // float-Literale oft mit "F"
        double d = 1.25;        // double ist Standard bei Dezimalzahlen

        // Zeichen
        char c = 'a';
        char quote = '\u0022';  // Unicode-Beispiel: "  [oai_citation:2‡Lehrtext_63611_2025_WiSe.pdf](sediment://file_0000000061ac71f4b6e547e155afaf70)

        // Boolean
        boolean isActive = false; // true / false  [oai_citation:3‡Lehrtext_63611_2025_WiSe.pdf](sediment://file_0000000061ac71f4b6e547e155afaf70)

        // Mini-Demo-Ausgabe
        System.out.println("String:  " + text);
        System.out.println("byte:    " + b);
        System.out.println("short:   " + s);
        System.out.println("int:     " + i);
        System.out.println("long:    " + l);
        System.out.println("float:   " + f);
        System.out.println("double:  " + d);
        System.out.println("char:    " + c);
        System.out.println("unicode: " + quote);
        System.out.println("boolean: " + isActive);
    }
}
