public class recercaLinealEnteraDesordenada {
	public static void main(String[] args) {
		
		int nums[] = {4,12,7,9,4,7}, valor, pos;
		
		System.out.println("¿Quin valor vols trobar a l'array?: ");
		valor = Integer.parseInt(System.console().readLine());
		
		cerca(nums,valor);
		
		System.out.println("El valor s'ha trobat en " + cerca(nums,valor) + " posicions.");
	}
	
	public static int cerca(int nums[], int valor) {
		
		int aparicions = 0;
		
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == valor)
				aparicions++;
		return aparicions;
	}
}
