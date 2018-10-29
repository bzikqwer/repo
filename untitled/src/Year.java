import java.util.Scanner;
public class Year {
    public static void main(String[] args) {
        System.out.print("Введите текущий год: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int age = year/4 - year/100 + year/400;
        System.out.print("Cтолько высокостных лет по Григореанскому календарю уже было: ");
        System.out.println(age);
    }
}