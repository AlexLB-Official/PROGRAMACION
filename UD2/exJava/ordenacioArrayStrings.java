public class ordenacioArrayStrings {
	public static void main(String[] args) {
		
		String noms[] = {"Jorge","Iker","Carlos","Adrián","Ramón","Claudia"};
		
		System.out.println("Mostre l'array inicialment...");
		mostraStrings(noms);
		ordenaStrings(noms);
		
		System.out.println("Mostre l'array ya ordenat...");
		mostraStrings(noms);
	}
	
	public static void mostraStrings(String noms[]) {
		for (int i = 0; i < noms.length; i++)
			System.out.println(noms[i]);
	}
	
	public static void ordenaStrings(String noms[]) {
		
		String aux;
		boolean ordenat = false;
		
		for (int limit = noms.length - 2 ; (limit > 0) && (!ordenat) ; limit--) {
			ordenat = true;
			for (int i = 0; i <= limit; i++)
				if (noms[i].compareTo(noms[i+1]) > 0){
					ordenat = false;
					aux = noms[i];
					noms[i] = noms[i+1];
					noms[i+1] = aux;
				}
				
		}
			
	}
}
