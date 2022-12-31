package figuras;

/**
 * Clase pública contenedora de los atributos y operaciones
 * del objeto Circunferencia.
 *
 * @author Manuel Alejandro Jiménez Torres
 */
public class Circunferencia {
    private double radio;
    private String color;

    /**
     * Constructor de la clase Circunferencia.
     *
     * @param radio parámetro tomado por el constructor Circunferencia.
     * @see Circunferencia
     */
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
     * Método sin parámetros, de tipo void, contenedor de atributos y cálculos,
     * que no devuelve ningún valor.
     */
    public void imprimir() {
        color = "rojo";
        System.out.println("Diámetro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
    }

    /**
     * Método para tomar dos parámetros y devolver un valor de tipo booleano.
     * <p>
     * Este método compara dos radios circunferenciales y devuelve
     * un valor de tipo booleano como resultado de dicha comparación.
     *
     * @param considerarDecimales parámetro tomado por el método esIgual.
     * @param otro                parámetro tomado por el método esIgual.
     * @return un valor de tipo booleano.
     */
    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }

    /**
     * Método (getter) para devolver el valor de un atributo.
     *
     * @return el valor del atributo.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Método (setter) para tomar un parámetro y asignarlo a un atributo.
     *
     * @param radio parámetro tomado por el método setRadio.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}