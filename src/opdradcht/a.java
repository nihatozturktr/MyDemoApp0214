package opdradcht;

import java.util.Arrays;
import java.util.stream.IntStream;

public class a {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] randomThirty = new int[10];
        int[] a = randomThirty;

        LOAD(randomThirty);

        System.out.println("Thirty randoms to 300: " + Arrays.toString(randomThirty));

        System.out.println(isSorted(a));ail

        Arrays.sort(randomThirty);

        System.out.println("Now it's sorted ascending:" + Arrays.toString(randomThirty));

        System.out.println(isSorted(a));

        int[] reverseArr = IntStream.rangeClosed(1, a.length).map(i -> a[a.length-i]).toArray();

        System.out.println("Now it's sorted descending:" + Arrays.toString(reverseArr));

        System.out.println(isSorted(a));


    }

    public static void LOAD(int[] randomThirty) {

        // looping through to assign random values from 1 - 100
        for (int i = 0; i < randomThirty.length; i++) {
            randomThirty[i] = (int)(Math.random() * 101);
        }
    }

    public static boolean isSorted(int[] a)
    {
        // base case
        if (a == null || a.length <= 1) {
            return true;
        }

        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }

        return true;
}
}
