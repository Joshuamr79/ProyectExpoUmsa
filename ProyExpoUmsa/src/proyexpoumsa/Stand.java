package proyexpoumsa;
import java.util.Scanner;
public class Stand {
    private int nroStand;
    private String ubicacion;
    private double tamano;
    private Proyecto P;
    Scanner w=new Scanner(System.in);
    public Stand(int nro,String u,double t){
        Proyecto P=new Proyecto();
        nroStand=nro;
        ubicacion=u;
        tamano=t;
    }
    public void mostrar(){
        System.out.println(nroStand+" "+ubicacion+" "+tamano);
        P.mostrar();
    }
    public void cambiarUbi(){
        System.out.println("Cambia la ubicacion del Stand "+nroStand+": ");
        ubicacion=w.next();
    }

    public int getNroStand() {
        return nroStand;
    }

    public void setNroStand(int nroStand) {
        this.nroStand = nroStand;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public Proyecto getP() {
        return P;
    }

    public void setP(Proyecto P) {
        this.P = P;
    }
    
}
