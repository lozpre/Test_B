package demo;

class Test {
	
	public static void main(String[] args) {
		// Declarar un arreglo de tipo int con 20 numeros desordenados;
		
		// Declarar un objeto de tipo Ordenacion
		
		// Hacer la llamada al metodo de impresion
		
	}

	public static void imprimirArreglo(Ordenacion o, int[] array) {
		int[] a = o.ordenar(array);
		int n = a.length;

		for (int i = 0; i < n; i++) {	
			if(i != (n-1))
				System.out.print(a[i] + " - ");
			else
				System.out.print(a[i]);
		}

		System.out.print("\n");
	}
}