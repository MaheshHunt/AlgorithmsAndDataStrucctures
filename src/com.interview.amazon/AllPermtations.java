
import java.util.List;

/**
  (Guest)
    
find all permutations of a given String in Java

    ar = a, r, ar, ra  = 4 
     
     
    
    Car 3! 

     c,a,r,ca,ac,ar,ra,cr,ca,cra car rca rac acr arc
    
    arme - 24
    
    if we want to print all possible combinations .. 

 * @author Addula Umamahesh
 *
 */
public class AllPermtations {
	
	
	public static void allpermutations(String input,String temp){
		
		if(input.length() ==0 ) {
			System.out.println(temp+"");
			return ; 
		}
		
		for(int i=0 ; i<input.length(); i++) {
			char ch =input.charAt(i);
			
			String s1 = input.substring(0, i)+input.substring(i+1);
			allpermutations(s1, temp+ch);
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		allpermutations("car", "");
	}
	

}
