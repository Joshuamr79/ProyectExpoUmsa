package proyexpoumsa;
import java.util.Scanner;
public class Carrera {
    private String nombre;
    private int duracion;
    private int nroProyectos;
    private Proyecto P[]=new Proyecto[10];
    Scanner w=new Scanner(System.in);
    public Carrera(String n,int d,int nro)
    {
        nombre=n;
        duracion=d;
        nroProyectos=nro;
        for (int i = 0; i < nroProyectos; i++) {
            System.out.println("Tema del proyecto:");String te=w.next();
            System.out.println("Area del proyecto:");String a=w.next();
            System.out.println("Numero de Expositores:");int nroE=w.nextInt();
            System.out.println("Numero de Evaluaciones:");int nroEv=w.nextInt();
            P[i]=new Proyecto(te,a,nroE,nroEv);
            for(int j=nroProyectos;j<10;j++)
             {
              P[j]=new Proyecto("","",-1,-1);
             }
        }
    }
    public void mostrar()
    {
        System.out.println(nombre+" "+duracion+" "+nroProyectos);
        for(int i=0;i<nroProyectos;i++)
        {
            P[i].mostrar();
        }
    }
}