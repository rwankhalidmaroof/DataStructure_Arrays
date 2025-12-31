package Assignment;
import java.util.*;
public class RemoveRandom {
    // Question 2



        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50};
            Random r = new Random();
            int index = r.nextInt(arr.length);

            int[] newArr = new int[arr.length - 1];
            int j = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[j++] = arr[i];
                }
            }

            System.out.println("After removing random element:");
            System.out.println(Arrays.toString(newArr));
        }
    }


