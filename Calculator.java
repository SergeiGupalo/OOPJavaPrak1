public class Calculator {
    private int size;
    private float xstep, ystep, zstep;
    private float xstar, ystar, zstar;
    private float[] arr;

    public Calculator(int size, float xstep, float ystep, float zstep){
        this.size = size;
        this.xstep = xstep;
        this.ystep = ystep;
        this.zstep = zstep;
        this.arr = new float[size];
    }
    Formula t = new Formula();

    public void set(float a, float b, float c){
        xstar = a;
        ystar = b;
        zstar = c;
    }

    void calculate(){
        for(int i = 0; i < arr.length; i++){
            t.set(xstar, ystar, zstar);
            t.run();
            arr[i] = t.getT();
            t.print();
            xstar += xstep;
            ystar += ystep;
            zstar += zstep;
        }
    }

    void print(){
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + " T(x,y,z) = " + arr[i]);
        }
    }
}
