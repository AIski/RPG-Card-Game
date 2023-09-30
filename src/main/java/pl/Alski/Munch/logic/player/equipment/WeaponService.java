package pl.Alski.Munch.logic.player.equipment;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.player.equipment.item.slots.OneHandedWeapon;
import pl.Alski.Munch.logic.player.equipment.item.slots.TwoHandedWeapon;

@Service
public interface WeaponService {
    void equipWeapon(OneHandedWeapon oneHandedWeapon);
    void unEquipWeapon(OneHandedWeapon oneHandedWeapon);
    void equipWeapon(TwoHandedWeapon twoHandedWeapon);
    void unEquipWeapon(TwoHandedWeapon twoHandedWeapon);
}
