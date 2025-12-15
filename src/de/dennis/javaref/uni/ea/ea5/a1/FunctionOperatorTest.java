package de.dennis.javaref.uni.ea.ea5.a1;

public class FunctionOperatorTest {

    public static void main(String[] args) {
        FunctionOperator operator = new FunctionOperator();

        // 1a) Anonyme Klasse: f1(x) = x - 1
        int stepsF1Anon = operator.operate(
                new IntIntFunction() {
                    @Override
                    public int perform(int x) {
                        return x - 1;
                    }
                },
                10,
                -10
        );
        System.out.println("1a steps: " + stepsF1Anon);

        // 1b) Anonyme Klasse: f2(x) = x/2 wenn gerade, sonst 3x+1
        int wonder27Anon = operator.operate(
                new IntIntFunction() {
                    @Override
                    public int perform(int x) {
                        return (x % 2 == 0) ? (x / 2) : (3 * x + 1);
                    }
                },
                27,
                1
        );
        System.out.println("1b wunder(27): " + wonder27Anon);

        // 1c) Lambda: f1(x) = x - 1
        int stepsF1Lambda = operator.operate(x -> x - 1, 10, -10);
        System.out.println("1c steps: " + stepsF1Lambda);

        // 1d) Lambda: f2(x) = x/2 wenn gerade, sonst 3x+1
        int wonder27Lambda = operator.operate(
                x -> (x % 2 == 0) ? (x / 2) : (3 * x + 1),
                27,
                1
        );
        System.out.println("1d wunder(27): " + wonder27Lambda);

    }
}
