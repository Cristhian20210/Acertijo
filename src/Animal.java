public class Animal {
    static int counter = 1;
    int animalID = this.counter;
    String especie;
    String subEspecie;

    Animal(String especie, String subEspecie) {
        counter++;
        this.especie = especie;
        this.subEspecie = subEspecie;
    }

    public void conocer() {
        System.out.println("Animal ID: " + animalID);
        System.out.println("Hola, soy un animal de origen" + this.especie + " y de la sub especie" + this.subEspecie);
    }

    public static void cantidadDeAnimales() {
        System.out.println("Se han invocado " + (counter - 1) + " Animales.");
    }


}
