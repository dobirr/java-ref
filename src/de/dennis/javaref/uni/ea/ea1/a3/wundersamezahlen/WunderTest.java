package de.dennis.javaref.uni.ea.ea1.a3.wundersamezahlen;

public class WunderTest {
    public static void main(String[] args) {

        int maxSchritte = 0;
        int zahlMitMaxSchritten = 1;

        for(int i = 1; i <= 100; i++) {
            int curr = WunderTest.wunder(i);
            if(maxSchritte < curr) {
                maxSchritte = curr;
                zahlMitMaxSchritten = i;
            }
        }

        System.out.println("Durchläufe: " + maxSchritte);
        System.out.println("Zahl: " + zahlMitMaxSchritten);

    }
    static int wunder(int n) {
        int count = 0;
        int curr = n;

        while(curr != 1) {

            if(curr % 2 == 0) {
                curr = curr / 2;
            } else {
                curr = curr * 3 + 1;
            }

            count++;
        }

        return count;
    }

    static int wunderRek(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return 1 + WunderTest.wunderRek(n / 2);
        } else {
            return 1 + WunderTest.wunderRek(n * 3 + 1);
        }
    }
}

