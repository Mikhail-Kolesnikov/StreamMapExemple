import java.util.List;
import java.util.Objects;

public class Courier {

    private String name;

    private List<Delivery> deliveries;

    private List<Delivery> notdeliveredList;

    public Courier(String name, List<Delivery> deliveries, List<Delivery> notdeliveredList) {
        this.name = name;
        this.deliveries = deliveries;
        this.notdeliveredList = notdeliveredList;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "name='" + name + '\'' +
                ", deliveries=" + deliveries +
                ", notdeliveredList=" + notdeliveredList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public List<Delivery> getNotdeliveredList() {
        return notdeliveredList;
    }

    public void setNotdeliveredList(List<Delivery> notdeliveredList) {
        this.notdeliveredList = notdeliveredList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courier courier = (Courier) o;
        return Objects.equals(name, courier.name) && Objects.equals(deliveries, courier.deliveries) && Objects.equals(notdeliveredList, courier.notdeliveredList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, deliveries, notdeliveredList);
    }
}
