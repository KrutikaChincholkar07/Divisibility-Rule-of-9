import java.util.Scanner;

public class DivisibleBy9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (sum % 9 == 0)
            System.out.println(num + " is divisible by 9");
        else
            System.out.println(num + " is not divisible by 9");
    }
}
