/*

Question : Given a Sorted Array , find index of target  
if the target is not available ,  in which index target element can be arranged. 
 
 Input: nums = [1,3,5,6] target = 5
 Output: 2
Input: nums = [1,3,5,6], target = 2
Output: 1
 
 * @author Addula Umamahesh
 *
 */
public class FindIndexofTargetInSortedArray {
  	public static void main(String[] args) {
		int[] input = {1,3,5,6}; 
	    int target =2; 	
		int index = findTarget(input, target) ;
	  System.out.println(" --Target element can be arranged in this index ::: "+index );
	}
	
	private static int findTarget(int[] input,int target) {
		int start=0 ; 
		int end = input.length-1; 
	
		while(start <= end ) {

				int mid = (start+end)/2;

				if(input[mid] < target) {
					start = mid+1;
					return start ; 
				}else if (input[mid] < target) {
					end = mid-1 ;
				}else {
					return mid ; 
				}
                 }
	  return -1;
	}

}
