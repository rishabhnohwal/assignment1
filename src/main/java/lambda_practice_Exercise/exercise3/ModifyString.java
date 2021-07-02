package lambda_practice_Exercise.exercise3;

public class ModifyString {
    public static void main(String[] args) {
        StringConcat stringConcat = (a,b)-> a+b;

        System.out.println(stringConcat.joinString("Hello ","World"));
    }
}
