package arrays;

import java.util.Arrays;

public class ejemplo1 {

    public static void main(String[] args) {

        int[] tempA = {10, 11, 12, 11, 10, 9, 18, 19, 14, 13, 15, 15};
        int[] tempB; //tal  como tenemos esta referencia apunta a null
        int[] tempC = new int[13];

        System.out.println(tempA);
        //System.out.println(tempB);
        System.out.println(tempC);

        System.out.println(tempA.toString());
        //System.out.println(tempB);
        System.out.println(tempC.toString());

        System.out.println(Arrays.toString(tempA));
        //System.out.println(Arrays.toString(tempB));
        System.out.println(Arrays.toString(tempC));

        System.out.println(tempA.equals(tempC));
        tempB=tempA;



    }
}
