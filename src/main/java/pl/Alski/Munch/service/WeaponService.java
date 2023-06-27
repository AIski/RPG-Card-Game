package pl.Alski.Munch.service;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.items.slots.OneHandedWeapon;
import pl.Alski.Munch.items.slots.TwoHandedWeapon;

@Service
public interface WeaponService {
    void equipWeapon(OneHandedWeapon oneHandedWeapon);
    void unEquipWeapon(OneHandedWeapon oneHandedWeapon);
    void equipWeapon(TwoHandedWeapon twoHandedWeapon);
    void unEquipWeapon(TwoHandedWeapon twoHandedWeapon);
}
