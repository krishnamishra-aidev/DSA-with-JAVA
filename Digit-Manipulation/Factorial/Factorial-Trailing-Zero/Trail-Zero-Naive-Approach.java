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


    private static int calculate_trailing_zero(int number){

        number = calculate_factorial(number);

        int trailing_zero = 0;


        while(number>0){

            int modulo_of_num = number%10;


            if(modulo_of_num ==0){
                trailing_zero++;
                number = number/10;
            }else{
                break;
            }


        }

        return trailing_zero;


    }

    private static int calculate_factorial(int num){
        int factorial_val = 1;

        while(num>1){
            factorial_val = factorial_val*num;
            num--;
        }

        return factorial_val;
    }
    // calculate_factorial(int num), T.C -> O(n), S.C -> O(1);
    //calculate_trailing_zero (int number) T.C -> O(log n), S.C -> O(1);

}
