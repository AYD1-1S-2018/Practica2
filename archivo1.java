class Archivo1{
	public static String Suma(String a, String b) {
         	int a1 = Integer.parseInt(a, 2);
        	int b1 = Integer.parseInt(b, 2);
        	int c1 = a1 + b1;
        	String resultado = Integer.toString(c1, 2);
        	return resultado;
    	}

 	public static String Multiplicacion(String a, String b) {
        	int a1 = Integer.parseInt(a, 2);
	        int b1 = Integer.parseInt(b, 2);
	        int c1 = a1 * b1;
        	String resultado = Integer.toString(c1, 2);
	        return resultado;
	}

	public static String Resta(String a, String b) {
        	int a1 = Integer.parseInt(a, 2);
	        int b1 = Integer.parseInt(b, 2);
	        int c1 = a1 - b1;
	        String resultado = Integer.toString(c1, 2);
	        return resultado;
    	}
	public static String Division(String a, String b) {
       		int a1 = Integer.parseInt(a, 2);
	        int b1 = Integer.parseInt(b, 2);
        	int c1 = a1 / b1;
	        String resultado = Integer.toString(c1, 2);
        	return resultado;
	} 
	public static String Potencia(String a, int exp){
		int a1 = Integer.parseInt(a, 2);
		int c1 = (int)Math.pow(a1, exp);
		String resultado = Integer.toString(c1, 2);
		return resultado;
	} 
	public static String Raiz_Cuadrada(String a){
		int a1 = Integer.parseInt(a, 2);
		float c1 = (float)Math.sqrt(a1);
		String resultado = Float.toString(c1);
		return resultado;
	} 
}

