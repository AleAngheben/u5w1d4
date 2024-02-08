package alessandro.angheben.u5w1d4.entities;

import alessandro.angheben.u5w1d4.abstracts.Elements;
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
@NoArgsConstructor
@Entity
public class Pizza extends Elements {

@ManyToMany
@JoinTable(
        name = "pizza_toppings",
        joinColumns = { @JoinColumn(name = "pizza_id")},
        inverseJoinColumns = {@JoinColumn(name = "topping_id")}
)
    private List<Toppings> ingredients;

    public Pizza(String name, int calories, double price, List<Toppings> ingredients) {
        super(name, calories, price);
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", calories=" + calories +
                ", price=" + price +
                "} \n";
    }
}
