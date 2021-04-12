

public class Decimal {

	public static String decTohex(int decimal){    
	     int rem;  
	     String hex="";   
	     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
	    while(decimal>0)  
	     {  
	       rem=decimal%16;   
	       hex=hexchars[rem]+hex;   
	       decimal=decimal/16;  
	     }  
	    return hex;  
	}
	
    // function to convert decimal to binary
    public StringBuilder decToBinary(int inputedNo)
    {
    	StringBuilder result = new StringBuilder();

        int i =0;

        while (inputedNo > 0){
            result.append(inputedNo%2);
            i++;
            inputedNo = inputedNo/2;
        }
        
        StringBuilder output = result.reverse();
        
        return output;
    }

}
