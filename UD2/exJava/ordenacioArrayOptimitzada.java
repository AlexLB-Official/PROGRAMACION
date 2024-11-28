/* Programa que genera 10 números de loteria aleatoris (entre 0 i 99999) en un array, el mostra, i l'ordena amb el mètode la bombolla (bubbling sort)
i el torna a mostrar ja ordenat */

public class ordenacioArrayOptimitzada
{
	private final static int TAM = 10;
	public static void main(String[] args)
	{
		int nums[] = new int[TAM];	// CREE L'ARRAY
		
		carregaValors(nums);
		System.out.println("Mostre l'array inicialment ...");
		mostraValors(nums);
		ordenaValors(nums);
		System.out.println("Mostre l'array ja ordenat ...");
		mostraValors(nums);
	}
	
	public static void carregaValors(int nums[])
	{
		for( int i = 0 ; i < nums.length ; i++)
			nums[i] = /* valor entre 0 i 99999 */ (int) (Math.random()*100000);
	}
	
	public static void mostraValors(int nums[])
	{
		for( int i = 0 ; i < nums.length ; i++)
			System.out.print("\t" + nums[i]);
		System.out.println();	
	}
	
	// ordenació per el mètode de la bombolla (bubbling sort)
	public static void ordenaValors(int nums[])
	{
		// VERSIÓ NO OPTIMITZADA
		int aux;
		boolean ordenat = false;
		
		// ara per a entrar al bucle farà falta que limit siga major que 0 i que no estiga ordenat (ordenat a false)
		for( int limit = nums.length - 2 ; (limit > 0) && (!ordenat)  ; limit--)
		{
			ordenat = true;
			for(int i = 0 ; i <= limit ; i++)
				if (nums[i] > nums[i+1])
				{
					ordenat = false;
					aux = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = aux;
				}
		}
	}
}
