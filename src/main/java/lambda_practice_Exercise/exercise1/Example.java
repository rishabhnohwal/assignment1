package lambda_practice_Exercise.exercise1;

public class Example {
    public static void main(String[] args) {
        MyFunction myFunction = ()-> "CGI";
        System.out.println(myFunction.printCompanyName());
    }
}
