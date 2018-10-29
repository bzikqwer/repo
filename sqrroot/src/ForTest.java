/**
 * Выполнение цикла до тех пор,пока с клавиатуры
 * не будет введена буква S
 */
public class ForTest {
    public static void main(String[] args)  throws java.io.IOException{
            int i;
            System.out.println("Для остановки нажмите клавишу S");
            for (i=0;System.in.read() !='S';i++)
                System.out.println("Проход №" +i);
        }
    }
