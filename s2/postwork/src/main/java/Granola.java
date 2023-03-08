
public class Granola implements Helado {


    private Helado helado;


    public Granola(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getDescripcion() {
        return helado.getDescripcion() + ", con Granola extra";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 10;
    }
}

