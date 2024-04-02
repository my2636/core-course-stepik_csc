package basis_syntax;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArray(new int[] {0, 2, 2, 6, 15, 48, 100}, new int[] {1, 3, 6, 18, 35,43, 78, 93, 99, 160})));
    }
        public static int[] mergeArray(int[] a1, int[] a2) {
            int[] sorted = new int[a1.length + a2.length];
            int i;
            int j;
            for (i = 0, j = 0; i < a1.length || j < a2.length;) {
                sorted[i + j] = i < a1.length && (j == a2.length || a1[i] < a2[j]) ? a1[i++] : a2[j++];
            }

        return sorted;
    }
}
