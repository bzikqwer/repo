import java.util.Arrays;

public class ArrSort {
    public static int[] MergeArr(int[] a1, int[] a2) {

         return new int[a1.length + a2.length];
    }

    public static void main(String[] args) {
        int[] b1 = new int[]{1,2,3};
        int[] b2 = new int[]{3,4,5,4};
        System.out.println(Arrays.toString(MergeArr(b1,b2)));
    }
}

