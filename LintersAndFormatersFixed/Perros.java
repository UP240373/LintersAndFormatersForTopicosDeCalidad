/**
 * Clase que representa un perro, hereda atributos de Animales.
 */
public class Perros extends Animales {
  public String raza;

  /**
   * Constructor de la clase Perros.
   *
   * @param nombreP  para el nombre del perro
   * @param especieP para la especie del perro
   * @param razaP    para la raza del perro
   */
  public Perros(String nombreP, String especieP, String razaP) {
    super(nombreP, especieP);
    this.raza = razaP;
  }

  /**
   * Hace que el perro emita un gruñido.
   */
  public void grunido() {
    super.hacerSonido("Grrr");
  }

  /**
   * Hace que el perro ladre.
   */
  public void ladrar() {
    System.out.println("Guau");
  }
}