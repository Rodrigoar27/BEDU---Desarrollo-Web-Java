public class Application {

    public static void main(String [] args) throws Exception {
        Motor motor = new MotorElectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}