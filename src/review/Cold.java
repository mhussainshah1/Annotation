package review;

import java.lang.annotation.*;

enum UnitOfTemp {
    C, F
}

@interface Snow {
    boolean value();
}

@Target(ElementType.METHOD)
public @interface Cold {
//    private Cold () {}//Error: can not have constructor
//    int temperature;//Error: not initialize
//    UnitOfTemp unit default UnitOfTemp.C ;//missing parenthesis after element name
    Snow snow() default @Snow(true);
}