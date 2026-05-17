public class JerarquiaNumerica {
    public static void main(String[] args) {

        byte datoByte = 10;
        short datoShort = datoByte;       // byte → short
        int datoInt = datoShort;          // short → int
        long datoLong = datoInt;          // int → long
        float datoFloat = datoLong;       // long → float
        double datoDouble = datoFloat;    // float → double

        System.out.println("Valor byte: " + datoByte);
        System.out.println("Convertido a short: " + datoShort);
        System.out.println("Convertido a int: " + datoInt);
        System.out.println("Convertido a long: " + datoLong);
        System.out.println("Convertido a float: " + datoFloat);
        System.out.println("Convertido a double: " + datoDouble);
    }
}
