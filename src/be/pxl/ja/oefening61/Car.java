package be.pxl.ja.oefening61;

public class Car {
    public Engine engine;
    public String fuel;

    public Car(String fuel){
        this.fuel = fuel;
        engine = new Engine();
    }


    public void start(){
        engine.start(String.format("Motor has been started. Fuel: %s%n", fuel));
    }
    public static class Engine {
        public void start(String str){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Car car = new Car("petrol");
        car.start();

    }
}


