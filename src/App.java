public class App {

    public static final String RESET = "\033[0m"; // Text Reset
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String PURPURA = "\u001B[35m";
    public static final String BLANCO = "\u001B[37m";
    public static final String PURPLE_BRIGHT = "\033[0;95m";

    public static void main(String[] args) throws Exception {
        System.out.printf("%-10s%-11s%-14s%-11s%-12s%n", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
        System.out.printf("%-10s%-11s%-14s%-11s%-12s%n", "═════", "══════", "═════════", "══════", "═══════");
        System.out.printf("%-15s%-16s%-19s%-16s%-15s%n", AZUL + "SIN", AMARILLO + "PROG", AZUL + "SIN", VERDE + "IPE",
                ROJO + "BBDD");
        System.out.printf("%-15s%-16s%-19s%-16s%-15s%n", AZUL + "SIN", AMARILLO + "PROG", AZUL + "SIN", VERDE + "IPE",
                ROJO + "BBDD");
        System.out.printf("%-15s%-16s%-19s%-16s%-15s%n", PURPURA + "LM", AMARILLO + "PROG", VERDE + "IPE",
                AMARILLO + "PROG", AZUL + "SIN");
        System.out.printf("%-15s%-16s%-21s%-16s%-15s%n", PURPURA + "LM", ROJO + "BBDD", PURPLE_BRIGHT + "DASP",
                AMARILLO + "PROG",
                NEGRO + "ED");
        System.out.printf("%-15s%-16s%-19s%-16s%-15s%n", ROJO + "BBDD", ROJO + "BBDD", AMARILLO + "PROG",
                AMARILLO + "PROG", NEGRO + "ED");
        System.out.printf("%-15s%-16s%-19s%-16s%-15s%n", ROJO + "BBDD", BLANCO + "SASP", AMARILLO + "PROG",
                PURPURA + "LM", NEGRO + "ED" + RESET);
    }
}
