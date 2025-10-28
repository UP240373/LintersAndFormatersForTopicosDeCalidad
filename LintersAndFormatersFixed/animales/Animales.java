package animales;
/**
 * Clase que representa un animal genérico.
 */
public class Animales {
  public String nombre;
  public String especie;
  public int edad;

  /**
   * Constructor por defecto de la clase Animales.
   */
  public Animales() {
    this.nombre = "Sin nombre";
    this.especie = "Desconocida";
    this.edad = 0;
  }

  /**
   * Constructor parametrizado de la clase Animales.
   *
   * @param nombreP  para nombre del animal
   * @param especieP para la especie del animal
   */
  public Animales(String nombreP, String especieP) {
    this.nombre = nombreP;
    this.especie = especieP;
  }

  /**
   * Muestra la información del animal en consola.
   */
  public void mostrarInformacion() {
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Especie: " + this.especie);
    System.out.println("Edad: " + this.edad + " Años");
  }

  /**
   * Hace que el animal emita un sonido generico.
   *
   * @param sonidoP el sonido que emite el animal
   */
  public void hacerSonido() {
    System.out.println(this.nombre + " hace un sonido.");
  }
}