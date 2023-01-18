public class Server {
    //Кількість транспортних засобів (ТЗ)кожного виду,що виїхали в місто
    private int[] countVehicles;
    //Загальна кількість ТЗ, що виїхали в місто
    private int commonCountVehicles;
    //обмеження на кількість ТЗ, що одночасно виїхали в місто
    private int limitVehicle;
    //масив, що зберігає ТЗ будь-якого виду
    private Vehicle[] vehicles;

    //Конструктор класу, параметр size - кількість видів ТЗ
    public Server (int size) {
        countVehicles = new int[size];
        limitVehicle = size;
        vehicles = new Vehicle[limitVehicle];
    }

    //повертає обмеження на кількість ТЗ, що одночасно виїхали в місто
    public int getLimitVehicle(){
        return limitVehicle;
    }

    //повертає загальну кількість ТЗ, що виїхали в місто
    public int getCurrentCountVehicle(){
        return commonCountVehicles;
    }

    //додає ТЗ до віртуальної бази
    public void addTransport(int numberVehicles, Vehicle vehicle){
        System.out.println("Vehicle № = " + getCurrentCountVehicle());
        countVehicles[numberVehicles]++;
        commonCountVehicles ++;
        vehicles [numberVehicles] = vehicle;
        vehicle.move(countVehicles[numberVehicles]);
    }
}