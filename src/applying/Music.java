package applying;
//Passing an Array
public @interface Music {
    String[] genres();
}

class Giraffe {
    @Music(genres = {"Rock and roll"})
    String mostDisliked;

    @Music(genres = "Classical")
    String favorite;
}

class Reindeer {
/*
    @Music(genres = "Blues", "Jazz")// DOES NOT COMPILE
    String favorite;

    @Music(genres =)// DOES NOT COMPILE
    String mostDisliked;

    @Music(genres = null)// DOES NOT COMPILE
    String other;
*/
    @Music(genres = {})
    String alternate;
}