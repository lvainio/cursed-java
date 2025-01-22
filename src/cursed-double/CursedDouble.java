public class CursedDouble {
    public static void main(String[] args) {
        double d1 = -0.0/0.0;
        if (!(d1 == d1)) {
            System.out.println("d1 is not equal to itself!");
        }
        if (Double.valueOf(d1).equals(Double.valueOf(d1))) {
            System.out.println("d1 is equal to itself!");
        }

        double d2 = 1.0 / 49.0;
        if (1.0 != d2 * 49.0) {
            System.out.println("(1.0 / 49.0) * 49.0 != 1.0");
        }

        if (0.1 + 0.2 != 0.3) {
            System.out.println("0.1 + 0.2 != 0.3");
        }
    }
} 
