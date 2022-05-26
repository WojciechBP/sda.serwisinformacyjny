package uzytkownik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import uzytkownik.model.Uzytkownik;

import java.util.List;

@Component
@Repository
public class UzytkownikRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Uzytkownik> getAll() {
        return jdbcTemplate.query("SELECT id_użytkownik, login, hasło, nazwa_konta, data_założenia_konta, województwo, miasto, adres, status_konta FROM użytkownik",
                BeanPropertyRowMapper.newInstance(Uzytkownik.class));
    }

    public Uzytkownik getById(int id) {
        return jdbcTemplate.queryForObject("SELECT id_Użytkownik, login, hasło, nazwa_konta, data_założenia_konta, województwo, miasto, adres, status_konta FROM użytkownik WHERE " + "id = ?",
                BeanPropertyRowMapper.newInstance(Uzytkownik.class), id);
    }

    public int save(List<Uzytkownik> użytkownicy) {
        użytkownicy.forEach(użytkownik -> jdbcTemplate
               .update("INSERT INTO użytkownik(id_użytkownik, login, hasło, nazwa_konta, data_założenia_konta, województwo, miasto, adres, status_konta) VALUES(?, ?, ?,?, ?, ?, ?, ?, ?)",
                       użytkownik.getIdUzytkownik(), użytkownik.getLogin(), użytkownik.getHasło(), użytkownik.getNazwaKonta(), użytkownik.getDataZałożeniaKonta(), użytkownik.getWojewództwo(), użytkownik.getMiasto(), użytkownik.getAdres(), użytkownik.getStatusKonta()));
        return 1;
    }

    public int update(Uzytkownik uzytkownik) {
        return jdbcTemplate.update("UPDATE uzytkownik SET id_użytkownik=?, login=?, hasło=?, nazwa_konta=?, data_założenia_konta=?, województwo=?, miasto=?, adres=?, status_konta=? WHERE id=?",
        uzytkownik.getIdUzytkownik(), uzytkownik.getLogin(), uzytkownik.getHasło(), uzytkownik.getNazwaKonta(), uzytkownik.getDataZałożeniaKonta(), uzytkownik.getWojewództwo(), uzytkownik.getMiasto(), uzytkownik.getAdres(), uzytkownik.getStatusKonta());
    }

    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM użytkownik WHERE id=?", id);
    }
}
