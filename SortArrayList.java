import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList
 {
    public static void main(String[] args) 
{
              ArrayList<Integer> arrayList = new ArrayList<>();

                arrayList.add(30);
        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(20);
        arrayList.add(40);

       
        System.out.println("Original ArrayList: " + arrayList);

               Collections.sort(arrayList);

                System.out.println("Sorted ArrayList: " + arrayList);
    }
}
