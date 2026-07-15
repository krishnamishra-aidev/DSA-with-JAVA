import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's add the number: ");
        int number = sc.nextInt();
        System.out.println("You have entered : "+number);

        System.out.println("Trailing zeros: "+calculate_trailing_zero(number));
    }


    private static int calculate_trailing_zero(int n) {
        if (n < 0) return -1;

        int count = 0;


        while (n >= 5) {
            n = n/5;
            count += n;

            System.out.println("Number: "+n);
            System.out.println("Count: "+count);
        }



        return count;
    }



}
