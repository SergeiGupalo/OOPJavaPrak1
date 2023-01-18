public class Main {
    public static void main(String args[]) {
        Server ser = new Server(10);
        for(int i = 0; i < ser.getLimitVehicle(); i++) {
            Vehicle veh;
            int ran = (int) (1 + Math.random() * 4);
            switch(ran){
                case 1: veh = new Car();
                    break;
                case 2: veh = new Bicycle();
                    break;
                case 3: veh = new RollerSkates();
                    break;
                case 4: veh = new Jumpers();
                    break;
                default:
                    veh = null;
                    break;
            }
            ser.addTransport(ran, veh);
        }
    }
}