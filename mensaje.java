
public class mensaje {
        

    public static void main(String[] args) {
    	double suma; int i; int cont = 0;	
    	
    	do
    		{
    			double num1 = Math.random() * 10; double num2 = Math.random() * 10;
    			suma = num1 + num2;
    			
    			System.out.println("LA SUMA TOTAL ES: " + suma);
    				if(suma > 9)
    		{
    			System.out.println("El Número Alcanza la Decena.");
    			System.out.println();
    		}else{ System.out.println("El Número solo Alcanza la Unidad.");
    		System.out.println();}
    		
    			cont = cont + 1;	
    		}while (cont < 5);
    		    	
    }
}
