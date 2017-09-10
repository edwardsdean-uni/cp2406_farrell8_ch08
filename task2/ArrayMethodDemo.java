import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMethodDemo {

    public static void main(String[] args)
    {
        int n[]= {1,2,3,4,5,6,7,8,9,10};

        //1
        System.out.println("The number we are using are " + Arrays.toString(n));

        //2
        for (int counter=n.length - 1; counter >= 0; counter--) {
            System.out.println("The reverse order of the numbers are " + (n[counter]));
        }

        //3
        int sum = 0;

        for (int i=0;i<n.length;i++) {
            int cur = n[i];
            sum += cur;
        }
        double ave = sum / n.length;
        System.out.println("Total of the Array is " + sum );

        //4
        List list = new ArrayList();
        for (int i=0;i<n.length;i++) {
            if(n[i] < 5){
                list.add(n[i]);
            }
        }
        System.out.println("All values lower the 5 are " + list );

        //5
        List list2 = new ArrayList();
        for (int i=0;i<n.length;i++) {
            if(n[i] > ave){
                list2.add(n[i]);
            }
        }
        System.out.println("All values higher than average (" + ave + ") are " + list2 );
    }
}
