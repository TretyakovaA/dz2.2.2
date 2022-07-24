public class ServiceStation implements Service {
    @Override
    public void check(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("model name " + car.getModelName() + " количество колес " +
                    car.getWheelsCount());
            car.checkEngine();
            for (int j = 0; j < car.getWheelsCount(); j++) {
                car.updateTyre();
            }
        }
    }
    @Override
    public void check(Bycicle[] bycicles) {
        for (int i = 0; i < bycicles.length; i++) {
            Bycicle bycicle = bycicles[i];
            System.out.println("model name " + bycicle.getModelName() + " количество колес " +
                    bycicle.getWheelsCount());

            for (int j = 0; j < bycicle.getWheelsCount(); j++) {
                bycicle.updateTyre();
            }
        }
    }
    @Override
    public void check(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            Truck truck = trucks[i];
            System.out.println("model name " + truck.getModelName() + " количество колес " +
                    truck.getWheelsCount());
            truck.checkEngine();
            truck.checkTrailer();
            for (int j = 0; j < truck.getWheelsCount(); j++) {
                truck.updateTyre();
            }
        }
    }
}
