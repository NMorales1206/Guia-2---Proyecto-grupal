import java.util.Scanner;
public class Proyecto {
	static Scanner tec = new Scanner (System.in);
	public static void main(String[] args) {
		
	        System.out.println("Ingrese números a traducir");
		    String num = tec.next();
		    
		    int[] nd = new int[num.length()];
	        int i = nd.length - 1;
	        int numero = Integer.parseInt(num);
	       
	        
	        while (numero > 0) {
	            
	            nd[i] = numero % 10;
	            numero = numero / 10;
	            i--;
	        }

	        for( i=0; i < nd.length; i++){
	        	
	        	if (nd[i]==0) {
	    			
	    			System.out.println("0 = Cero - Zero");
	    			
	    		} else if(nd[i]==1) {
	    			
	    			System.out.println("1 = Uno - One");
	    			
	    		} else if(nd[i]==2) {
	    			System.out.println("2 = Dos - Two");
	    			
	    		} else if (nd[i]==3) {
	    			System.out.println("3 = Tres - Three");
	    			
	    		} else if (nd[i]==4) {
	    			System.out.println("4 = Cuatro - Four");
	    			
	    		}else if (nd[i]==5) {
	    			System.out.println("5 = Cinco - Five");
	    			
	    		} else if(nd[i]==6) {
	    			System.out.println("6 = Seis - Six");
	    			
	    		} else if(nd[i]==7) {
	    			System.out.println("7 = Siete - Seven");
	    			
	    		} else if(nd[i]==8) {
	    			System.out.println("8 = Ocho - Eight");
	    		 	
	    		} else{
	    		 	System.out.println("9 = Nueve - Nine");
	    		
	 }
	 }

}

}
	