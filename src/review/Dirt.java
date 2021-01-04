package review;

import java.lang.annotation.Documented;

enum Color {
    GREY, BROWN
}

@Documented
public @interface Dirt {
    boolean wet();
//    String type()= "unknown";//DOES NOT COMPILE
    public Color color();
    static final int slippery = 5;
}
