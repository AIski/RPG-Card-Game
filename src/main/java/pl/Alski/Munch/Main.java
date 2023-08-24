package pl.Alski.Munch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.Alski.Munch.cards.service.CardGetAllTreasureCardsService;
import pl.Alski.Munch.cards.service.CardSaveService;
import pl.Alski.Munch.items.bonus.Bonus;
import pl.Alski.Munch.items.bonus.SimpleBonus;
import pl.Alski.Munch.items.factory.TwoHandedWeaponFactory;
import pl.Alski.Munch.items.slots.TwoHandedWeapon;

@EnableAutoConfiguration
@SpringBootApplication
public class Main {
    private final static Logger logger = LoggerFactory.getLogger(Main.class);
    public Main() {
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        CardSaveService cardSaveService = applicationContext.getBean(CardSaveService.class);
        CardGetAllTreasureCardsService cardGetAllTreasureCardsService =
                applicationContext.getBean(CardGetAllTreasureCardsService.class);

     TwoHandedWeaponFactory factory = new TwoHandedWeaponFactory();

        logger.info("Creating new Item in our factory");

        Bonus bonus = new SimpleBonus(3);
        TwoHandedWeapon tempCard = factory.createItem(
                "Dość Duży kamyczek",
                bonus,
                0,
                null,
                null,
                true
        );
        cardSaveService.saveCard(tempCard);

    }
}
