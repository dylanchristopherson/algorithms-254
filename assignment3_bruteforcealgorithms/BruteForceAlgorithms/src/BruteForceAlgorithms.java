import java.awt.Point;

/**
 * 
 */

/**
 * @author masont
 *
 */
public class BruteForceAlgorithms implements BruteForcible {

	@Override
	/**
	 * ALGORITHM SelectionSort(A[0..n-1])
	 * Sorts a given array A by selection sort
	 * Input: An array of A[0..n-1] of orderable elements
	 * Output: Array A[0..n-1] sorted in ascending order
	 * for i = 0 to n-2 do
	 * 	min = i;
	 *  for j=i+1 to n-1 do
	 *  	if A[j] < A[min]    min = j
	 *  swap A[i] and A[min]
	 *
	 * @param A - Array of orderable elements
	 */
	
	public void selectionSort(int[] A) {
		// Declaring 
		int min = 0;
		//for i = 0 to n-2 do
		for(int i = 0; i<= A.length-2; i++) {
			 	min = i; //min = i;
			 	//for j=i+1 to n-1 do
			 	for (int j=i+1; j <= A.length-1; j++) {
			 		//if A[j] < A[min]    min = j
			 		if (A[j] < A[min]   ) 
			 				min = j;
			 	}
			 	//swap A[i] and A[min]
			 	int temp = A[i];
			 	A[i] = A[min];
			 	A[min] = temp;
		}
	}

	@Override
	/**
	 * ALGORITHM SequentialSearch(A[0..n-1], K])
	 * Searches a given array A by sequential sort
	 * Input: An array of A[0..n-1] of orderable elements
	 * Output: Array A[0..n-1] sorted in ascending order
	 *  i <- 0
	 *  while i<n and A[i] != K do
	 *   i <- i + 1
	 *  if i < n return i
	 *  else return -1
	 *  
	 */
	public int sequentialSearch(int[] A, int K) {
		// TODO Implement SequentialSearch Algorithm in Programming Assignment
		
		System.out.println("Sequential search\n");
		// Declaring
		int i = 0, n = A.length;
		
		// while i<n and A[i] != K do
		while (i < n && A[i] != K) {
			// i <- i + 1
			i = i + 1;
		}
		
		
		// if i < n return i
		// else return -1
		if (i < n) {
			return i;
		}
		else {
			return -1;
		}
	}

	@Override
	/**
	 * ALGORITHM BruteForceStringMatch(T, P)
	 * Implements brute-force string matching
	 * Input: An array T[0..n-1] of n characters representing a text and
	 * 		  an array P[0..m-1] of m characters representing a pattern
	 * Output: Index of the first character in the text that starts a 
	 *   	   matching substring or -1 if the search is unsuccessful
	 * for i <- 0 to n - m do
	 *  j <- 0
	 *  while j < m and P[j] = T[i+j] do
	 *   j <- j + 1
	 *  if j=m return i
	 * return -1
	 */
	public int bruteForceStringMatch(String T, String P) {
		// TODO Implement BruteForceStringMatch Algorithm in Programming Assignment
		
		System.out.println("BruteForceStringMatch\n");
		
		// T - Text
		// P - Pattern
		
		// Declaring
		int n = T.length();
		int m = P.length();
		
		// for i <- 0 to n - m do
		for (int i = 0; i <= n-m; i ++) {
			// j <- 0
			int j = 0;
			
			// while j < m and P[j] = T[i + j] do
			while (j < m && P.charAt(j) == T.charAt(j+i)) {
				// j <- j + 1
				j = j + 1;
			}
			
			// if j = m return i
			if (j == m ) {
				return i;
			}
		}
		// return -1
		return -1;
	}

	@Override
	/**
	 * ALGORITHM BruteForceClosestPoints(P)
	 * Input: A list P of n (n>=2) points P1 = (xy,y1),...,Pn=(xn,yn)
	 * Output: Indices index1 and index2 of the closest pair of points
	 * dmin <- infinity
	 * for i <- 1 to n-1 do
	 *  for j <- i + 1 to n do
	 *   d <- sqrt((xi-xj)^2+(yi-yj)^2)
	 *   if d < dmin
	 *    dmin <-d; index1 <- i; index2 <- j
	 * return index1, index2
	 */
	public Point[] bruteForceClosestPoints(Point[] P) {
		// TODO Implement BruteForceClosestPoints Algorithm in Programming Assignment
		System.out.println("BruteForceClosestPoints\n");

		// Declare
		int index1=0, index2=0; 
		int n = P.length;
		// dmin <- infinity (Otherwise known as a very large value)
		int dmin = Integer.MAX_VALUE;
		
		Point[] closest = new Point[2];
		
		// for i <- 1 to n - 1 do
		for(int i = 0; i <= n; i++) {
			// for j <- i + 1 to n do
			for (int j = i + 1; j < n; j ++) {
				// d <- sqrt((xi - xj)^2 + (yi - yj)^2) 
				double d = Math.sqrt(Math.pow(P[i].getX()-P[j].getX(),2)+Math.pow(P[i].getY()-P[j].getY(),2));
				
				// if d < dmin   dmin <- d; index1 <- i; index2 <- j
				if(d < dmin) {
					dmin = (int)d;
					index1 = i;
					index2 = j;
				}	
			}
		}
		
		// return index1, index2
		closest[0] = P[index1];
		closest[1] = P[index2];				
		return closest;
	}
	
	public void printArray(int[] data) {
		for(int i=1; i<= data.length; i++) {
			System.out.printf("%,9d" , data[i-1] );
			//System.out.printf(Locale.US, "%,d %n", 10000);
			if(i%20 == 0 && i > 0)
				System.out.println();
		}
	}
}
