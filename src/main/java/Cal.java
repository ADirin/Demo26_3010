import java.util.Scanner;

public class Cal {
    public int addMe(int a, int b) {
        return a + b;
    }
    public int subtractMe(int a, int b) {
        return a - b;
    }
    public int multiplyMe(int a, int b) {
        return a * b;
    }
    public int divideMe(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Cal cal = new Cal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second number:");
        int b = sc.nextInt();
        System.out.println(cal.addMe(a, b));
        System.out.println(cal.multiplyMe(a, b));
        System.out.println(cal.subtractMe(a, b));
        System.out.println(cal.divideMe(a, b));
    }
}
