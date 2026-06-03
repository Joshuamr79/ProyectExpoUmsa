package proyexpoumsa;
import java.util.Scanner;
public class Facultad {
   private String nombre;
   private int nroCarreras;
   private Carrera ca[]=new Carrera[10];
   Scanner w=new Scanner(System.in);
   public Facultad(String n,int nro){
       nombre=n;
       nroCarreras=nro;
       for(int i=0;i<nroCarreras;i++){
           System.out.println("Ingrese nombre de la carrera: ");String no=w.next();
           System.out.println("Ingrese duracion de la carrera: ");int d=w.nextInt();
           System.out.println("Ingrese nro de Proyectos de la carrera: ");int nropr=w.nextInt();
           ca[i]=new Carrera(no,d,nropr);
       }
       for(int j=nroCarreras;j<10;j++)
       {
           ca[j]=new Carrera("",-1,-1);
       }
   }
   public void mostrar()
   {
       System.out.println(nombre+" "+nroCarreras);
       for(int i=0;i<nroCarreras;i++)
       {
           ca[i].mostrar();
       }
   }
   
}
