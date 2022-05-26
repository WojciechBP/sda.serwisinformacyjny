import kategorie.KategoriaRepository;
import kategorie.model.Kategoria;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kategorie")
public class KategoriaService {

    @Autowired
    KategoriaRepository kategoriaRepository;

    @GetMapping("")
    public List<Kategoria> getAll() {
        return kategoriaRepository.getAll();
    }

    @GetMapping("/{id}")
    public Kategoria getById(@PathVariable("id") int id) {
        return kategoriaRepository.getById(id);
    }

    @PostMapping("")
    public int add(@RequestBody List<Kategoria> kategorie) {
        return kategoriaRepository.save(kategorie);
    }

    @PutMapping("/{id}")
    public int update(@PathVariable("id") int id, @RequestBody Kategoria updateKategoria) {
        Kategoria kategoria= kategoriaRepository.getById(id);
        if(kategoria != null) {
            kategoria.setIdKategoria(updateKategoria.getIdKategoria());
            kategoria.setNazwa(updateKategoria.getNazwa());
            kategoria.setNazwaOpisowa(updateKategoria.getNazwaOpisowa());
            kategoriaRepository.update(kategoria);
            return 200;
        } else {
            return 404;
        }
    }

    @PatchMapping("/{id}")
    public int partiallyUpdate(@PathVariable("id") int id, @RequestBody Kategoria updateKategora) {
        Kategoria kategoria =kategoriaRepository.getById(id);

        if(kategoria != null) {
            if (updateKategora.getIdKategoria() >0) kategoria.setIdKategoria(updateKategora.getIdKategoria());
            if (updateKategora.getNazwa() != null) updateKategora.setNazwa(updateKategora.getNazwa());
            if (updateKategora.getNazwaOpisowa() != null) updateKategora.setNazwaOpisowa(updateKategora.getNazwaOpisowa());

            kategoriaRepository.update(kategoria);
            return 200;
        } else {
            return 404;
        }
    }
    @DeleteMapping("/{id}")
    public int delete(@PathVariable("id") int id) {
        return kategoriaRepository.delete(id);
    }
}
