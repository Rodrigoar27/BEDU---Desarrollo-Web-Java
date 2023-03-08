
public class Granola implements Helado {


    private Helado helado;


    public Granola(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getIngredientes() {
        return helado.getIngredientes() + "Granola";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 10;
    }
}

