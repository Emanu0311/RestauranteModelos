
/**
 * Class BebidaGourmet
 */
public class BebidaGourmet implements Bebida {

  //
  // Fields
  //

  private String tipo;
  private String ingredientes;
  private boolean terminado = false;

  //
  // Constructors
  //
  public BebidaGourmet() {
  };

  //
  // Methods
  //

  //
  // Accessor methods
  //

  /**
   * Set the value of tipo
   * 
   * @param newVar the new value of tipo
   */
  public void setTipo(String newVar) {
    tipo = newVar;
  }

  /**
   * Get the value of tipo
   * 
   * @return the value of tipo
   */
  public String getTipo() {
    return tipo;
  }

  /**
   * Set the value of ingredientes
   * 
   * @param newVar the new value of ingredientes
   */
  public void setIngredientes(String newVar) {
    ingredientes = newVar;
  }

  /**
   * Get the value of ingredientes
   * 
   * @return the value of ingredientes
   */
  public String getIngredientes() {
    return ingredientes;
  }

  /**
   * Set the value of terminado
   * 
   * @param newVar the new value of terminado
   */
  public void setTerminado(boolean newVar) {
    terminado = newVar;
  }

  /**
   * Get the value of terminado
   * 
   * @return the value of terminado
   */
  public boolean isTerminado() {
    return terminado;
  }

  //
  // Other methods
  //

  /**
   */
  /**
   */
  public void Beber() {
    System.out.println("Degustando vino tinto reserva (Bebida Gourmet)");
  }

}
