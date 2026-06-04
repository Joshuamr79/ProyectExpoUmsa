package proyexpoumsa;

public class Evaluacion {
    private String hora,fecha,comentario;
    private Double calificacion;

    public Evaluacion(String h, String f, String co, double c){
        hora = h;
        fecha = f;
        comentario = co;
        calificacion = c;
    }

    public void mostrar(){
        System.out.println(hora+" "+fecha+" "+calificacion+" "+comentario);
    }

    public Double getCalificacion(){
        return calificacion;
    }
}
