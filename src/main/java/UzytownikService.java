import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uzytkownik.UzytkownikRepository;
import uzytkownik.model.Uzytkownik;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/uzytkownicy")

public class UzytownikService {

    @Autowired
    UzytkownikRepository uzytkownikRepository;


    @GetMapping("")
    public List<Uzytkownik> getAll() {
        return uzytkownikRepository.getAll();
    }

    @GetMapping("/{id}")
    public Uzytkownik getById(@PathVariable("id") int id) {
        return uzytkownikRepository.getById(id);
    }

    @PostMapping("")
    public int add(@RequestBody List<Uzytkownik> uzytkownicy) {
        return uzytkownikRepository.save(uzytkownicy);
    }

    @PutMapping("/{id}")
    public int update(@PathVariable("id") int id, @RequestBody Uzytkownik updateUzytkownik) {
        Uzytkownik uzytkownik = uzytkownikRepository.getById(id);
        if(uzytkownik != null) {
            uzytkownik.setIdUzytkownik(updateUzytkownik.getIdUzytkownik());
            uzytkownik.setLogin(updateUzytkownik.getLogin());
            uzytkownik.setHasło(updateUzytkownik.getHasło());
            uzytkownik.setNazwaKonta(updateUzytkownik.getNazwaKonta());
            uzytkownik.setDataZałożeniaKonta(updateUzytkownik.getDataZałożeniaKonta());
            uzytkownik.setWojewództwo(updateUzytkownik.getWojewództwo());
            uzytkownik.setMiasto(updateUzytkownik.getMiasto());
            uzytkownik.setAdres(uzytkownik.getAdres());
            uzytkownik.setStatusKonta(updateUzytkownik.getStatusKonta());

            uzytkownikRepository.update(uzytkownik);
            return 200;
        } else {
            return 404;
        }
    }

    @PatchMapping("/{id}")
    public int partiallyUpdate(@PathVariable("id") int id, @RequestBody Uzytkownik updateUzytkownik) {
        Uzytkownik uzytkownik = uzytkownikRepository.getById(id);

        if(uzytkownik != null) {
            if (updateUzytkownik.getIdUzytkownik() >0) uzytkownik.setIdUzytkownik(updateUzytkownik.getIdUzytkownik());
            if (updateUzytkownik.getLogin() != null) updateUzytkownik.setLogin(updateUzytkownik.getLogin());


            uzytkownikRepository.update(uzytkownik);
            return 200;
        } else {
            return 404;
        }
    }
    @DeleteMapping("/{id}")
    public int delete(@PathVariable("id") int id) {
        return uzytkownikRepository.delete(id);
    }
}

