import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        int[] arr={3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        int[] arr2={3, 5, 79, 12, 25, -3, 66, 82, 25, 152};
        // Diziye ait elemanları direk ekrana basmak için kullanılan bir metottur.
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        // HelperArrays.print(arr);

        // fill metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.
        // Arrays.fill(arr,3,6,10);
        // int[] tempArr=HelperArrays.fill(arr,3,6,10);

        // Arrays.sort() metodu ile dizilerdeki elemanları sıralayabiliriz.
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        // int[] sortArray=HelperArrays.sort(arr);

        // Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir. Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.
        // System.out.println("Index: "+Arrays.binarySearch(arr,25));
        // System.out.println("Index: "+HelperArrays.search(arr,25));

        // Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metotu kullanılır
        // int[] copyArray=Arrays.copyOf(arr,4);
        // System.out.println(Arrays.toString(copyArray));
        // int[] copyArray2=HelperArrays.copyOf(arr,4);

        // Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır
        // int[] copyOfRangeArray=Arrays.copyOfRange(arr,2,6);
        // System.out.println(Arrays.toString(copyOfRangeArray));
        // int[] copyOfRangeArray2=HelperArrays.copyOfRange(arr,2,6);

        // Java'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.
        // System.out.println(Arrays.equals(arr,arr2));
        // System.out.println(HelperArrays.equals(arr,arr2));
    }
}
