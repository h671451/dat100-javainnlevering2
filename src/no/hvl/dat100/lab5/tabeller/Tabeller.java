package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabell[] = {2,4,6,8,10,12};
		int tabell2[] = {1,3,5,7,9,11};
		
		skrivUt(tabell);
		
		// OPPGAVE B
		System.out.println(tilStreng(tabell));
		
		// OPPGAVE C
		System.out.println("Sum av tabell: " +(summer(tabell)));
		
		// OPPGAVE D
		System.out.println("Tallet er: " + (finnesTall(tabell,0)));
		
		// OPPGAVE E
		System.out.println("Den første indeksen til tabellen er tabell[" +(posisjonTall(tabell,12)) + "]");
		
		// OPPGAVE F
		int[] revtab = reverser(tabell);

		skrivUt(revtab);
		
		// OPPGAVE G
		System.out.println("Er tabellen sortert?: " + (erSortert(tabell)));
		
		// OPPGAVE H
		int[] sammentab = settSammen(tabell,tabell2);
		
		skrivUt(sammentab);
	}

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		System.out.print("[");

		for (int i : tabell) {
			System.out.print(i + " ");
			
		}
		System.out.print("]");

		System.out.println("");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		System.out.print("\"[");
		String komma = ",";

		int i = 0;
	
		while(i<tabell.length) {
			int j = tabell[i];
			System.out.print(j+komma);
		i++;	
		}
		
		String x = "]\"";
		return x;
		
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for(int i : tabell) {
		sum += i;
		
		}
		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		int i = 0;
		while (i<tabell.length) {
			if(tabell[i] == tall) {
				return !finnes;
			}
			i++;
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int i = 0;
		
		while(i<tabell.length) {
			// if the input is the same as the number in the array,then return i
			if(tabell[i]==tall) {
				return i;
			} 
			i++;
		}
		
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

	    int[] nytab = new int[tabell.length];
	    
	    for (int i =0; i<tabell.length; i++){
	        nytab[i]= tabell[tabell.length-1-i]; // assign from the reverse of the input
	    }
		
		return nytab;
		
	}

	// g)
	public static boolean erSortert(int[] tab) {
		boolean sortert = true;
		int i = 0;
		while(i<tab.length-1) {
			if(tab[i]>tab[i+1]) {
				
				return !sortert;
			} 
			i++;
			
		}
			
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
	    int[] tab1 = tabell1;
	    int[] tab2 = tabell2;
	    
	    int tab3 = tab1.length + tab2.length;
	    
	    int[] sammentab = new int[tab3];
	    
	    int pos = 0;
	    for (int i:tab1) {
	    	sammentab[pos] = i;  
	    	pos++;   
	    }
	    for (int i : tab2) {
	    	sammentab[pos] = i;  
	    	pos++;  
	    }

	
		return sammentab;
	}
}
