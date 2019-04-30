package question3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Diana Kanaan
 */

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degr� Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    sortie.setEditable(false);
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * m�thode d�clench�e lorsque le bouton de conversion est appuy�. 
   * remarquer que le champs de droite (les degr�s Celsius) n'est pas �ditable.
   * @param ae l'�v�nement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
      double Resultat;
      String stringParam = entree.getText(); // valeur est une String et doit �tre convertie en entier, voir java.lang.Integer m�thode parseInt (--> try/catch)
      int fahrenheit = Integer.parseInt(stringParam);
      float Resu = ((int)(((float)5/9 *(fahrenheit - 32)) * 10))/10.0f;
      if(Resu < -273.1f) {
          Resu = -273.1f; }
      Resultat = (double)Resu;
      sortie.setText(String.format("%.1f", Resultat));
   }catch(NumberFormatException nfe){
        sortie.setText("error ! ");
    }
  }
  
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}
