public class Main {
    public static void main(String[] args) {
        Car [] cars = {
            new Car("Car1",4),
                new Car("Car2", 4)
        };
        Truck [] trucks ={
                new Truck("truck1", 6),
                new Truck("truck2",8)
        };
        Bycicle []bycicles ={
                new Bycicle("bicycle1",2),
                new Bycicle("bicycle2", 2)
        };
        ServiceStation serviceStation = new ServiceStation();
        report(serviceStation,cars,trucks,bycicles);
    }
    private static void report (ServiceStation serviceStation, Car [] cars, Truck [] trucks, Bycicle [] bycicles){
        serviceStation.check(cars);
        serviceStation.check(bycicles);
        serviceStation.check(trucks);
    }
}