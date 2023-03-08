public class MotorElectricoAdapter extends Motor{
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(){
        super();
        this.motorElectrico = new MotorElectrico();
        System.out.println("Creando un adaptador de motor electrico...");
    }
@Override
    public void encender(){
    System.out.println("Encendiendo el motor");
    this.motorElectrico.conectar();
    this.motorElectrico.activar();

    }

    @Override
    public void acelerar(){
        System.out.println("Acelerando el motor");
        this.motorElectrico.activar();
        this.motorElectrico.moverMasRapido();

    }

    @Override
    public void apagar() {
        System.out.println("Apagando el motor");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
    }
