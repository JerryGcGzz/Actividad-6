
class estudiante{
    String nombre;
    double calificaciones [] = new double[5];

    //Método para calcular promedio
    public double getPromedio() {

        double suma = 0;
        double promedio = 0;

        for (int x = 0; x < calificaciones.length; x++) {
            suma = suma + calificaciones[x];
        }

        promedio = suma/ calificaciones.length;

        return promedio;
    }

    //Método para obtener calificación
    public String getCalificacion() {

        String calificacion  =" ";

        if (getPromedio() <= 50){
             calificacion = "F";
        }

        if (getPromedio() > 50 && getPromedio() < 60){
            calificacion = "E";
        }

        if (getPromedio() > 60 && getPromedio() < 70){
            calificacion = "D";
        }

        if (getPromedio() > 70 && getPromedio() < 80) {
            calificacion = "C";
        }

        if (getPromedio() > 80 && getPromedio() > 90){
             calificacion = "B";
         }

        if (getPromedio() >90){
            calificacion = "A";
        }

        return calificacion;
    }

    //Metodo para imprimir datos
    public void Datos(){
        System.out.println("Nombre del estudiante: " +nombre);
        System.out.println("Calificacion 1: " +calificaciones[0]);
        System.out.println("Calificacion 2: " +calificaciones[1]);
        System.out.println("Calificacion 3: " +calificaciones[2]);
        System.out.println("Calificacion 4: " +calificaciones[3]);
        System.out.println("Calificacion 5: " +calificaciones[4]);
        System.out.println("Promedio: " +getPromedio());
        System.out.println("Calificacion: " +getCalificacion());
    }



}

public class Actividad6 {
    public static void main(String[] args) {


        estudiante alumno1 = new estudiante();
        alumno1.nombre = "Jose";
        alumno1.calificaciones[0] = 95;
        alumno1.calificaciones[1] = 100;
        alumno1.calificaciones[2] = 98;
        alumno1.calificaciones[3] = 99;
        alumno1.calificaciones[4] = 90;

        alumno1.getPromedio();
        alumno1.getCalificacion();

        alumno1.Datos();

    }
}
