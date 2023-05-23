/**
 
Input: s = "   fly me   to   the moon   "
Output: 4

Explanation: The last word is "moon" with length 4.
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
 
 Input: nums = [1,3,5,6] target = 5
 Output: 2
Input: nums = [1,3,5,6], target = 2
Output: 1
 
 * @author Addula Umamahesh
 *
 */
public class LengthOfLastWordInAString { 
  
  public static void main(String[] args) {
  String str = "   fly me   to   the moon   ";
		int lastWordLength = calculateLenghOfLastWord(str);
		System.out.println(" -->length--> "+lastWordLength);
  } 
  
public static int calculateLenghOfLastWord(String input ) {
		
		input = input.trim();
		if(input.length() == 0)
			return 0; 
		
		int lastIndex = input.length()-1;
		
		while(lastIndex >=0 && input.charAt(lastIndex)== ' ') {
			lastIndex--; 
		}
		
		int firstIndex = lastIndex; 
		
		while(firstIndex>=0 && input.charAt(firstIndex)!= ' ') {
			firstIndex--; 
		}
		
		return lastIndex-firstIndex; 
	}
