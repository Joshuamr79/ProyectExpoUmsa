package proyexpoumsa;
import java.util.Scanner;
public class Stand {
    private int nroStand;
    private String ubicacion;
    private double tamano;
    private boolean autorizacion;
    private Proyecto P;
    Scanner w=new Scanner(System.in);
    public Stand(int nro,String u,double t){
        System.out.println("");
        autorizacion = false;
        w.nextLine(); // limpiar buffer antes de leer Strings con nextLine()
        System.out.print("Ingrese el Tema del Proyecto: ");
        String tema = w.nextLine();
        System.out.print("Ingrese el Area: ");
        String area = w.nextLine();
        System.out.print("Ingrese el numero de Expositores: ");
        int nroE = w.nextInt();
        System.out.print("Ingrese el numero de Evaluaciones: ");
        int nroEv = w.nextInt();
        P = new Proyecto(tema, area, nroE, nroEv);
        nroStand=nro;
        ubicacion=u;
        tamano=t;
    }
    public void mostrar(){
        System.out.println(nroStand+" "+ubicacion+" "+tamano+" "+autorizacion);
        P.mostrar();
    }

    public boolean isAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(boolean autorizacion) {
        this.autorizacion = autorizacion;
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
