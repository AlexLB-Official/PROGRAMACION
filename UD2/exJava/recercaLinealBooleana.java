public class recercaLinealBooleana {
	public static void main(String[] args) {
		
		int nums[] = {4,12,7,9}, valor;
		
		System.out.println("¿Quin valor vols trobar a l'array?: ");
		valor = Integer.parseInt(System.console().readLine());
		
		if (cerca(nums,valor))
			System.out.println("El valor SI existeix a l'array");
		else
		
			System.out.println("el valor NO existeix a l'array");
	}
	
	public static boolean cerca(int nums[], int valor) {
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == valor)
			return true;
		return false;
	}
}
