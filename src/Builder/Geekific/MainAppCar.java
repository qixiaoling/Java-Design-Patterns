package Builder.Geekific;

public class MainAppCar {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.id(2122)
                .brand("bmw")
                .model("2-serie");

        Car car = carBuilder.build();

        System.out.println(car.toString());
    }
}
