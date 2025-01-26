package Array;

public class CheckSorted {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int s= 0;

        for (int i = 0; i <= arr.length-2; i++) {
            if (arr[i]>arr[i+1]){
                s = -1;
            }
            else s = 1;
        }
        if (s == -1){
            System.out.println("Array is not sorted");
        }
        else System.out.println("Array is sorted");

    }

}
