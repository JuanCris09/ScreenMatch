public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    void muestraFichaTecnica() {
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos es: " + duracionEnMinutos);
    }

    void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
