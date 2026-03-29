package day2.twoPointers;

public class RemoveDuplicatesMaxK {

    public static int removeDuplicates(int[] arr){
        if(arr.length <= 2) return arr.length;

        int i = 2;

        for(int j = 2; j < arr.length; j++){
            if(arr[j] != arr[i-2]){
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }


    public static int removeDuplicatesMaxThree(int[] arr){
        if(arr.length < 3) return arr.length;

        int i = 3;
        for(int j = 3; j < arr.length;j++){
            if(arr[j] != arr[i - 3]){
                arr[i] = arr[j];
                i++;
            }
        }
        return  i;

    }

    public static int returnUnique(int[] arr){
        if(arr.length == 0) return arr.length ;

        int i = 1;
        for (int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i -1]){
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};

        int newLength = removeDuplicates(arr);

        for(int k = 0; k < newLength; k++){
            System.out.print(arr[k] + " ");
        }
    }
}