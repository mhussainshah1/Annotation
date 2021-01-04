package applying;

public @interface Injured {
    String veterinarian() default "unassigned";
    String value() default "foot";
    int age() default 1;
}

abstract class Elephant {

    @Injured("Legs") //short hand
    public void fallDown() {}

    @Injured(value = "Legs")
    public abstract int trip();

    @Injured //gets default value
    String injuries[];
}

@Injured("Broken Tail")
class Monkey {}

//@Injured("Fur",age=2) // DOES NOT COMPILE - it provides more than one value
class Bear {}