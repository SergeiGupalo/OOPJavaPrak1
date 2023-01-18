package part2;

public class Main {
    public static void main(String args[]) {
        Server ser = new Server(10);
        for (int i = 0; i < ser.getLimitVehicle(); i++) {
            Machine veh;
            int ran = (int) (1 + Math.random() * 3);
            switch(ran){
                case 1: veh = new TractorWheeled("Tractor red", 80, 150, 2, "wheeled"); break;
                case 2: veh = new TractorCrawler("Tractor blue", 75, 120, 2, "crawled"); break;
                case 3: veh = new Bus("Bus black ", 150, 120, 18);
                default:
                    veh = null; break;
            }
            ser.addTransport(ran, veh);
        }
    }
}