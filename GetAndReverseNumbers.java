import java.util.Scanner;

public class GetAndReverseNumbers {

    public static void main(String[] args) {

        int[] number = new int[10];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {

            System.out.print("Enter integer numbers: ");
            number[i] = sc.nextInt();
        }


        System.out.print("Number array in reverse order: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }
}
