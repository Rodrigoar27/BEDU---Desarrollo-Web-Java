
public class Galleta implements Helado {


    private Helado helado;


    public Galleta(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getIngredientes() {
        return helado.getIngredientes() + ", galleta";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 15;
    }
}