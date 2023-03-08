
public class Heladeria {


    public static void main(String [] args) {
        Helado helado = new HeladoBase();


        helado = new Cobertura(helado);
        helado = new Granola(helado);
        helado = new Mermelada(helado);
        helado = new Galleta(helado);
        helado = new Topping(helado);


        System.out.println("Gracias por comprar en nuestra heladeria");
        System.out.println("A continuacion se desglosa su pedido y el precio total:");
        System.out.println(helado.getIngredientes());
        System.out.println("Precio: $" + helado.getPrecio());
    }
}
