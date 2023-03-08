
public class Mermelada implements Helado {


    private Helado helado;


    public Mermelada(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getIngredientes() {
        return helado.getIngredientes() + ", con Mermelada extra";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 10;
    }
}

