
public class CoberturaGranola implements Helado {


    private Helado helado;


    public CoberturaGranola(Helado helado) {
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

