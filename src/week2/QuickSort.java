package week2;

public class QuickSort {
    public void quickSort(int num[], int l, int r) {
        if (l >= r)
            return;
        int temp = num[l];
        int pointer = l;
        for (int i = l; i <= r; i++) {
            if (temp > num[i]) {
                pointer = i;
            }
        }

        num[l] = num[pointer];
        num[pointer] = temp;
        quickSort(num, l, pointer - 1);
        quickSort(num, pointer + 1, r);
    }

    public static void main(String[] args) {
        int[] num = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        new QuickSort().quickSort(num, 0, num.length - 1);
        for (int i : num)
            System.out.println(i + " ");
    }
}
