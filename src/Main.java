import Draiver.DriverLicensesB;
import TransportPack.*;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class Main {
    private static Random RANDOM = new Random();

    public static void main(String[] args) throws ProductException {

        Product bamamas = new Product("Банан",89.90,0.5);
        System.out.println(bamamas);
        Product nail = new Product("Деревянные гвозди", 820,3.0);
        System.out.println(nail);
        Product rice = new Product("Рис",119.99,10.5);
        System.out.println(rice);
        Product sand = new Product("Песок строительный",6, 4500.0);
        System.out.println(sand);
        Set<Product> productS = new HashSet<>();
        productS.add(bamamas);
        productS.add(nail);
        System.out.println("======================================================");
        productS.toString();
        productS.remove(bamamas);
        productS.toString();
        RecipesService trade = new RecipesService();
        Product mayonese = new Product("Майонез",96.50,1.0 );
        productS.add(mayonese);
        Recipes fireNeil = new Recipes("Жаренные гвозди",48.99,productS);
        trade.add(fireNeil);
        System.out.println(trade);
        //Задача № 3
        Set<Integer> number = new HashSet<>();
        Set<Integer> numberRemuve = new HashSet<>();
        for (int i=1; i <=20;i++){
            number.add(RANDOM.nextInt(1001));
        }
        for (Integer number1: number) {
            if (!(number1 % 2 == 0)){
                numberRemuve.add(number1);
            } else {
                System.out.print(number1+" ");
            }
        }
        for (Integer number1: numberRemuve) {
            number.remove(number1);
        }
        System.out.println("======================================================");
        //Вводные данные 1
        Car lada = new Car("Lada", "Vesta", 2.0, TypeOfBody.SEDAN);
        Car kia = new Car("KIA", "Cerato", 2.5, TypeOfBody.COUPE);
        Car skoda = new Car("Skoda", "Octavia", 3.0, TypeOfBody.CROSSOVER);
        Car audi = new Car("Audi", "A3", 3.0, TypeOfBody.JEEP);
        Bus man = new Bus("MAN", "Lion’s Coach", 5.0, CapacityPeople.SMALL);
        Bus gaz = new Bus("GAZ", "Вектор Next", 3.3, CapacityPeople.ESPECIALLY_SMALL);
        Bus maz = new Bus("MAZ", "232", 3.5, CapacityPeople.ESPECIALLY_BIG);
        Bus setra = new Bus("Setra", "Provate", 3.8, CapacityPeople.AVERAGE);
        Truck iveco = new Truck("Iveco", "MP 260E38 6x6", 12.0, LoadCapacity.N3);
        Truck mon = new Truck("MON", "41.410 8x4", 10.0, LoadCapacity.N2);
        Truck volvo = new Truck("VOLVO", "FMX-500-10X4", 13.0, LoadCapacity.N3);
        Truck mercedes = new Truck("Mercedes-Benz", "Atego 815", 4.2, LoadCapacity.N1);
        //Вводные данные 2
        Mechanic<Car> sanich = new Mechanic<>("Саныч","Вологда",
                "Охраник ГСК № 20");
        Mechanic<Truck> vasja = new Mechanic<>("Вася","Краматорск",
                "'ООО' Синяя изолента ");
        Sponsor azino777 = new Sponsor("Азино три топора",777777777);
        //Вывод результата
        System.out.println("===============================================================================");
        lada.info();
        man.info();
        iveco.info();
        System.out.println("===============================================================================");
        gaz.info();
        gaz.allInfoTransport();
        System.out.println("===============================================================================");
        List<Transport> allTransportCar = List.of(lada,kia,skoda);
        lada.addDriver(new DriverLicensesB("Евпатий Коловрат",
                "выданные боженькой", 13, lada));
        lada.addMechanic(new Mechanic<>("Петрович", "с соседнего гаража", "ГСК № 20"));
        lada.addSponsor(azino777);
        for (Transport allTransportCars : allTransportCar){
            info(allTransportCars);
        }
        ServiseStation serviceStation = new ServiseStation();
        serviceStation.addTransportQueue(lada);
        serviceStation.service();
        System.out.println("===============================================================================");
        System.out.println("======================================================");








    }
    private static void info(Transport allTransportCar){
        System.out.println("Автомобиль " + allTransportCar.getBrand() + ", с водителем " + allTransportCar.getDriver()
                + ", \nс мешаником " + allTransportCar.getMechanics() + " \nи спонсором " +allTransportCar.getSponsor() + ".");
    }
}