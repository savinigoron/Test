package xxx;

import java.util.Arrays;

public class test
	{
	    public static void main(String[] args)
	    {
	        int[] array = new int[] {4, 6, 3, 14, 34, 444, 555, 6, 7, 8, 9, 10};
	 
	        System.out.println("source: " + Arrays.toString(array));
	 
	        int[] reversedArray = reverse(array, array.length);
	 
	        System.out.println("dest: " + Arrays.toString(reversedArray));
	 
	    }
	 
	    static int[] reverse (int[] input, int length)
	    {
	        int left = 0;
	        int right = length-1;
	        while (left < right)
	        {
	            int temp = input[left];
	            input[left] = input[right];
	            input[right] = temp;
	 
	            left++;
	            right--;
	        }
	        return input;
	    }
	}

