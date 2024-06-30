class Engine {
    private String serialNumber;
    private Car car;

    public Engine(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}

class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        engine.setCar(this);
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}

public class CarEngine {
   public static void main(String[] args) {
       // Creating instances
       Engine engine = new Engine("ABC123");
       Car car = new Car("Toyota", engine);

       System.out.println(
               "Car Model: " + car.getModel() + ", Engine Serial Number: " + car.getEngine().getSerialNumber());

   } 
}
