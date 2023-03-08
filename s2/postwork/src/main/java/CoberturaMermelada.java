
public class CoberturaMermelada implements Helado {


    private Helado helado;


    public CoberturaMermelada(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getIngredientes() {
        return helado.getIngredientes() + ", mermelada";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 10;
    }
}

