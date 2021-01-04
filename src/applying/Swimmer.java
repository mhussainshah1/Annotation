package applying;

public @interface Swimmer {
    int armLength = 10;
    String stroke();
    String name();
    String favoriteStroke() default "Backstroke";
}
//which one of the following compile?

//@Swimmer class Amphibian {}//DOES NOT COMPILE: missing required element stroke() and name()
//@Swimmer(favoriteStroke="Breaststroke", name="Sally") class Tadpole {}//DOES NOT COMPILE: missing required element stroke()
@Swimmer(stroke="FrogKick", name="Kermit") class Frog {}
//@Swimmer(stroke="Butterfly", name="Kip", armLength=1) class Reptile {}//DOES NOT COMPILE: ARMLENGTHIS CONSTANT
@Swimmer(stroke="", name="", favoriteStroke="") class Snake {}