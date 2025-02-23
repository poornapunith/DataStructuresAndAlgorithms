package recursion;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        System.out.println(power(base, exponent));
    }

    public static int power(int base, int exponent) {
        if(exponent == 0)
            return 1;
        return base * power(base, exponent - 1);
    }
}
