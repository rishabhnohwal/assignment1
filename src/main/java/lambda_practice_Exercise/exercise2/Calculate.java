package lambda_practice_Exercise.exercise2;

public class Calculate {
    public static void main(String[] args) {
        ArithmeticFunction solve = (a)-> (int)(a+0.05*a);

        System.out.println(solve.incrementByFive(100));
    }
}
