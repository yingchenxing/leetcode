package week2;

public class QuickSort {
    public static int[] quickSort(int arr[],int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) arr=quickSort(arr,start,i-1);
        if (j+1<end) arr=quickSort(arr,j+1,end);
        return (arr);
    }

    public static void main(String[] args) {
        int[] num = {9, 2,48,20,50,4,6};
        new QuickSort().quickSort(num, 0, num.length - 1);
        for (int i : num)
            System.out.println(i + " ");
    }
}
