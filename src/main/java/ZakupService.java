import kategorie.model.Kategoria;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zakup.ZakupRepository;
import zakup.model.Zakup;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/zakupy")

public class ZakupService {

    @Autowired
    ZakupRepository zakupRepository;


    @GetMapping("")
    public List<Zakup> getAll() {
        return zakupRepository.getAll();
    }

    @GetMapping("/{id}")
    public Zakup getById(@PathVariable("id") int id) {
        return zakupRepository.getById(id);
    }

    @PostMapping("")
    public int add(@RequestBody List<Zakup> zakupy) {
        return zakupRepository.save(zakupy);
    }

    @PutMapping("/{id}")
    public int update(@PathVariable("id") int id, @RequestBody Zakup updateZakup) {
        Zakup zakup= zakupRepository.getById(id);
        if(zakup != null) {
            zakup.setIdZakup(updateZakup.getIdZakup());
            zakup.setIdUzytkownika(updateZakup.getIdUzytkownika());
            zakup.setKwota(updateZakup.getKwota());
            zakupRepository.update(zakup);
            return 200;
        } else {
            return 404;
        }
    }

    @PatchMapping("/{id}")
    public int partiallyUpdate(@PathVariable("id") int id, @RequestBody Zakup updateZakup) {
        Zakup zakup =zakupRepository.getById(id);

        if(zakup != null) {
            if (updateZakup.getIdZakup() >0) updateZakup.setIdZakup(updateZakup.getIdZakup());
            if (updateZakup.getIdUzytkownika() >0) updateZakup.setIdUzytkownika(updateZakup.getIdUzytkownika());
            if (updateZakup.getKwota() >0d); updateZakup.setKwota(updateZakup.getKwota());

            zakupRepository.update(zakup);
            return 200;
        } else {
            return 404;
        }
    }
    @DeleteMapping("/{id}")
    public int delete(@PathVariable("id") int id) {
        return zakupRepository.delete(id);
    }
}
