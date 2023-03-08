
public class Mermelada implements Helado {


    private Helado helado;


    public Mermelada(Helado helado) {
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

