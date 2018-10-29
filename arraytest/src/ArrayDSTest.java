/**
 * @user ds
 * Сравнение масивов
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDSTest {
    public static void main(String[] args) {
//        ввод первого масива
        System.out.print("Введите текст первого масива: ");
        Scanner a = new Scanner(System.in);
        String b= a.nextLine();
        String [] ary1 = new String[] {b};
//        выкидываем лишнее
      //        вывод первого масива
         System.out.println(Arrays.toString(ary1));
//        ввод второго масива
        System.out.print("Введите текст второго масива: ");
        Scanner z = new Scanner(System.in);
        String v = a.nextLine();
        String [] ary2 = new String[] {v};
        String res = Arrays.toString(ary2);
        char [] chAr = res.toCharArray();
        for (int i = 0;i<chAr.length;i++){
//            условия поиска символа
            if (chAr[i]==' '){
//                заменяем на пустое значение
                chAr[i]='.';
            }
        }
        //        вывод первого масива
        System.out.println(chAr);
//        Сравнение масивов
        boolean eq = Arrays.equals(ary1,ary2);
        System.out.println("Результат: "+eq);
//        обработка результата
        if (eq==true){
            System.out.println("Равны");
        }
        else
            System.out.println("Не равны");
    }
}
