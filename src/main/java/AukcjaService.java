import aukcja.model.Aukcja;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import aukcja.AukcjaRepository;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/aukcje")

public class AukcjaService {

    @Autowired
    AukcjaRepository aukcjaRepository;


    @GetMapping("")
    public List<Aukcja> getAll() {
        return aukcjaRepository.getAll();
    }

    @GetMapping("/{id}")
    public Aukcja getById(@PathVariable("id") int id) {
        return aukcjaRepository.getById(id);
    }

    @PostMapping("")
    public int add(@RequestBody List<Aukcja> aukcje) {
        return aukcjaRepository.save(aukcje);
    }

    @PutMapping("/{id}")
    public int update(@PathVariable("id") int id, @RequestBody Aukcja updateAukcja) {
        Aukcja aukcja = aukcjaRepository.getById(id);
        if (aukcja != null) {
            aukcja.setIdAukcja(updateAukcja.getIdAukcja());
            aukcja.setTytul(updateAukcja.getTytul());
            aukcja.setKategoria(updateAukcja.getKategoria());
            aukcja.setOpis((updateAukcja.getOpis()));
            aukcja.setKwotaMinimalna(updateAukcja.getKwotaMinimalna());
            aukcja.setKwotaKupTeraz(updateAukcja.getKwotaKupTeraz());
            aukcja.setDataWystawienia(updateAukcja.getDataWystawienia());
            aukcja.setDataZakonczenia(updateAukcja.getDataZakonczenia());
            aukcja.setUzytkownik(updateAukcja.getUzytkownik());
            aukcja.setIloscOdwiedzin(updateAukcja.getIloscOdwiedzin());

            aukcjaRepository.update(aukcja);
            return 200;
        } else {
            return 404;
        }
    }

    @PatchMapping("/{id}")
    public int partiallyUpdate(@PathVariable("id") int id, @RequestBody Aukcja updateAukcja) {
        Aukcja aukcja = aukcjaRepository.getById(id);

        if (aukcja != null) {
            if (updateAukcja.getIdAukcja() > 0) aukcja.setIdAukcja(updateAukcja.getIdAukcja());
            if (updateAukcja.getTytul() != null) updateAukcja.setTytul(updateAukcja.getTytul());


            aukcjaRepository.update(aukcja);
            return 200;
        } else {
            return 404;
        }
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable("id") int id) {
        return aukcjaRepository.delete(id);
    }
}