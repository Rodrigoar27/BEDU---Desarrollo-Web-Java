
public class Heladeria {

//En esta clase simularemos un ticket de compra.
    public static void main(String [] args) {
        Helado helado = new HeladoBase();

        helado = new Cobertura(helado);
        helado = new CoberturaGranola(helado);
        helado = new CoberturaMermelada(helado);
        helado = new CoberturaGalleta(helado);
        helado = new CoberturaTopping(helado);

//Enviamos a consola el ticket de compra del usuario, empleando los dos métodos definidos al inicio. 
        System.out.println("Gracias por comprar en nuestra heladeria");
        System.out.println("A continuacion se desglosa su pedido y el precio total:");
        System.out.println(helado.getIngredientes());
        System.out.println("Precio: $" + helado.getPrecio());
    }
}
