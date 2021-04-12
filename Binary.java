import javax.swing.JOptionPane;

public class Binary {
	// Convert binary  number to hexidecimal number

	public Binary() {
		
		
	}
	
	  // method to convert binary to decimal
    int binaryToDec(long binary)
    {
    	long origBinary = binary;
        // variable to store the converted
        // binary number
        int decimalNumber = 0, i = 0;
  
        // loop to extract the digits of the binary
        while (binary > 0) {
  
            // extracting the digits by getting
            // remainder on dividing by 10 and
            // multiplying by increasing integral
            // powers of 2
            decimalNumber
                += Math.pow(2, i++) * (binary % 10);
  
            // updating the binary by eliminating
            // the last digit on division by 10
            binary /= 10;
        }	
		return decimalNumber;
    }
  
    // method to convert decimal to hexadecimal
	String binToHex(long binary)
    {
    	long origBinaryHex = binary;
        // variable to store the output of
        // binaryToDecimal() method
        int decimalNumber = binaryToDec(binary);
  
        // character array to represent double
        // digit remainders
        char arr[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
  
        // variable to store the remainder on
        // division by 16
        int remainder, i = 0;
  
        // declaring the string that stores the
        // final hex string
        String hexNumber = "";
  
        // loop to convert decimal to hex
        while (decimalNumber != 0) {
  
            // calculating the remainder of decimal
            // by dividing by 16
            remainder = decimalNumber % 16;
  
            // checking if the remainder is >= 10
            if (remainder >= 10)
                
                // replacing with the corresponding
                // alphabet from the array
                hexNumber = arr[remainder - 10] + hexNumber;
            
            else
                
                hexNumber = remainder + hexNumber;
  
            // update condition of dividing the
            // number by 16
            decimalNumber /= 16;
        }
		// returning the Hex number
        return hexNumber;
    }

}
