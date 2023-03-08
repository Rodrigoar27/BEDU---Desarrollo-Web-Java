
public class Heladeria {


    public static void main(String [] args) {
        Helado suave = new HeladoSuave();


        suave = new Cobertura(suave);
        suave = new Granola(suave);
        suave = new Topping(suave);
        suave = new Mermelada(suave);
        suave = new Galleta(suave);


        System.out.println("[Ticket de compra]");
        System.out.println(suave.getDescripcion());
        System.out.println("$" + suave.getPrecio());
    }
}
