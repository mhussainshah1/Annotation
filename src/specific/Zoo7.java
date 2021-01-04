package specific;

//Java7 - Array of Annotation
@interface Risk7 {
    String danger();
    int level() default 1;
}

@interface Risks7 {
    Risk7[] value();
}

public class Zoo7 {
    public static class Monkey {}
    //Java 7
    @Risks7({
            @Risk7(danger = "Silly"),
            @Risk7(danger = "Aggressive", level = 5),
            @Risk7(danger = "Violent", level = 10)
    })
    private Monkey monkey7;
}
