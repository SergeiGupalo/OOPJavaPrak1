public class Formula {
    private float x, y, z;
    private float t;
    public void set(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getT(){
        return t;
    }
    void run(){
        t = (float) ((( 2 * (Math.cos(x - 3.14 / 6))) / (0.5 + ((Math.sin(y) * Math.sin(y))))) * (1 + (Math.pow(z, 2) / (3 - ((Math.pow(z, 2)) / 5)))));
    }
    void print(){
        System.out.println("For x = " + x + " y = " + y + " z = " + z + " t() = " + t);
    }
}
