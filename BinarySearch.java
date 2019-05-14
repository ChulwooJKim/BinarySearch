import java.util.Scanner;

//This class contains a method that implements binary search.
//Binary search is a searching algorithm that looks in an ordered
//array for the element given.
//Written by: Chulwoo Kim
public class BinarySearch{

    //Creates an int[] and checks if a number
    //given is in the  array.
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int[] intArray = new int[]{1,2,3,4,5,6,7,9,10,11,12,14,15};
	int hold = Integer.parseInt(s.next());
	System.out.println(binarySearch(intArray, hold));
    }

    //Goes through the int[] and returns true if the int[] contains
    //the integer. Otherwise it returns false;
    public static boolean binarySearch(int[] data, int toFind){
	int left = 0;
	int right = data.length -1;
	int midpoint = (data.length - 1)/2;
	while(right >= left){
	    if(data[midpoint] == toFind){
		return true;
	    }else if(data[midpoint] > toFind){
		right = midpoint - 1;
		midpoint = (right + left)/2;
	    }else if(data[midpoint] < toFind){
		left = midpoint + 1;
		midpoint = (right + left)/2;
	    }
	}
	return false;
    }
}
