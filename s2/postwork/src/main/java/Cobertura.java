public class Cobertura implements Helado {

    private Helado helado;

    public Cobertura(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String getIngredientes() {
        return helado.getIngredientes() + ", incluye las siguientes coberturas: ";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 20;
    }
}



