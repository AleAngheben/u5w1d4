package alessandro.angheben.u5w1d4;

import alessandro.angheben.u5w1d4.entities.*;
import alessandro.angheben.u5w1d4.entities.Menu;
import alessandro.angheben.u5w1d4.entities.Pizza;
import alessandro.angheben.u5w1d4.entities.Table;
import alessandro.angheben.u5w1d4.entities.Toppings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeansConfiguration {


    //drinks
    @Bean
    alessandro.angheben.u5w1d4.entities.Drinks getWine() {
        return new alessandro.angheben.u5w1d4.entities.Drinks("Wine", 607, 7.49, 0.75);
    }

    @Bean
    alessandro.angheben.u5w1d4.entities.Drinks getWater() {
        return new alessandro.angheben.u5w1d4.entities.Drinks("Water", 0, 1.29, 0.5);
    }

    @Bean
    alessandro.angheben.u5w1d4.entities.Drinks getLemonade() {
        return new alessandro.angheben.u5w1d4.entities.Drinks("Lemonade", 128, 1.29, 0.33);
    }

    //topping

    @Bean
    Toppings getSalami() {
        return new Toppings("Salami", 92, 0.69);
    }

    @Bean
    Toppings getPineapple() {
        return new Toppings("Pineapple", 24, 0.99);
    }

    @Bean
    Toppings getOnions() {
        return new Toppings("Onions", 22, 0.69);
    }

    @Bean
    Toppings getHam() {
        return new Toppings("Ham", 35, 0.99);
    }

    @Bean
    Toppings getCheese() {
        return new Toppings("Cheese", 92, 0.69);
    }

    @Bean
    Toppings getTomato() {
        return new Toppings("Tomato", 10, 1);
    }

    //pizze
    @Bean
    Pizza getMargherita() {
        return new Pizza("Margherita", 1104, 4.99, new ArrayList<>(Arrays.asList(getTomato(), getCheese())));
    }

    @Bean
    Pizza getHawaiianPizza() {
        return new Pizza("Hawaiian Pizza", 1024, 6.49, new ArrayList<>(Arrays.asList(getTomato(), getCheese(), getHam(), getPineapple())));
    }

    @Bean
    Pizza getSalamiPizza() {
        return new Pizza("Salami Pizza", 1160, 5.99, new ArrayList<>(Arrays.asList(getTomato(), getCheese(), getSalami())));
    }

    @Bean
    Menu getMenu() {
        List<Pizza> pizzaList = new ArrayList<>(Arrays.asList(getMargherita(), getHawaiianPizza(), getSalamiPizza()));
        List<Toppings> toppingsList = new ArrayList<>(Arrays.asList(getSalami(), getPineapple(), getOnions(), getHam(), getCheese()));
        List<Drinks> drinksList = new ArrayList<>(Arrays.asList(getWine(), getWater(), getLemonade()));

        return new Menu(pizzaList, drinksList, toppingsList);
    }

    //TABLES

    @Bean
    Table getTableOne() {
        return new Table(1, 5, false);
    }

    @Bean
    Table getTableTwo() {
        return new Table(2, 6, false);
    }

    @Bean
    Table getTableThree() {
        return new Table(3, 10, false);
    }

//PREZZO DEL COPERTO

    @Bean
    Integer getSeatPrice(@Value("${order.seatPrice}") int seatPrice) {
        return seatPrice;
    }

}

