import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int listNum;
        String carModel;
        String carMake;
        int carYear;
        double carPrice;

        ArrayList<Car> carList = new ArrayList<Car>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello! Welcome to the Grand Circus Motors admin console!");
        System.out.println();
        System.out.println("How many cars are you entering: ");
        listNum = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < listNum; i++) {

            System.out.println("Enter car #" + (i + 1) + " make: ");
            carMake = scan.nextLine();

            System.out.println("Enter car #" + (i + 1) + " model: ");
            carModel = scan.nextLine();

            System.out.println("Enter car #" + (i + 1) + " year: ");
            carYear = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter car #" + (i + 1) + " price: ");
            carPrice = scan.nextFloat();
            scan.nextLine();

            carList.add(new Car(carMake, carModel, carYear, carPrice));

        }

        System.out.println("Current Inventory: ");
        System.out.println();

        for (Car c: carList) {
            System.out.println(c);
        }

    }

}
