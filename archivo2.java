class Archivo2{
	public static int factorial_i(int n){
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
	public static int factorial_r(int n){
		if (n==0){
		        return 1;
    		}else{
        		return n*(factorial(n-1));
		}
	}
}
