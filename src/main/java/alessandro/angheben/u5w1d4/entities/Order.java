package alessandro.angheben.u5w1d4.entities;

import alessandro.angheben.u5w1d4.abstracts.Elements;
import alessandro.angheben.u5w1d4.enums.OrderState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

public class Order {
    private Table tableNum;
    private List<Elements> elementsList;
    private int orderNum;
    private OrderState orderState;
    private int seats;
    private int seatsPrice;
    private String orderTime;

    public Order(Table tableNum, List<Elements> elementsList, int orderNum, OrderState orderState, int seats, int seatsPrice, String orderTime) {
        this.tableNum = tableNum;
        this.elementsList = elementsList;
        this.orderNum = orderNum;
        this.orderState = orderState;
        this.seats = seats;
        this.seatsPrice = seatsPrice;
        this.orderTime = orderTime;

        tableNum.setOccupied(true);
    }

    public double getOrderPrice(Order order) {
        double priceSeats = this.seatsPrice * this.seats;

        double orderListPrice = this.elementsList.stream().mapToDouble(Elements::getPrice).reduce(0.0, Double::sum);

        return priceSeats + orderListPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "tableNum=" + tableNum +
                "\n elementsList=" + elementsList +
                "\n orderNum=" + orderNum +
                "\n orderState=" + orderState +
                "\n seats=" + seats +
                "\n seatsPrice=" + seatsPrice +
                "\n orderTime='" + orderTime + '\'' +
                '}';
    }
}

