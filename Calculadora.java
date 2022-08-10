public class Calculadora {
    // Atributos a y b int
    private int a;
    private int b;
    // Constructor de la clase Calculadora
    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // Metodo suma que devuelve el resultado de la suma de a y b
    public int suma() {
        return a + b;
    }
    // Metodo resta que devuelve el resultado de la resta de a y b
    public int resta() {
        return a - b;
    }
    // Metodo multiplicacion que devuelve el resultado de la multiplicacion de a y b
    public int multiplicacion() {
        return a * b;
    }
    // Metodo division que devuelve el resultado de la division de a y b
    public int division() {
        return a / b;
    }
    //instanciar un objeto de la clase Calculadora
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10, 2);
        System.out.println("Suma: " + calculadora.suma());
        System.out.println("Resta: " + calculadora.resta());
        System.out.println("Multiplicacion: " + calculadora.multiplicacion());
        System.out.println("Division: " + calculadora.division());
    }
}
