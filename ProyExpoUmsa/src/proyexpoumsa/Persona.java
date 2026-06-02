
package proyexpoumsa;


public class Persona {
    private String nombre;
    private int ci;
    private int edad;
    
     public Persona(String a,int b, int c)
     {
         nombre=a;
         ci=b;
         edad=c;
     }
     public void mostrar()
     {
         System.out.println(nombre+" "+ci+" "+edad);
     }
}
