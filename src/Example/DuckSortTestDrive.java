package Example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2),
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks); // this sort method is a template method, so it contain the primitiveOperation: compareTO()
                            // that implemented in Duck subclass

        System.out.println("After sorting:");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
