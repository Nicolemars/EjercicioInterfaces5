package ejerciciocrudtema5;

public interface CocheCRUD {

    void saveCar(Coche coche);
    Coche findCar(String carName);
    void deleteCar();

}
