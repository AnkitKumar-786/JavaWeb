package eb.com;

import java.util.Arrays;

public class Arraydemo2 {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60,70,80,90,100 };
		
		int indexposition = 4;
		int newvalue = 55;
		
		System.out.println("Original Array ="+ Arrays.toString(array));

		
		for(int i= array.length-1; i> indexposition; i--)
		{
			array[i] = array[i-1];
			
		}
		array[indexposition]= newvalue;
		System.out.println("New Array = "+ Arrays.toString(array));
	}

}
