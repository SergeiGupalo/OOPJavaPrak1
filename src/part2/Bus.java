package part2;

public class Bus extends Machine{
    private int passengers;
    public Bus(String name, int weight, int maxSpeed, int passengers) {
        super(name, weight, maxSpeed, passengers);
    }
    void manegePassangers() {
        System.out.println("Bus have: " + passengers + " passengers on board.");
    }
}
