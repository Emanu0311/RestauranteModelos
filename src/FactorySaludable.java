
/**
 * Class FactorySaludable
 */
public class FactorySaludable implements FactoryMethod {

  //
  // Fields
  //

  //
  // Constructors
  //
  public FactorySaludable() {
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
   * @return BebidaSaludable
   */
  public BebidaSaludable crearBebida() {
    return new BebidaSaludable();
  }

  /**
   * @return EntradaSaludable
   */
  public EntradaSaludable crearEntrada() {
    return new EntradaSaludable();
  }

  /**
   * @return PlatoPrincipalSaludable
   */
  public PlatoPrincipalSaludable crearPlatoPrincipal() {
    return new PlatoPrincipalSaludable();
  }

  /**
   * @return PostreSaludable
   */
  public PostreSaludable crearPostre() {
    return new PostreSaludable();
  }

}
