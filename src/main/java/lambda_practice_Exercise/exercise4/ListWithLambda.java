package lambda_practice_Exercise.exercise4;

import java.util.ArrayList;

public class ListWithLambda {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Haryana");
        list.add("Uttar Pradesh");
        list.add("Uttarakhand");
        list.add("Assam");
        list.add("Kerala");
        list.add("Maharashtra");
        list.add("Jharkhand");
        list.add("Telangana");

        list.forEach(states-> System.out.println(states));
    }
}
