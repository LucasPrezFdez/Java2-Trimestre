package arrays;

import java.util.Arrays;

public class ejemplo2 {

    public static void main(String[] args) {

        int[] tempA = {10, 11, 12, 11, 10, 9, 18, 19, 14, 13, 15, 15};
        int[] tempB; //tal  como tenemos esta referencia apunta a null
        int[] tempC = new int[13];
        int[] tempD = {8,8,3,8,8,3,8,8,3};

        System.out.println(Arrays.toString(tempA));

        tempB = tempA.clone();

        System.out.println(Arrays.toString(tempB));

        System.out.println(tempA.equals(tempB));

        System.out.println(tempA);
        System.out.println(tempB);
    }
}
