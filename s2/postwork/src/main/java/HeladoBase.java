public class HeladoBase implements Helado {


  @Override
  public String getIngredientes() {
    return "Producto: Helado suave";
  }


  @Override
  public int getPrecio() {
    return 30;
  }
}