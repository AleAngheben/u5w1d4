package alessandro.angheben.u5w1d4.entities;

import alessandro.angheben.u5w1d4.abstracts.Elements;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity

public class Drinks extends Elements {

    private double quantity;

    public Drinks(String name, int calories, double price, double quantity) {
        super(name, calories, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Drinks{" +

                " name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", quantity=" + quantity +
                "} \n";
    }
}
