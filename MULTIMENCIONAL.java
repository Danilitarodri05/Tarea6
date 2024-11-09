public class MainMultimencional {
    public static void main(String[] args) {
        String[][] compañeros = {
            {"Blanca", "Gomez", "Computacion", "IMSA"},
            {"Luis", "Ayala", "Industrial", "IND"},
            {"Bryan", "Vasquez", "Electronica", "IET"},
            {"Eduardo", "Baquedano", "Industrial", "IND"},
            {"Melissa", "Galeano", "computacion", "IMSA"}
        };

        for (String[] compañero : compañeros) {
            System.out.println("Nombre: " + compañero[0] + ", Apellido: " + compañero[1] +
                               ", Carrera: " + compañero[2] + ", Lugar de Trabajo: " + compañero[3]);
        }
    }
}
