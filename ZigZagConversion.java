/* Jason Rudinsky
* August 30, 2024
* Leetcode Question - Zigzag Conversion

* This is a program that will take in the input of a string and the number of rows
* in which the program will "zigzag" the string and then return the new string back to the user.

* 8/30/2024 - Original Version
*/


public class ZigZagConversion{                                                                           // Class Block
   public static void main(String[] args){                                                               // Method Block
      
                                                                                                         // VARIABLE DEFINITIONS
      String s = "PAYPALISHIRING";                                                                       // Defines s
      
      int numRows = 4;                                                                                   // Defines numRows
      
      System.out.printf("The String %s with %d rows becomes %s", s, numRows, convert(s, numRows));       // Prints out to the user
   }
   
   public static String convert(String s, int numRows){                                                  // Method Block
      
      if(numRows == 1){                                                                                  // If there is only one row
         return s;                                                                                       // Returns s to the user
      }
      
      int LCV = 0;                                                                                       // Defines LCV
      int index = 0;                                                                                     // Defines index
      int increment = 1;                                                                                 // Defines increment
      
      String returnString = "";                                                                          // Defines returnString
      
      String zigzag[] = new String[numRows];                                                             // Defines zigzag
      
      for(LCV = 0; LCV < zigzag.length; LCV++){                                                          // For Loop
         zigzag[LCV] = "";                                                                               // Sets the value at the index of LCV in zigzag
      }
      
      for(LCV = 0; LCV < s.length(); LCV++){                                                             // For Loop
         zigzag[index] += s.charAt(LCV);                                                                 // Adds to the value at the index
         
         if(index + increment < 0){                                                                      // Boundary check
            increment *= -1;                                                                             // Flips the value of increment
         }
         else if(index + increment == zigzag.length){                                                    // Boundary check
            increment *= -1;                                                                             // Flips the value of increment
         }
         
         index += increment;                                                                             // Adds to the value of index
      }
      
      for(LCV = 0; LCV < zigzag.length; LCV++){                                                          // For Loop
         returnString += zigzag[LCV];                                                                    // Adds to the value of returnString
      }
      
      return returnString;                                                                               // Returns the string to the user
   }
}