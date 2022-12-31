package figuras;

/**
 * Clase pública contenedora del método estático main.
 *
 * @author Manuel Alejandro Jiménez Torres
 */
public class Test {

    /**
     * Método estático, de tipo void, que toma como parámetro
     * un vector de objetos String.
     * <p>
     * Este método puede ser llamado directamente por la máquina virtual de Java
     * sin la necesidad de crear un objeto de la clase que lo contiene.
     *
     * @param args contiene los argumentos de línea de comandos
     *             suministrados como un vector de objetos String.
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(5.5);
        Circunferencia c2 = new Circunferencia(10.1);
        Circunferencia c3 = new Circunferencia(10.9);

        if (c2.esIgual(false, c3))
            System.out.println("c2 y c3: iguales sin considerar decimales");

        if (c2.esIgual(true, c3))
            System.out.println("c2 y c3: iguales considerando decimales");
    }
}