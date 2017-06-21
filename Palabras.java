//José Pablo Campos Solano
//Proyecto Programado
    
public class Palabras
{

  private String palabra;
  
  public Palabras(palabra)
  {
    this.palabra = palabra;
    
  }//Fin del constructor con parametros
  
  
  public void setPalabra(String palabra)
  {
    this.palabra = palabra;
  }//Fin de setNombre
  
  public String getPalabra()
  {
    return this.palabra;
  }//Fin de getNombre
  
  public String vocYCons()
  {
    int contV=0,contC=0;
    
    palabra  = getPalabra();
      
    palabra = palabra.toLowerCase();
      
      for(int i=0;i<palabra.length();i++)
      {
        if((palabra.charAt(i)=='a')||(palabra.charAt(i)=='e')||(palabra.charAt(i)=='i')||(palabra.charAt(i)=='o')||(palabra.charAt(i)=='u'))
        {
          contV++;
        }
        else 
        {
          if(palabra.charAt(i)!=' ')
          {
          contC++;
          }
        }
      }
      return "El número de vocales es : " + contV + "\nEl número de consonantes es : " + contC;
  }//Fin del vocYCons
  
}//Fin de la clase
