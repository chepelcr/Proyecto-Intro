//José Pablo Campos Solano
//Proyecto Programado
    
public class Palabras
{

  private String palabra;
  private int vocales, consonantes;
  
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
  
  public void setVocales(int vocales)
  {
    this.vocales = vocales;
  }//Fin de setVocales
    
  public int getVocales()
  {
    return this.vocales;
  }//Fin de getVocales
    
  public void setConsonantes(int consonantes)
  {
    this.consonantes = consonantes;
  }//Fin de setConsonantes
    
  public int getConsonantes()
  {
    return this.consonantes;
  }//Fin de getConsonantes
  
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
          setVocales();
        }
        else 
        {
          if(palabra.charAt(i)!=' ')
          {
          contC++;
          setConsonantes();
          }
        }
      }
      return "El número de vocales es : " + contV + "\nEl número de consonantes es : " + contC;
  }//Fin del vocYCons
  
}//Fin de la clase
