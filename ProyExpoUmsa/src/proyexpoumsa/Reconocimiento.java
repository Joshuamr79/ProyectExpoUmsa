
package proyexpoumsa;


public class Reconocimiento {
    private String tipo;
    private int cargahoraria;
    
    public Reconocimiento(String t,int c)
    {
        tipo=t;
        cargahoraria=c;
    }
    
    public void mostrar()
    {
        System.out.println(tipo+" "+cargahoraria);
    }
    
}
