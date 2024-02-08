package alessandro.angheben.u5w1d4.abstracts;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Elements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String name;

    protected int calories;

    protected double price;

    public Elements(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}
