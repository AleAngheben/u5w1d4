package alessandro.angheben.u5w1d4.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Table {

    private int tableNumber;

    private int maxGuests;

    private boolean isOccupied;

    @Override
    public String toString() {
        return "Tavolo numero " + tableNumber;
    }
}

