package question1;

/**
 * Diana Kanaan
 */
public class FahrenheitCelsius {
        /**
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
	        //variable resultat;
	        double Resultat;
	        //le tableau d'arguments:
		int [] tab= new int[args.length];
		//boucle pour transformer les arguments string en int
		for(int i=0;i<args.length;i++)  {
		  tab[i]=Integer.parseInt(args[i]);
                }
                //boucle pour convertir tous les arguments en celcius
		for(int j=0;j<tab.length;j++){
		Resultat= fahrenheitEnCelsius(tab[j]);
		//print demandé
		System.out.println(
		tab[j] + "\u00B0F -> " + String.format("%.1f", Resultat) + "\u00B0C"
		                     ); 
			}
	        }

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	     public static float fahrenheitEnCelsius( int param){
        
	         float CelValue = ((int)(((float)5/9 *  (param - 32)) * 10))/10.0f;
        
        
	return CelValue;
     }
}
