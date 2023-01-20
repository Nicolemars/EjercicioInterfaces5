package ejerciciocrudtema5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    List<Coche> listaCoches = new ArrayList<>();

    //LOS SIGUIENTES MÉTODOS SON SOLO PLANTILLAS, NO CUMPLEN UNA FUNCIÓN ÚTIL
    @Override
    public void saveCar(Coche coche) {
        //listaCoches.add(coche);
        System.out.println("Estás en el método saveCar");
    }

    @Override
    public Coche findCar(String nameCar) {
        System.out.println("Estás en el método findCar");
        return null;
    }

    @Override
    public void deleteCar() {
        System.out.println("Estás en el método deleteCar");

    }
}
