package alessandro.angheben.u5w1d4;

import alessandro.angheben.u5w1d4.abstracts.Elements;
import alessandro.angheben.u5w1d4.entities.*;
import alessandro.angheben.u5w1d4.enums.OrderState;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication

public class U5w1d4Application {

	public static void main(String[] args) {
		SpringApplication.run(U5w1d4Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d4Application.class);

		//  System.out.println(ctx.getBean("getMenu"));

		//PRENDO I TAVOLI DAL BEANS CONFIG
//		Table tableOne = (Table) ctx.getBean("getTableOne");
//		Table tableTwo = (Table) ctx.getBean("getTableTwo");
//		Table tableThree = (Table) ctx.getBean("getTableThree");


		//PRENDO ELEMENTI CHE MI SERVONO PER INSERIRLI NEI VARI ORDINI

		// Drinks
//		Drinks wine = (Drinks) ctx.getBean("getWine");
//		Drinks water = (Drinks) ctx.getBean("getWater");
//		Drinks lemonade = (Drinks) ctx.getBean("getLemonade");
//
//		// Toppings
//		Toppings salami = (Toppings) ctx.getBean("getSalami");
//		Toppings pineapple = (Toppings) ctx.getBean("getPineapple");
//		Toppings onions = (Toppings) ctx.getBean("getOnions");
//		Toppings ham = (Toppings) ctx.getBean("getHam");
//		Toppings cheese = (Toppings) ctx.getBean("getCheese");
//		Toppings tomato = (Toppings) ctx.getBean("getTomato");
//
//		// Pizze
//		Pizza margherita = (Pizza) ctx.getBean("getMargherita");
//		Pizza hawaiianPizza = (Pizza) ctx.getBean("getHawaiianPizza");
//		Pizza salamiPizza = (Pizza) ctx.getBean("getSalamiPizza");


		// PREZZO COPERTO
//		Integer seatPrice = (Integer) ctx.getBean("getSeatPrice");
//
//
//		// CREO GLI ORDINI ++++++++++++++++++++++++++++++++++++++++++++++++++++
//
//		//PRIMO ORDINE
//		List<Elements> firstTable = new ArrayList<>(Arrays.asList(salamiPizza, margherita, water, wine, water));
//		Order orderOne = new Order(tableOne, firstTable, 1, OrderState.IN_PROGRESS, 2, seatPrice, "12:30");
//
//		System.out.println("");
//		System.out.println("IL PRIMO ORDINE !!!");
//		System.out.println(orderOne);
//
//		System.out.println("scontrino primo tavolo -> " + orderOne.getOrderPrice(orderOne));
//
//		//SECONDO ORDINE
//		List<Elements> secondTable = new ArrayList<>(Arrays.asList(hawaiianPizza, margherita, salamiPizza, water, water, lemonade, cheese));
//		Order orderTwo = new Order(tableTwo, secondTable, 2, OrderState.READY, 3, seatPrice, "14:10");
//
//		System.out.println("");
//		System.out.println("SECONDO ORDINE !!!");
//		System.out.println(orderTwo);
//
//		System.out.println("scontrino terzo tavolo -> " + orderTwo.getOrderPrice(orderTwo));
//
//		//TERZO ORDINE
//		List<Elements> thirdTable = new ArrayList<>(Arrays.asList(margherita, water, cheese));
//		Order orderThree = new Order(tableOne, thirdTable, 1, OrderState.IN_PROGRESS, 1, seatPrice, "12:35");
//
//		System.out.println("");
//		System.out.println("IL TERZO ORDINE !!!");
//		System.out.println(orderThree);
//
//		System.out.println("scontrino terzo tavolo -> " + orderThree.getOrderPrice(orderThree));
	}

}
