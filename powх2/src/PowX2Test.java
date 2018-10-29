/**
 *Поиск основания степени по результату и по показателю степени
 * @ds
 */

import java.util.Scanner;
public class PowX2Test {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.print("Введите показатель степени : ");
        Scanner d = new Scanner(System.in);
        int z = d.nextInt();
        double c = Math.log(Math.abs(b))/Math.log(z);
        System.out.println("Основание степени :" +c);
        System.out.println("Итог :"+c+"^"+z+"="+b);
        if (c%1==0){
            System.out.println(b+ " Делится без остатка");
        }
        else
            System.out.println(b+ " Не делится без остатка");
    }
}
