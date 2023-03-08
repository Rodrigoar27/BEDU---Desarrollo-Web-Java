
public class Topping implements Helado {


    private Helado helado;


    public Topping(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getDescripcion() {
        return helado.getDescripcion() + ", con Topping extra";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 20;
    }
}