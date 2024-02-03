package basis_syntax;

import java.util.Arrays;

public class MSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[] {0, 2, 2}, new int[] {1, 3})));
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int [] result = new int[a1.length + a2.length];
        int pos1 = 0;
        int pos2 = 0;
        while(pos1<a1.length || pos2<a2.length) {
            result[pos1+pos2] = (pos1<a1.length && (pos2 == a2.length || a1[pos1]<a2[pos2]) ?
                    a1[pos1++] : a2[pos2++]);
            System.out.println(Arrays.toString(result));
        }
        return result;
    }
}
