package de.dennis.javaref.uni.ea.ea1.a5.ausnahmebehandlung;

public class ExceptionTest {
    public static void main(String[] args) {
        int zahl = 13;

        try {
            try {
                int[] b = {3, 11, 4, 9};

                for (int i = 0; i <= b.length; i++) {
                    if (b[i] % 3 == 0) {
                        zahl = zahl - 1;
                    }
                }

                System.out.println("Eine");
                zahl = zahl - 4;

            } catch (ArithmeticException e) {
                zahl = zahl + (true & false ? 3 : 2);
                System.out.println("Ausnahme");

            } catch (Exception e) {
                zahl = zahl + (zahl == 14 ? 3 : 2);
                System.out.println("Ausnahmen");

            } finally {
                zahl = zahl + 4 / 7;
                System.out.println("sind");
            }

            switch (zahl) {
                case 5:
                    System.out.println("eine");
                    break;

                case 7:
                    System.out.println("nicht");
                    break;

                case 14:
                    System.out.println("macht");
                    break;

                case 13:
                    System.out.println("gar");

                case 8:
                    System.out.println("nicht");
                    throw new Exception();

                default:
                    System.out.println("keinen");
                    break;
            }

        } catch (Exception e) {
            String s = (zahl % 6 / (7 % 6 % 2)) == 1 ? "so" : "Sommer";
            System.out.println(s);
            return;

        } finally {
            System.out.println("schlimm!");
        }

        System.out.println("glücklich");
    }
}
