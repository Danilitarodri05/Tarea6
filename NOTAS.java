public class MainNotas {
    public static void main(String[] args) {
        String nombre1 = "Daniela";
        int nota1 = 65;
        String nombre2 = "Jesler";
        int nota2 = 89;

        System.out.println(nombre1);
        System.out.println(nota1);
        if (nota1 >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        System.out.println(nombre2);
        System.out.println(nota2);
        if (nota2 >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
