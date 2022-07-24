public class Truck extends Car{
    public Truck (String modelName, int wheelCount){
        super(modelName, wheelCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
