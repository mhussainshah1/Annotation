package custom;

public @interface ElectricitySource {
    public int voltage();
    /*public static final*/int MIN_VOLTAGE = 2;
    public static final int MAX_VOLTAGE = 18;
}
