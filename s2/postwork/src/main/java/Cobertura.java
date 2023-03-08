public class Cobertura implements Helado {

    private Helado helado;

    public Cobertura(Helado helado) {
        this.helado = helado;
    }


    @Override
    public String String getIngredientes() {
        return helado.getIngredientes() + ", con Cobertura extra";
    }


    @Override
    public int getPrecio() {
        return helado.getPrecio() + 20;
    }
}



