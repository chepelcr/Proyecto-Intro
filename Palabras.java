//José Pablo Campos Solano
//Proyecto Programado

public class Palabras
{
  private int letras;
  private int vocales;
  private int consonantes;
  private String nombre;
  
  public Palabras(int letras, int vocales, int consonantes, String nombre)
  {
    this.letras = 0;
    this.vocales = 0;
    this.consonantes = 0;
    this.nombre = "";
  }//Fin del constructor con parametros
  
  public void setLetras (int letras)
  {
    this.letras = letras;
  }//Fin de setLetras
  
  public int getLetras()
  {
    return this.letras;
  }//Fin de getLetras
  
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
  }//Fin de setConsonates
  
  public int getConsonantes()
  {
    return this.consonantes;
  }//Fin de getConsonantes
  
  public void setNombre(String Nombre)
  {
    this.nombre = nombre;
  }//Fin de setNombre
  
  public String getNombre()
  {
    return this.nombre;
  }//Fin de getNombre
  
}//Fin de la clase