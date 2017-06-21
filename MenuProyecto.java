//José Pablo Campos Solano
//Proyecto Programado
//Clase Menu

import javax.swing.JOptionPane;

public class MenuProyecto
{
  public void menu()
  {
    int opcion, opcion1;
    String palabra;
    
    Palabras p1,p2,p3;
    
    JOptionPane.showMessageDialog(null,"Bienvenido a Juegos Mentales");
    
    do
    {
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la aplicacion que desea ejecutar \n 1. Clasificación de Palabras \n 2. Palabras Desordenadas \n 3. Trivia Matematica \n 4. Salir"));
      
      switch(opcion)
      {
        case 1:
          palabra =JOptionPane.showInputDialog("Ingrese la palabra 1");
          p1 = new Palabras();
          p1.setPalabra(palabra);
          
          palabra =JOptionPane.showInputDialog("Ingrese la palabra 1");
          p2 = new Palabras();
          p2.setPalabra(palabra);
          
          palabra =JOptionPane.showInputDialog("Ingrese la palabra 1");
          p3 = new Palabras();
          p3.setPalabra(palabra);
          
          opcion1 = Integer.parseInt(JOptionPane.showInputDialog("Indique el procedimiento a seguir \n 1. "));
        break;//Fin de clasificación de palabras
          
        case 2:
          
        break;
          
        case 3:
          
        break;
          
        case 4:
          JOptionPane.showMessageDialog(null, "Hasta pronto!");
      }//Fin del switch
    }while(opcion!=4);//Fin del Do/While
    
    palabra = JOptionPane.showInputDialog("Ingrese una palabra");
    palabras.setPalabra(palabra);
    
    
    JOptionPane.showMessageDialog(null, palabras.vocYCons());
    
  }//Fin del metodo
}//Fin de la clase
