package ocenaTransakcji;

import kategorie.model.Kategoria;
import ocenaTransakcji.model.OcenaTransakcji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public class OcenaTransakcjiRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<OcenaTransakcji> getAll() {
        return jdbcTemplate.query("SELECT id_ocena_transakcji, id_zakupu, komentarz_sprzedajacego, ocena_kupujacego, komentarz_kupujacego FROM ocena_transakcji",
                BeanPropertyRowMapper.newInstance(OcenaTransakcji.class));
    }

    public OcenaTransakcji getById(int id) {
        return jdbcTemplate.queryForObject("SELECT id_ocena_transakcji, id_zakupu, komentarz_sprzedajacego, ocena_kupujacego, komentarz_kupujacego WHERE " + "id = ?",
                BeanPropertyRowMapper.newInstance(OcenaTransakcji.class), id);
    }

    public int save(List<OcenaTransakcji> ocenyTransakcji) {
        ocenyTransakcji.forEach(ocenaTransakcji -> jdbcTemplate
                .update("INSERT INTO ocena_transakcji(id_ocena_transakcji, id_zakupu, komentarz_sprzedajacego, ocena_kupujacego, komentarz_kupujacego)  VALUES(?, ?, ?,?,?)",
                        ocenaTransakcji.getIdOcenaTransakcji(), ocenaTransakcji.getIdZakup(), ocenaTransakcji.getKomentarzSprzedajacego(), ocenaTransakcji.getOcenaKupujacego(), ocenaTransakcji.getKomentarzKupujacego()));        return 1;
    }

    public int update(OcenaTransakcji ocenaTransakcji) {
        return jdbcTemplate.update("UPDATE ocena_transakcji SET iid_ocena_transakcji=?, id_zakupu=?, komentarz_sprzedajacego=?, ocena_kupujacego=?, komentarz_kupujacego=? WHERE id=?",
                ocenaTransakcji.getIdOcenaTransakcji(), ocenaTransakcji.getIdZakup(), ocenaTransakcji.getKomentarzSprzedajacego(),ocenaTransakcji.getOcenaKupujacego(), ocenaTransakcji.getKomentarzKupujacego());
    }

    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM ocena_transakcji WHERE id=?", id);
    }

}
