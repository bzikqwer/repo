/**
 * @author DS
 * version 1.0
 * chesk boolean Expresion for 4
 */
public class DimaBolean {
    public static void main(String[] args) {
        //no true
        boolean ffff = booleanExpression(false, false, false, false);
//        one true
        boolean ffft = booleanExpression(false, false, false, true);
        boolean fftf = booleanExpression(false, false, true, false);
        boolean ftff = booleanExpression(false, true, false, false);
        boolean tfff = booleanExpression(true, false, false, false);
//        two true right choice
        boolean ttff = booleanExpression(true, true, false, false);
        boolean tftf = booleanExpression(true, false, true, false);
        boolean tfft = booleanExpression(true, false, false, true);
        boolean fttf = booleanExpression(false, true, true, false);
        boolean ftft = booleanExpression(false, true, false, true);
        boolean fftt = booleanExpression(false, false, true, true);
//         Three true

        boolean tttf = booleanExpression(true, true, true, false);
        boolean ttft = booleanExpression(true, true, false, true);
        boolean tftt = booleanExpression(true, false, true, true);
        boolean fttt = booleanExpression(false, true, true, true);
//        four true
        boolean tttt = booleanExpression(true, true, true, true);
        System.out.println("ffff " + ffff);
        System.out.println("ffft " + ffft);
        System.out.println("fftf " + fftf);
        System.out.println("fftt " + fftt + " <- ");

        System.out.println("ftff " + ftff);
        System.out.println("ftft " + ftft + " <- ");
        System.out.println("fttf " + fttf + " <- ");
        System.out.println("fttt " + fttt);

        System.out.println("tfff " + tfff);
        System.out.println("tfft " + tfft + " <- ");
        System.out.println("tftf " + tftf + " <- ");
        System.out.println("tftt " + tftt);

        System.out.println("ttff " + ttff + " <- ");
        System.out.println("ttft " + ttft);
        System.out.println("tttf " + tttf);
        System.out.println("tttt " + tttt);

        boolean allCorrectAreTrue = fftt & ftft & fttf & tfft & tftf & ttff;

        boolean allIncorrectAreTrue = ffff | ffft | fftf | ftff | fttt | tfff | tftt | ttft | tttf | tttt;

        boolean correctAnswerCondition = allCorrectAreTrue & !allIncorrectAreTrue;

        if (correctAnswerCondition) {
            System.out.println(" You have found the correct answer!!! :) ");
        } else {
            System.out.println(" Correct answer still to be found... :( ");
        }
// ^ = xor & = and | = or && =

    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {

        return ((a ^ b) & (c ^ d)) | ((a ^ c) & (b ^ d)) | ((a ^ d) & (b ^ c));

    }
}
