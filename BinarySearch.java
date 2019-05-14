import java.util.Scanner;

public class BinarySearch{
    int[] testArray;

    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int[] intArray = new int[]{1,2,3,4,5,6,7,9,10,11,12,14,15};
	int hold = Integer.parseInt(s.next());
	System.out.println(binarySearch(intArray, hold));
    }


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
