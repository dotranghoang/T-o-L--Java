import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    static class InvalidAgeException extends Exception {
        InvalidAgeException(String s) {
            super(s);
        }
    }

    static class CustomExceptionExample {

        private static void validate(int a, int b, int c) throws InvalidAgeException {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("It is a Triangle.");
            } else {
                System.out.println("It not a Triangle!");
            }
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a:");
            int a = scanner.nextInt();
            System.out.println("Nhập cạnh b:");
            int b = scanner.nextInt();
            System.out.println("Nhập cạnh c:");
            int c = scanner.nextInt();
            CustomExceptionExample.validate(a,b,c);
        } catch (InputMismatchException e) {
            System.out.println("Đã xảy ra lỗi kiểu dữ liệu!");
        }catch (Exception e) {
            System.out.println("Đã xảy ra lỗi!");
        }
    }
}

