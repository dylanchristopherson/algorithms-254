
import java.awt.Point;
import java.util.Random;

/**
 * @author ChristophersonD
 *
 */
public class BruteForceDriver {
	public static void main(String[] args) {
		int n = 1000;
		Random random = new Random();
		int[] list = new int[n];
		for(int i = 0; i < n ; i++ ) {
			list[i]= random.nextInt(n*10);
		}
				
		BruteForceAlgorithms brute = new BruteForceAlgorithms();
		Space blankSpace = new Space();

		blankSpace.space();
		
		//print random array
		System.out.println("Random array\n");
		brute.printArray(list);
		blankSpace.space();
		//sort list
		brute.selectionSort(list);
		
		//Use brute to print out sorted array
		System.out.println("Sorted array\n");
		brute.printArray(list);
		blankSpace.space();

		//TODO Test SequentialSearch

		int searchValue = 1200;
		int searchIndex = brute.sequentialSearch(list, searchValue);
		System.out.println("Value: " + searchValue + " was found at index " + searchIndex);
		
		blankSpace.space();
		
		//TODO Test BruteForceStringMatch		

		String bigString = "The little brown fox jumped over the lazy dog";
		String smallString = "fox";
		int indexAt = brute.bruteForceStringMatch(bigString, smallString);
		
		System.out.println("Big String: " + bigString);
		System.out.println("Small String: " + smallString);
		
		System.out.println(indexAt);
		
		blankSpace.space();
		
		//TODO Test BruteForceClosestPoints
		
		Point[] points = new Point[3];
		points[0] = new Point(1,1);
		points[1] = new Point(5,5);
		points[2] = new Point(2,2);	
		
		// New test case
		/*
		Point [] points = new Point[4];
		points[0] = new Point(100,100);
		points[1] = new Point(500,500);
		points[2] = new Point(12,12);
		points[3] = new Point(1000,1000);
		*/
		
		
		
		Point[] twoClosest = brute.bruteForceClosestPoints(points);
		System.out.println("The closest two points are: ");
		for(int i = 0; i< twoClosest.length; i++)
			System.out.println(twoClosest[i]);
		
		blankSpace.space();
	}
}

class Space {
	void space() {
		System.out.println("\n\n****************************\n\n****************************\n\n");
	}
}