
class LintersAndFormatersFixed {
    public static void main( String[] args ) {
        Perros animal1 = new Perros( "Juan", "Perro", "Husky" );
        animal1.Edad = 4;
        animal1.mostrarInformacion();
        animal1.grunido();
        animal1.ladrar();
    }
}

class Animales {
    String Nombre;
    String Especie;
    int Edad;
    Animales(String nombreP, String especieP) {
    this.Nombre = nombreP;
    this.Especie = especieP;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Especie: " + this.Especie);
        System.out.println("Edad: " + this.Edad + " Años");
    }

    void hacerSonido(String sonidoP) { System.out.println(sonidoP);}
}

class Perros extends Animales {
    String raza;
    Perros(String nombreP, String especieP, String razaP) {
    super(nombreP, especieP);
    this.raza = razaP;
    }
    void grunido() { super.hacerSonido("Grrr"); }
    void ladrar() { System.out.println("Guau"); }
}
