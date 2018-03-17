class Archivo2{
	public static int factorial(int n){
		int fact=1;
    		int i;
    		if (n==0){
       			fact=1;
   		 }else{
        		for(i=1;i<=n;i++){
            			fact=fact*i;
			}
		}
		return fact;
	}
}
