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



	public static void BurbujaSort(Ordenacion o,int[]array){
		
		int [] N = o.ordenar(array);
		int n = N.length;
		
		for(int i =n-1;i>0; i--){
			
			for(int j= 0;j<i;j++){
				
				if(N[j]>N[j+1]){
					
					int tmp = N[j];
					N[j]	= N[j+1];
					N[j+1]	= tmp;
					
				}
				
			}
			
		}
		
		System.out.print("\n");
	}


}