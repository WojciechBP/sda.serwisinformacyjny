import kategorie.model.Kategoria;
import lombok.RequiredArgsConstructor;
import ocenaTransakcji.OcenaTransakcjiRepository;
import ocenaTransakcji.model.OcenaTransakcji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ocenytransakcji")

public class OcenaTransakcjiService {

    @Autowired
    OcenaTransakcjiRepository ocenaTransakcjiRepository;

    @GetMapping("")
    public List<OcenaTransakcji> getAll() {
        return ocenaTransakcjiRepository.getAll();
    }

    @GetMapping("/{id}")
    public OcenaTransakcji getById(@PathVariable("id") int id) {
        return ocenaTransakcjiRepository.getById(id);
    }

    @PostMapping("")
    public int add(@RequestBody List<OcenaTransakcji> ocenyTransakcji) {
        return ocenaTransakcjiRepository.save(ocenyTransakcji);
    }

    @PutMapping("/{id}")
    public int update(@PathVariable("id") int id, @RequestBody OcenaTransakcji updateOcenaTransakcji) {
        OcenaTransakcji ocenaTransakcji= ocenaTransakcjiRepository.getById(id);
        if(ocenaTransakcji != null) {
            ocenaTransakcji.setIdOcenaTransakcji(updateOcenaTransakcji.getIdOcenaTransakcji());
            ocenaTransakcji.setOcenaKupujacego(updateOcenaTransakcji.getOcenaKupujacego());
            ocenaTransakcji.setIdZakup(updateOcenaTransakcji.getIdZakup());
            ocenaTransakcji.setKomentarzKupujacego(updateOcenaTransakcji.getKomentarzKupujacego());
            ocenaTransakcji.setKomentarzSprzedajacego(updateOcenaTransakcji.getKomentarzSprzedajacego());
            return 200;
        } else {
            return 404;
        }
    }

    @PatchMapping("/{id}")
    public int partiallyUpdate(@PathVariable("id") int id, @RequestBody OcenaTransakcji updateOcenaTransakcji) {
        OcenaTransakcji ocenaTransakcji =ocenaTransakcjiRepository.getById(id);

        if(ocenaTransakcji != null) {
            if (updateOcenaTransakcji.getIdOcenaTransakcji() >0) ocenaTransakcji.setIdOcenaTransakcji(updateOcenaTransakcji.getIdOcenaTransakcji());
            if (updateOcenaTransakcji.getOcenaKupujacego() >0) ocenaTransakcji.setOcenaKupujacego((updateOcenaTransakcji.getOcenaKupujacego()));
            if (updateOcenaTransakcji.getIdZakup() >0) ocenaTransakcji.setIdZakup(updateOcenaTransakcji.getIdZakup());
            if (updateOcenaTransakcji.getKomentarzSprzedajacego() != null) ocenaTransakcji.setKomentarzSprzedajacego(updateOcenaTransakcji.getKomentarzSprzedajacego());
            if (updateOcenaTransakcji.getOcenaKupujacego() >0) ocenaTransakcji.setKomentarzKupujacego(updateOcenaTransakcji.getKomentarzKupujacego());

            ocenaTransakcjiRepository.update(ocenaTransakcji);
            return 200;
        } else {
            return 404;
        }
    }
    @DeleteMapping("/{id}")
    public int delete(@PathVariable("id") int id) {
        return ocenaTransakcjiRepository.delete(id);
    }
}


