public class Main {

    public static void main(String[] args) {
        int num = 10;

        int increment = increment(num);

        int newNumber = increment(increment);

        System.out.println(increment);
        System.out.println(newNumber);
        System.out.println(newNumber);
    }

    public static int increment(int number) {
        return ++number;
    }
}
