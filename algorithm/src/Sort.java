public class Sort {
    static void swap(int[] src, int i, int j) {
        int temp=src[j];
        src[j]=src[i];
        src[i]=temp;
    }

    static void print(int[] ints) {
        for (int i:ints) {
            System.out.print(i+" ");
        }
    }
}
