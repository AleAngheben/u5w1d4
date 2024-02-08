package alessandro.angheben.u5w1d4.entities;

import alessandro.angheben.u5w1d4.abstracts.Elements;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Toppings extends Elements {

    @ManyToMany
    @JoinTable(
            name = "pizza_toppings",
            joinColumns = { @JoinColumn(name = "topping_id")},
            inverseJoinColumns = {@JoinColumn(name = "pizza_id")}
    )
    private List<Pizza> pizzasList;

    public Toppings(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                "} \n" ;
    }
}
