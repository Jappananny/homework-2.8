package TransportPack;
import Draiver.AllDriver;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<AllDriver<?>> driver = new HashSet<>();
    private final Set<Sponsor> sponsor = new HashSet<>();
    private final Set<Transport> allTransportCar = new HashSet<>();
    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
    public abstract void startDriving();
    public abstract void endDriving();

    public void addDriver(AllDriver<?>... drivers) {
        this.driver.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>...mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor...sponsors) {
        this.sponsor.addAll(Arrays.asList(sponsors));
    }
    public void addTransport(Transport...allTransportCar) {
        this.allTransportCar.addAll(Arrays.asList(allTransportCar));
    }
    public abstract void allInfoTransport();
    public abstract boolean diagnistic();


    public abstract void repair();
}
