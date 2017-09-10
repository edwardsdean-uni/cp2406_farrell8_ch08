import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwelveInts {
    public static void main(String[] args)
    {
        int n[]= {1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println("The number we are using are " + Arrays.toString(n));

        for (int counter=n.length - 1; counter >= 0; counter--) {
            System.out.println("The reverse order of the numbers are " + (n[counter]));
        }
    }
}
