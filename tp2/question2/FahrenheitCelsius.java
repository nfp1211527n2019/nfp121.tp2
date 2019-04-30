package question2;

/**
 *Diana Kanaan
 */

public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */

     public static void main(String[] args){
         
       try{
       	        double Resultat;
		int [] tab= new int[args.length];
		
		for(int j=0;j<args.length;j++)  {
		 tab[j]=Integer.parseInt(args[j]);
                }
                
		for(int i=0;i<tab.length;i++){
		    
		Resultat= fahrenheitEnCelsius(tab[i]);
		
	        System.out.println(tab[i] + "\u00B0F -> " + String.format("%.1f", Resultat) + "\u00B0C");
			}
			
                }catch(NumberFormatException nfe){
                    
                System.out.println("error : " + nfe.getMessage());  
       }
      
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int param){
                 float CelValue = ((int)(((float)5/9 *  (param - 32)) * 10))/10.0f;
       return CelValue;
     }

}
