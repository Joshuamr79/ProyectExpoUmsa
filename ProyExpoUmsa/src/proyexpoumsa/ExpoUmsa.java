package proyexpoumsa;
import java.util.Scanner;
public class ExpoUmsa {
    private String gestion;
    private int nroStands;
    private Stand S[]=new Stand[50];
    Scanner sc=new Scanner(System.in);
    public ExpoUmsa(String g,int n)
    {
        gestion=g;
        nroStands=n;
        for(int i=0;i<nroStands;i++)
        {
             System.out.println("Numero de Stands: ");int nr=sc.nextInt();
             System.out.println("Ubicacion: ");String ub=sc.next();
             System.out.println("Tamaño: ");double ta=sc.nextDouble();
             Stand st=new Stand(nr, ub, ta);
             S[i]=st;
             
        }
        for(int j=nroStands;j<50;j++)
        {
            S[j]=new Stand(-1,"",-1);
        }
    }
    public void mostrar()
    {
        System.out.println(gestion+" "+nroStands);
        for(int i=0;i<nroStands;i++)
        {
            S[i].mostrar();
        }
    }
    public void buscarStand(int n)
    {
        for(int j=0;j<nroStands;j++)
        {
            if(S[j].getNroStand()==n)
            {
                S[j].mostrar();
            }
        }
    }
}
