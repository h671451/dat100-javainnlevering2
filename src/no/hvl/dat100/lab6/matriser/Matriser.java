package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	
	public static void main(String[] args) {
		int [][] matrise = {    	
								{1,2,3,},
								{4,5,6,},
								{7,8,9}
		};
		
		int [][] nymatrise = {    	
								{1,2,3,},
								{4,5,6,},
								{7,5,9}
};
		
		skrivUt(matrise);
		
		tilStreng(matrise);
		
		int [][] endrematrise = skaler(2,matrise);
		 
		
		skrivUt(endrematrise);
		
		skrivUt(matrise);
		
		skrivUt(nymatrise);
		
		
		System.out.print("Er 2D tabellene like? Svar: "+erLik(matrise,nymatrise));
		
		
		
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for ( int i= 0; i<matrise.length; i++) {
			System.out.println();
			for(int j= 0; j<matrise.length; j++) {
				System.out.print(matrise[i][j]+ " ");
			}
		}
		System.out.println(" ");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

        StringBuilder out = new StringBuilder();
        System.out.println(" ");
        for (int[] tabell : matrise) {
            for (int tall : tabell) {
                out.append(tall);
                out.append(" ");
            }
            out.append("\n");
        }
        System.out.println(out);
        return out.toString();
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
	    int length = matrise.length;
	    	    
	    int[][] nymatrise = new int [length] [matrise.length];
		
		for (int i = 0; i<length; i++) {
			
			for(int j = 0; j<length; j++) {
				nymatrise[i][j] = matrise[i][j]*tall;
			}			

		}
		return nymatrise;
		
	}

	// d)
	public static boolean erLik(int[][] m1, int[][] m2) {

	       if (m1.length != m2.length) {
	    	   return false;
	       }
	       for (int i = 0; i < m1.length; i++) {
	         if (m1[i].length != m2[i].length) {
	        	 return false;
	         }
	         for (int j = 0; j < m1[i].length; j++) {
	         if (m1[i][j] != m2[i][j]) {
	        	 return false;
	         }
	         
	         }
	      }
	      return true;
	}

	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
