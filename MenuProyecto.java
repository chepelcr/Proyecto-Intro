//José Pablo Campos Solano
//Proyecto Programado
//Clase Menu

import javax.swing.JOptionPane;
import java.util.Scanner;

public class MenuProyecto
{
  public void menu()
  {
    int letras, vocales, consonantes;
    String palabra;
    
    Palabras palabras = new Palabras();
    
    JOptionPane.showMessageDialog(null,"Bienvenido a Juegos Mentales");
    
    palabra = JOptionPane.showInputDialog("Ingrese una palabra");
    palabras.setPalabra(palabra);
    
    
    JOptionPane.showMessageDialog(null, palabras.vocYCons());
    
  }//Fin del metodo
}//Fin de la clase