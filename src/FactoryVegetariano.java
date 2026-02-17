
/**
 * Class FactoryVegetariano
 */
public class FactoryVegetariano implements FactoryMethod {

  //
  // Fields
  //

  //
  // Constructors
  //
  public FactoryVegetariano() {
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
   * @return BebidaVegetariana
   */
  public BebidaVegetariana crearBebida() {
    return new BebidaVegetariana();
  }

  /**
   * @return EntradaVegetariano
   */
  public EntradaVegetariano crearEntrada() {
    return new EntradaVegetariano();
  }

  /**
   * @return PlatoPrincipalvegetariano
   */
  public PlatoPrincipalvegetariano crearPlatoPrincipal() {
    return new PlatoPrincipalvegetariano();
  }

  /**
   * @return PostreVegetariano
   */
  public PostreVegetariano crearPostre() {
    return new PostreVegetariano();
  }

}
