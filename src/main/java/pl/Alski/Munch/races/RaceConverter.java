package pl.Alski.Munch.races;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import pl.Alski.Munch.classes.CharacterClass;
import pl.Alski.Munch.classes.NoClass;

@Converter
public class RaceConverter implements AttributeConverter<Race, String> {
    @Override
    public String convertToDatabaseColumn(Race race) {
        return race.getRaceName();
    }

    @Override
    public Race convertToEntityAttribute(String race) {
        //TODO: THIS
       return new Human();
    }
}
