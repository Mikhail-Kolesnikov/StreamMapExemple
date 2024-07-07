import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TaskThird {

    public static void main(String[] args) {
        //узнать общий вес посылок у всех курьеров

        Delivery delivery1 = new Delivery(45.3);
        Delivery delivery2 = new Delivery(5.3);
        Delivery delivery3 = new Delivery(12.3);
        Delivery delivery4 = new Delivery(4.3);
        Delivery delivery5 = new Delivery(10.3);
        Delivery delivery6 = new Delivery(9.3);
        Delivery delivery7 = new Delivery(88.3);


        Courier courier = new Courier("Даниил", List.of(delivery1, delivery2), List.of(delivery3));
        Courier secondCourier = new Courier("Иван", List.of(delivery4), List.of(delivery5, delivery6, delivery7));

        List<Courier> couriers = new ArrayList<>();
        couriers.add(courier);
        couriers.add(secondCourier);

        Optional<Double> optional = couriers.stream()
                .filter(c -> c.getDeliveries() != null)
                .flatMap(c -> Stream.of(c.getDeliveries(), c.getNotdeliveredList()))
                        .flatMap(c -> c.stream())
                        .filter(delivery -> delivery != null)
                        .map(delivery -> delivery.getWeight())
                        .reduce((x, y) -> x + y);

        Double result = optional.orElse(0.0);

        System.out.println(result);
        System.out.println();


    }

}
