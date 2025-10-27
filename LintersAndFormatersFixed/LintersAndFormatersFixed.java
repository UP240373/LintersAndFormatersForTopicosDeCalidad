import animales.Perros;
/**
 * Clase principal que demuestra el uso de las clases Animales y Perros.
 */
public class LintersAndFormatersFixed {

  /**
   * Main del proyecto.
   */
  public static void main(String[] args) {
    Perros animal1 = new Perros("Juan", "Perro", "Husky");
    animal1.edad = 4;   // Constructor por defecto

    animal1.mostrarInformacion();

    animal1.grunido();
    animal1.ladrar();
  }
}