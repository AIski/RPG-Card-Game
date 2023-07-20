package pl.Alski.Munch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.cards.service.CardSaveService;
import pl.Alski.Munch.conditions.requirements.*;
import pl.Alski.Munch.items.Item;
import pl.Alski.Munch.items.factory.ArmourFactory;
import pl.Alski.Munch.items.factory.BootsFactory;
import pl.Alski.Munch.items.factory.HelmetFactory;
import pl.Alski.Munch.items.factory.OneHandedWeaponFactory;
import pl.Alski.Munch.items.modifiers.Modifier;
import pl.Alski.Munch.items.modifiers.ModifierAndModifier;
import pl.Alski.Munch.items.modifiers.curse.CurseReflectOpenTheDoorCurses;
import pl.Alski.Munch.items.modifiers.escape.EscapeBonusModifier;
import pl.Alski.Munch.items.modifiers.escape.EscapeModifier;
import pl.Alski.Munch.items.modifiers.loot.LootExtraItemOnEscapeModifier;
import pl.Alski.Munch.items.slots.Armour;
import pl.Alski.Munch.items.slots.Boots;
import pl.Alski.Munch.items.slots.Helmet;
import pl.Alski.Munch.items.slots.OneHandedWeapon;
import pl.Alski.Munch.player.Sex;
import pl.Alski.Munch.races.Race;

@EnableAutoConfiguration
@SpringBootApplication
public class Main {
    private final static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        CardSaveService cardSaveService= applicationContext.getBean(CardSaveService.class);

        OneHandedWeaponFactory oneHandedWeaponFactory = new OneHandedWeaponFactory();

        logger.info("Creating new OneHandedWeapon in our OneHandedWeaponFactory");
//        Requirement requirement = new MustBeClassRequirement("Cleric");
        Requirement requirement = new MustBeRaceRequirement(Race.DWARF);
//        Requirement requirement = new SexRequirement(Sex.MALE);
//        Modifier modifier = new CurseReflectOpenTheDoorCurses();
//        Modifier doubleModifier = new ModifierAndModifier(
//                new EscapeBonusModifier(3),
//                new LootExtraItemOnEscapeModifier(1)
//                );
        OneHandedWeapon tempCard = oneHandedWeaponFactory.createItem(
                "Młoteczek Ortopedyczny",
                4,
                600,
                requirement,
                null,
                false
        );
        logger.info(((Item) tempCard).getName() + ", with bonus of " + tempCard.getBonus() + " was created in BootsFactory!");
        cardSaveService.saveCard((TreasureCard) tempCard);
        logger.info(((Item) tempCard).getName() + " was saved to database with id: "+tempCard.getId());

    }
}
