package kategorie;

import kategorie.model.Kategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.List;

@Component
@Repository
public class KategoriaRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Kategoria> getAll() {
        return jdbcTemplate.query("SELECT id_kategoria, nazwa, nazwa_opisowa FROM kategoria",
                BeanPropertyRowMapper.newInstance(Kategoria.class));
    }

    public Kategoria getById(int id) {
        return jdbcTemplate.queryForObject("SELECT id_kategoria, nazwa, nazwa_opisowa WHERE " + "id = ?",
                BeanPropertyRowMapper.newInstance(Kategoria.class), id);
    }

    public int save(List<Kategoria> kategorie) {
        kategorie.forEach(kategoria -> jdbcTemplate
                .update("INSERT INTO kategoria(id_kategoria, nazwa, nazwa_opisowa)  VALUES(?, ?, ?,)",
                        kategoria.getIdKategoria(), kategoria.getNazwa(), kategoria.getNazwaOpisowa()));
        return 1;
    }

    public int update(Kategoria kategoria) {
        return jdbcTemplate.update("UPDATE kategoria SET id_kategoria=?, nazwa=?, nazwa_opisowa=? WHERE id=?",
               kategoria.getIdKategoria(), kategoria.getNazwa(), kategoria.getNazwaOpisowa());
    }

    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM kategoria WHERE id=?", id);
    }

}
