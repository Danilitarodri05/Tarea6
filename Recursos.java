public class Recursos {

    public String obtenerMensaje() {
        return "Programación Orientada a Objetos 2021";
    }


    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

 
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }
}
