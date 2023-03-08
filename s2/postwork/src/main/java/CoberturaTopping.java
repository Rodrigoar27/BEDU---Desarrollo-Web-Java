
public class CoberturaTopping implements Helado {


    private Helado helado;


    public CoberturaTopping(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getIngredientes() {
        return helado.getIngredientes() + " y topping adicional";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 20;
    }
}
