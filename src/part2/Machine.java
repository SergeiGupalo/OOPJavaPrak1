package part2;

public abstract class Machine implements Run {
    static String name;
    int maxSpeed;
    int weight;
    int passangers;

    public Machine(String name, int maxSpeed, int weight, int passangers) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.passangers = passangers;
    }

    public String getName(){
        return name;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public int getWeight(){
        return weight;
    }

    abstract void manegePassangers();

    public static void move(int id){
        System.out.println("Machine " + name + " " + id + " moves.");
    }
}
