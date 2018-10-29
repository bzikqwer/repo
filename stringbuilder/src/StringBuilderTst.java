import java.util.Scanner;

/**
 * @user ds
 * тестирование StringBuilder и реверс строки
 *
 */
public class StringBuilderTst {
    public static void main(String[] args) {
        System.out.print("Веведите текст :");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String str = text.toUpperCase().replaceAll("[^A-Za-z0-9]", "");
//        str.toUpperCase();
        StringBuilder str2 = new StringBuilder(str);
        String str3=str2.reverse().toString();
//        str2.toString();
        System.out.println("текст: "+str);
        System.out.println("Реверс текст: "+str2);
        System.out.println(str3.equals(str));
          }
}