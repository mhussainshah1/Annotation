package common;

interface Intelligence1 {
    int cunning();
}

class Canine implements Intelligence1 {
    @Override public int cunning() {
        return 500;
    }

    void howl() {
        System.out.print("Woof!");
    }
}

public class Wolf extends Canine {
    @Override public int cunning() {
        return Integer.MAX_VALUE;
    }

    @Override void howl() {
        System.out.print("Howl!");
    }
}

class Dog extends Canine {
  /*
    @Override public boolean playFetch() {
        return true;
    } // DOES NOT COMPILE

    @Override void howl(int timeOfDay) {} // DOES NOT COMPILE-
    */
}