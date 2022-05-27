import java.util.Arrays;
public class HelperArrays {
    // toString methodu
    static void print(int[] arr){
        System.out.print("[");
        for(int i=0;i< arr.length;i++){
            if(i== arr.length-1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }

    // Fill methodu
    static int[] fill(int[] arr,int fromIndex,int toIndex,int value){
        for(int i=fromIndex;i<toIndex;i++){
            arr[i]=value;
        }
        return arr;
    }

    // sort methodu
    static int[] sort(int[] arr){
        int key;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                key=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=key;
            }
        }
        return arr;
    }

    // search methodu
    static int search(int[] arr,int searchValue){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchValue){
                return i;
            }
        }
        return -1;
    }

    // copyOf methodu
    static int[] copyOf(int[] arr,int newLength){
        int[] copyArr=new int[newLength];
        for(int i=0;i<newLength;i++){
            copyArr[i]=arr[i];
        }
        return copyArr;
    }

    // copyOfRange methodu
    static int[] copyOfRange(int[] arr,int from,int to){
        int[] copyOfRangeArray=new int[to-from];
        for(int i=0,j=from;i<copyOfRangeArray.length;i++,from++){
            copyOfRangeArray[i]=arr[from];
        }
        return copyOfRangeArray;
    }

    // equals methodu
    static boolean equals(int[] arrA,int[] arrB){
        if(arrA.length==arrB.length){
            for(int i=0;i<arrA.length;i++){
                if(arrA[i]==arrB[i]){

                }else{
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }

}
