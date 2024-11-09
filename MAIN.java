public class Main extends Recursos {
    public static void main(String[] args) {
        
        Recursos recursos = new Recursos();
        System.out.println(recursos.obtenerMensaje());

        int edad = 22;
        System.out.println("Edad: " + edad + " - " + recursos.verificarEdad(edad));
    
        int num1 = 8;
        int num2 = 5;
        System.out.println("Multiplicación: " + recursos.multiplicar(num1, num2));
        int num3 = 12;
        int num4 = 7;
        System.out.println("Suma: " + recursos.sumar(num3, num4));
    }
}
