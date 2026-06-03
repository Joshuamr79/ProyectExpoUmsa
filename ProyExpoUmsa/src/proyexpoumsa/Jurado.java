
package proyexpoumsa;


public class Jurado extends Persona{
    private String cargo;
    private String turno;
    private String area;
    
    public Jurado(String a, int b,int c,String d,String e,String f)
    {
        super(a,b,c);
        cargo=d;
        turno=e;
        area=f;       
    }
    
    public void mostrar()
    {
        super.mostrar();
        System.out.println(cargo+" "+turno+" "+area);
    }
    
    public void autorizarStand(Stand s)
    {
        s.setAutorizacion(true);
        System.out.println("Stand autorizado");
    }   
    
    public void evaluar(Proyecto p, Evaluacion ev)
    {
        System.out.println("DATOS DEL PROYECTO:");
        p.mostrar();
        System.out.println("DATOS DE LA EVALUACION:");
        ev.mostrar();
    }
}
