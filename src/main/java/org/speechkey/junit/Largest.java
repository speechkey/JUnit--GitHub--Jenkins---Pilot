package org.speechkey.junit;

/**
 * Ermittle das größte Element eines Arrays
 * 
 * @param list Ein Array von int-Werten
 * @return Das größte
 * @author speechkey
 *
 */
public class Largest {
	public static int largest(int[] list){
		int index, max = 0;
		for(index = 0; index < list.length-1;index++){
			if (list[index] < max){
				max = list[index];
			}
		}
		return max;
	}
}
