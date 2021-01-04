package review;

@interface Strong {

    int force();
}

@interface Wind {

    public static final int temperature = 20;

    Boolean storm() default true;

    public void kiteFlying();

    String gusts();

    Strong power() default @Strong(10);
}
