import java.util.Scanner;
public class AmstrongNum {
    public static void main(String[] args){
        System.out.println("Enter the Integer");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = k;
        int digit = 0;
        byte count = 0;
        int armst = 0;
        int rev = 0;

        while (k>0){
            digit = k%10;
            System.out.println(digit);
            k = k/10;
            count++;
            armst+=digit*digit*digit;
            rev = rev*10+digit;

        }
        System.out.println("Number of digits=" +count);

        if (armst == l)
            System.out.println("it is an Armstrong Number");
        else
            System.out.println("it is not an Armstrong Number");

        System.out.println("The reverse is" +rev);
        if (rev == l)
            System.out.println("it is an Palindrome");
        else
            System.out.println("it is not a Palindrome");


    }
}
