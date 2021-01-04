package specific;

import java.lang.annotation.Repeatable;

//Java 8 -Repeatable Annotation
@Repeatable(Risks8.class)
@interface Risk8 {
    String danger();
    int level() default 1;
}

@interface Risks8 {
    Risk8[] value();
}

public class Zoo8 {
    public static class Monkey {}
    //Java 8
    @Risk8(danger = "Silly")
    @Risk8(danger = "Aggressive", level = 5)
    @Risk8(danger = "Violent", level = 10)
    private Monkey monkey8;
}