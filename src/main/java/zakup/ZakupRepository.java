package zakup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import zakup.model.Zakup;

import java.util.List;

@Component
@Repository
public class ZakupRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Zakup> getAll() {
        return jdbcTemplate.query("SELECT id_zakup, id_uzytkownik, kwota FROM zakup",
                BeanPropertyRowMapper.newInstance(Zakup.class));
    }

    public Zakup getById(int id) {
        return jdbcTemplate.queryForObject("SELECT id_zakup, id_uzytkownik, kwota WHERE " + "id = ?",
                BeanPropertyRowMapper.newInstance(Zakup.class), id);
    }

    public int save(List<Zakup> zakupy) {
        zakupy.forEach(zakup -> jdbcTemplate
                .update("INSERT INTO zakup(id_zakup, id_uzytkownik, kwota)  VALUES(?, ?,?)",
                        zakup.getIdZakup(), zakup.getIdUzytkownika(), zakup.getKwota()));
        return 1;
    }

    public int update(Zakup zakup) {
        return jdbcTemplate.update("UPDATE zakup SET id_zakup=?, id_uzytkownik=?, kwota=? WHERE id=?",
                zakup.getIdZakup(), zakup.getIdUzytkownika(), zakup.getKwota());
    }

    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM zakup WHERE id=?", id);
    }

}
