package ejerciciocrudtema5;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        Coche coche = new Coche();

        cocheCRUD.saveCar(coche);
        cocheCRUD.findCar("Ford");
        cocheCRUD.deleteCar();
    }
}
