
public class Mermelada implements Helado {


    private Helado helado;


    public Mermelada(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getDescripcion() {
        return helado.getDescripcion() + ", con Mermelada extra";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 10;
    }
}

