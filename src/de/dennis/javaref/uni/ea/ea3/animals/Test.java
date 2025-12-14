package de.dennis.javaref.uni.ea.ea3.animals;

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
        /*s1.m(h, h); */ // Aufruf F
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
