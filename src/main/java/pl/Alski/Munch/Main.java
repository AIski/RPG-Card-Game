package pl.Alski.Munch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.cards.service.CardGetAllTreasureCardsService;
import pl.Alski.Munch.cards.service.CardSaveService;
import pl.Alski.Munch.classes.Class;
import pl.Alski.Munch.conditions.requirements.MustBeClassRequirement;
import pl.Alski.Munch.conditions.requirements.MustBeRaceRequirement;
import pl.Alski.Munch.conditions.requirements.RaceRequirement;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.Item;
import pl.Alski.Munch.items.bonus.Bonus;
import pl.Alski.Munch.items.bonus.SimpleBonus;
import pl.Alski.Munch.items.factory.OtherItemFactory;
import pl.Alski.Munch.items.slots.Other;
import pl.Alski.Munch.races.Race;

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

//        OneHandedWeaponFactory oneHandedWeaponFactory = new OneHandedWeaponFactory();
        OtherItemFactory factory = new OtherItemFactory();

        logger.info("Creating new Item in our factory");
//        Requirement requirement = new MustBeClassRequirement(Class.WIZARD);
//        Requirement requirement = new MustBeRaceRequirement(Race.DWARF);
//        Requirement requirement = new SexRequirement(Sex.MALE);
//        Modifier modifier = new CurseReflectOpenTheDoorCurses();
//        Modifier doubleModifier = new ModifierAndModifier(    logger.info(((Item) tempCard).getName() + " Item saved to database with id: " + tempCard.getId());
////        logger.info("Displaying all Treasure Cards...");
////        cardGetAllTreasureCardsService.getAll().stream()
////                .forEach(a ->
////                        logger.info((a.getName() + a.getId()))
////                );
//                new EscapeBonusModifier(3),
//                new LootExtraItemOnEscapeModifier(1)
//                );
        Requirement requirement = new MustBeClassRequirement(Class.THIEF);
//        Bonus bonus = new ConditionedBonus(1, 3 , requirement);
        Bonus bonus = new SimpleBonus(4);
        Other tempCard = factory.createItem(
                "Peleryna Cienia",
                bonus,
                600,
                requirement,
                null,
                false
        );
        cardSaveService.saveCard(tempCard);
//
    }
}
