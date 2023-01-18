package part2;

public abstract class Tractor extends Machine{
    String type;

    public Tractor(String name, int maxSpeed, int weight, int passangers, String type) {
        super(name, maxSpeed, weight, passangers);
        this.type = type;
    }

    public void manegePassangers(){
        System.out.println("Tractor have: " + passangers + "passangers onboard.");
    }
}
