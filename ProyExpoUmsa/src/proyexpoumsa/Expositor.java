
package proyexpoumsa;


public class Expositor extends Persona{
    private int ru;
    private Reconocimiento r;
    
    public Expositor(String a,int b,int c,int d)
    {
        super(a,b,c);
        ru=d;     
    }
    
    public void mostrar()
    {
        super.mostrar();
        System.out.println(ru);
        if(r != null)
            r.mostrar();
    }
    
    public void exponer()
    {  
        System.out.println("El expositor con RU " + ru + " esta exponiendo su proyecto");
    }
    
    public void colocar(Reconocimiento x)
    {
        r=x;
    }
    
    public void eliminar()
    {
        r=null;
    }
}
