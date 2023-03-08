public class Cobertura implements Helado {


    private Helado helado;


    public Cobertura(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getDescripcion() {
        return helado.getDescripcion() + ", con Cobertura extra";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 20;
    }
}



