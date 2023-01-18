public class Car extends Vehicle{

    @Override
    public void move(int id) {
        System.out.println("Car " + id + " moved.");
    }
}