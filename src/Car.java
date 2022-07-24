public class Car extends Transport{
    public Car (String modelName, int wheelCount){
        super(modelName, wheelCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
