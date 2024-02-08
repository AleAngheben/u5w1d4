package alessandro.angheben.u5w1d4;

import alessandro.angheben.u5w1d4.dao.ElementsService;
import alessandro.angheben.u5w1d4.entities.Drinks;
import alessandro.angheben.u5w1d4.entities.Menu;
import alessandro.angheben.u5w1d4.entities.Pizza;
import alessandro.angheben.u5w1d4.entities.Toppings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MenuRunner implements CommandLineRunner {



    @Autowired
    ElementsService elementsService;




    @Override
    public void run(String... args) throws Exception {
//        Menu menu = (Menu) ctx.getBean("getMenu");
//        System.out.println(menu);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d4Application.class);

        //Drinks
        Drinks wine = (Drinks) ctx.getBean("getWine");
        Drinks water = (Drinks) ctx.getBean("getWater");
        Drinks lemonade = (Drinks) ctx.getBean("getLemonade");

        // Toppings
        Toppings salami = (Toppings) ctx.getBean("getSalami");
        Toppings pineapple = (Toppings) ctx.getBean("getPineapple");
        Toppings onions = (Toppings) ctx.getBean("getOnions");
        Toppings ham = (Toppings) ctx.getBean("getHam");
        Toppings cheese = (Toppings) ctx.getBean("getCheese");
        Toppings tomato = (Toppings) ctx.getBean("getTomato");

        // Pizze
        Pizza margherita = (Pizza) ctx.getBean("getMargherita");
        Pizza hawaiianPizza = (Pizza) ctx.getBean("getHawaiianPizza");
        Pizza salamiPizza = (Pizza) ctx.getBean("getSalamiPizza");



        //salvo drinks
        elementsService.save(wine);
        elementsService.save(water);
        elementsService.save(lemonade);

        //salvo toppings
        elementsService.save(cheese);
        elementsService.save(onions);
        elementsService.save(ham);
        elementsService.save(pineapple);
        elementsService.save(salami);
        elementsService.save(tomato);

        //salvo pizze
        elementsService.save(margherita);
        elementsService.save(salamiPizza);
        elementsService.save(hawaiianPizza);


        ctx.close();
    }


}
