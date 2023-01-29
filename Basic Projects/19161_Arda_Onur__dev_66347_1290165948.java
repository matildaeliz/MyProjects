package homework2;

import java.util.Scanner;

public class StudentNumberGeneratorS018752 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String ch;
		System.out.print("Enter the type of character:");                               // I wrote a code to get character type and size from user//
		ch = sc.next();
				
		short size;
		System.out.print("Enter the size:");
		size = sc.nextShort();
		sc.close();
		
		
		System.out.println("                    ");
		System.out.println("                    ");
	
		int k = size - 2;
		int m = 2 - size;
		int n = 1- size;                                                              //In this area, I arranged a code to move the stars left, right , up and down //
		int v = size - 1;
		
		for(int i = 1; i < 19; i++ ) {
			for(int j = 1; j < 300*size; j++) {
				
				//                                    0                                     //                                 1                              //                                                                            8                                                                                                               //                                                             7                                                           //                                                                                                    5                                                                                                        //                                                                                                                    2                                                                                                //
				//--------------------------------------------------------------------------//--------------------------------------------------------------- // ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------   //-------------------------------------------------------------------------------------------------------------------------//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				if(i >= 1  && j <= 1*size || i <= 1*size && j <= 16 || i >=18+n && j <= 16 || i>= 0 && i<=17 && j>15+n && j<=16 || i>=1 && j > 23 && j<= 24+v || i >= 1 &&   j >=38 && j<39+v || i >=1 && i < 2+v && j >= 39 && j<=55 || i> 17-v && i<=18 && j >=39 && j<=55 || i>=1 && i <=17 && j > 54-v && j <=55 || i > 8 && i <=9 && j >=39 && j <= 55 ||  i >= 1 && i < 2+v &&  j>= 68 && j<=90 || i >= 1 && i <= 9 && j >= 67 && j <68+v  || i>=1 && i <=18 && j>89-v &&  j <=90 || i >=0 && i < 2+v && j >= 105 && j < 125 || i>= 0 && i<= 9 && j>= 105 && j<106+v || i>=9 && i<10+v && j>=105 && j <125  || i>= 10 && i<= 18 && j>123-v && j<= 124 ||  i >17-v && i<=18 && j>=105 && j <125  || i >= 1 && i < 2+v && j >= 140 && j< 161  || i >= 1 && i < 10 && j >160-v && j<= 161 ||  i >= 9 && i< 10+v && j >=140 && j<=161 ||  i >=9 && i<= 18 && j >= 140 && j < 141 +v || i >17-v && i<= 18 && j>=140 && j<=162 ) {
				System.out.print(ch);
				}
			    else                          // I wrote a code with for loops to show my student number but some peace of number's stars dont increase or decrease like middle of 8's stars. I did it on purpose because I wanted it to look good //
				System.out.print(" ");       // I wrote codes horizontally because of fact that I wanted the number horizontally //
			}
			System.out.println();
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");                
	    
		int i = 1;
        int j = 1;
        
        while (i < 19) {
            while (j < 300 ) {
                if (i >= 1 && j <= 1 * size || i <= 1 * size && j <= 16 || i >= 18 + n && j <= 16 || i >= 0 && i <= 17 && j > 15 + n && j <= 16 || i >= 1 && j > 23 && j <= 24 + v  || i >=1 && i < 2+v && j >= 39 && j<=55 || i> 17-v && i<=18 && j >=39 && j<=55 || i>=1 && i <=17 && j > 54-v && j <=55 || i > 8 && i <=9 && j >=39 && j <= 55||  i>=1 && i <=18 && j>89-v &&  j <=90 || i> 8 && i<=9+v && j >= 67 && j<=90 || i >=1 && i<= 9 && j >=67 && j<68+v || i >=0 && i < 2+v && j >= 105 && j < 125 || i>= 0 && i<= 18 && j>= 105 && j<106+v || i>=9 && i<10+v && j>=105 && j <125 || i>= 10 && i<= 18 && j>123-v && j<= 124 ||  i >17-v && i<=18 && j>=105 && j <125 ||  i >= 1 && i < 2+v && j >= 140 && j< 161  || i >= 1 && i < 18 && j >160-v && j<= 161 ||  i >= 9 && i< 10+v && j >=140 && j<=161 || i >=1 && i<= 9 && j >= 140 && j < 141 +v || i >17-v && i<= 18 && j>=140 && j<=161  ) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
                j++;
            }                                                    //   I wrote a code with while loops to show any number but some peace of number's stars dont increase or decrease like middle of 3's stars.//
            i++;
            j = 1;

            System.out.println();
	
	
	}
}

	
}
	
	
	
	
	
	

