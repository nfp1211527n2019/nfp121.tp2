package question1;

/**
 * Diana Kanaan
 */
public class FahrenheitCelsius {
        /**
	 * le point d'entr�e de cette application, dont le commentaire est �
	 * compl�ter
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
		//print demand�
		System.out.println(
		tab[j] + "\u00B0F -> " + String.format("%.1f", Resultat) + "\u00B0C"
		                     ); 
			}
	        }

	/**
	 * la m�thode � compl�ter.
	 * 
	 * @param f
	 *            la valeur en degr� Fahrenheit
	 * @return la conversion en degr� Celsius
	 */
	     public static float fahrenheitEnCelsius( int param){
        
	         float CelValue = ((int)(((float)5/9 *  (param - 32)) * 10))/10.0f;
        
        
	return CelValue;
     }
}
