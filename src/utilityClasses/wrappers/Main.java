package utilityClasses.wrappers;

public class Main {
    public static void main(String[] args) {
        byte bytePrimitive = 1;
        short shortPrimitive = 1;
        int intPrimitive = 1;
        long longPrimitive = 10L;
        float floatPrimitive = 10F;
        double doublePrimitive = 10D;
        char charPrimitive = 'q';
        boolean boolPrimitive = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = 1; //boxing
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character charWrapper = 'q';
        Boolean boolWrapper = true;

        intPrimitive = intWrapper; //unboxing
    }
}
