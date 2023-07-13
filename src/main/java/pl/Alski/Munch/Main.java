package pl.Alski.Munch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import pl.Alski.Munch.DAO.TreasureCardRepository;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.cards.service.CardSaveService;
import pl.Alski.Munch.items.Item;
import pl.Alski.Munch.items.factory.ArmourFactory;
import pl.Alski.Munch.items.slots.Armour;
import pl.Alski.Munch.tour.TourServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication
public class Main {
    private final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        CardSaveService cardSaveService= applicationContext.getBean(CardSaveService.class);

        ArmourFactory armourFactory = new ArmourFactory();

        logger.info("Creating new Armour in our ArmourFactory");
        Armour tempCard = armourFactory.createItem(
                "Zbroja Grillowa",
                2,
                400,
                null,
                null,
                false
        );
        logger.info(tempCard.getName() + ", with bonus of " + tempCard.getBonus() + " was created in ArmourFactory! ");

        cardSaveService.saveCard((TreasureCard) tempCard);
        logger.info(tempCard.getName() + "was saved to database with id: "+tempCard.getId());

    }
}
