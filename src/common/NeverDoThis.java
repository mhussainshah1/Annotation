package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NeverDoThis {

    @SafeVarargs
    final int thisIsUnsafe(List<Integer>... carrot) {
        Object[] stick = carrot;
        stick[0] = Arrays.asList("nope!");
        return carrot[0].get(0); // ClassCastException at runtime
    }

    public static void main(String[] a) {
        var carrot = new ArrayList<Integer>();
        new NeverDoThis().thisIsUnsafe(carrot);
    }

//    @SafeVarargs private void eat(int meal) {} // DOES NOT COMPILE - non-final instance method

//    @SafeVarargs protected void drink(String... cup) {} // DOES NOT COMPILE - non-final instance method

//    @SafeVarargs void chew(boolean... food) {} // DOES NOT COMPILE - non-final instance method
}