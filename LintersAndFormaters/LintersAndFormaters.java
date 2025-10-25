
class LintersAndFormatersFixed {
    public static void main(String[] args) {

        Perros animal1 = new Perros("Juan", "Perro", "Husky");
        animal1.edad = 4;
        animal1.mostrarInformacion();
        animal1.grunido();
        animal1.ladrar();
    }
}

class Animales {
    String nombre;
    String especie;
    int edad;
    Animales(String nombreP, String especieP) {
        this.nombre = nombreP;
        this.especie = especieP;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad: " + this.edad + " Años");
    }

    void hacerSonido(String sonidoP) {
        System.out.println(sonidoP);
    }
}

class Perros extends Animales {
    String raza;
    Perros(String nombreP, String especieP, String razaP) {
        super(nombreP, especieP);
        this.raza = razaP;
    }
    void grunido() {
        super.hacerSonido("Grrr");
    }
    void ladrar() {
        System.out.println("Guau");
    }
}