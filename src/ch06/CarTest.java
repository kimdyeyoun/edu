package ch06;

public class CarTest {
    public static void main(String[] args) {
        String car2 = new String("");
        Car car = new Car();
        Car car3 = new Car();
        car.brand = "현대";
        car.nm = "소나타";
        car.drive();
        car.stop();

        car3.brand = "기아";
        car3.nm = "K5";
        car3.drive();
        car3.stop();

    }
}
