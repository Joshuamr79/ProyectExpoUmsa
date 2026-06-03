package proyexpoumsa;
import java.util.Scanner;
public class Proyecto {
    private String tema,area;
    private int nroExpositores,nroEvaluaciones;
    Expositor ex[]=new Expositor[10];
    Evaluacion ev[]=new Evaluacion[10];
    Scanner sc=new Scanner(System.in);

    public Proyecto(String t, String a, int nex, int nev){
        tema = t;
        area = a;
        nroExpositores = nex;
        nroEvaluaciones = nev;
        if(nex != 0){
            for(int i=0;i<nroExpositores;i++){
                System.out.println("Nombre: ");String n=sc.next();
                System.out.println("C.I.: ");int c=sc.nextInt();
                System.out.println("Edad: ");int e=sc.nextInt();
                System.out.println("R.U: ");int r=sc.nextInt();
                Expositor exp=new Expositor(n, c, e, r);
                ex[i]=exp;
            }
        }
        if(nev != 0){
            for(int i=0;i<nroEvaluaciones;i++){
                System.out.println("Hora: ");String h=sc.next();
                System.out.println("Fecha: ");String f=sc.next();
                System.out.println("Comentario: ");String co=sc.next();
                System.out.println("Calificacion [0-10]: ");double ca=sc.nextInt();
                Evaluacion eva=new Evaluacion(h, f, co, ca);
                ev[i]=eva;
            }
        }
    }

    public void mostrar(){
        System.out.println("----- PROYECTO -----");
        System.out.println("Tema: "+tema);
        System.out.println("Area: "+area);
        System.out.println("--- EXPOSITORES "+nroExpositores+" ---");
        for(int i=0;i<nroExpositores;i++)
            ex[i].mostrar();
        System.out.println("--- EVALUCIONES ---");
        for(int i=0;i<nroEvaluaciones;i++)
            ev[i].mostrar();
    }

    public void calcNota(){
        int suma=0;
        for(int i=0;i>nroEvaluaciones;i++)
            suma += ev[i].getCalificacion();
        System.out.println("La nota es "+suma+"/100");
    }
}
