
/**
 * Class FactoryGourmet
 */
public class FactoryGourmet implements FactoryMethod {

  //
  // Fields
  //

  //
  // Constructors
  //
  public FactoryGourmet() {
  };

  //
  // Methods
  //

  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   * @return BebidaGourmet
   */
  public BebidaGourmet crearBebida() {
    return new BebidaGourmet();
  }

  /**
   * @return EntradaGourmet
   */
  public EntradaGourmet crearEntrada() {
    return new EntradaGourmet();
  }

  /**
   * @return PlatoPrincipalGourmet
   */
  public PlatoPrincipalGourmet crearPlatoPrincipal() {
    return new PlatoPrincipalGourmet();
  }

  /**
   * @return PostreGourmet
   */
  public PostreGourmet crearPostre() {
    return new PostreGourmet();
  }

}
