import java.util.Scanner;
public class DsUnicode {
        public static void main(String[] args) {
           Scanner reader = new Scanner(System.in);
           int a = reader.nextInt();
            int b = '\\'+a;
            char c = (char)b;
            System.out.println(c);

    }
}




