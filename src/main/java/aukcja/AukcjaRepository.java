package aukcja;

import aukcja.model.Aukcja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import uzytkownik.model.Uzytkownik;


import java.util.List;

@Component
@Repository
public class AukcjaRepository {
    JdbcTemplate jdbcTemplate;
    @Autowired

    public List<Aukcja> getAll() {
        return jdbcTemplate.query("SELECT id_aukcji, tytul, opis, kwota_minimalna, kwota_kup_teraz, uzytkownik, dada_zakonczenia, data_wystawienia, iolsc_odwiedzin",
                BeanPropertyRowMapper.newInstance(Aukcja.class));
    }

    public Aukcja getById(int id) {
        return jdbcTemplate.queryForObject("SELECT id_aukcji, tytul, opis, kwota_minimalna, kwota_kup_teraz, uzytkownik, data_zakonczenia, data_wystawienia, iolsc_odwiedzin FROM aukcja WHERE " + "id = ?",
                BeanPropertyRowMapper.newInstance(Aukcja.class), id);
    }
    public int save(List<Aukcja> aukcje) {
        aukcje.forEach(aukcja -> jdbcTemplate
                .update("INSERT INTO id_aukcji, tytul, opis, kwota_minimalna, kwota_kup_teraz, uzytkownik, dada_zakonczenia, data_wystawienia, iolsc_odwiedzin) VALUES(?, ?, ?,?, ?, ?, ?, ?, ?)",
                aukcja.getIdAukcja(), aukcja.getTytul(), aukcja.getOpis(), aukcja.getKwotaMinimalna(), aukcja.getKwotaKupTeraz(), aukcja.getUzytkownik(), aukcja.getDataZakonczenia(), aukcja.getDataWystawienia(), aukcja.getIloscOdwiedzin()));
        return 1;
    }
    public int update(Aukcja aukcja) {
        return jdbcTemplate.update("UPDATE aukcja SET id_aukcji=?, tytul=?, opis=?, kwota_minimalna=?, kwota_kup_teraz=?, uzytkownik=?, dada_zakonczenia=?, data_wystawienia=?, iolsc_odwiedzin=?  WHERE id=?",
                aukcja.getIdAukcja(), aukcja.getTytul(), aukcja.getOpis(), aukcja.getKwotaMinimalna(), aukcja.getKwotaKupTeraz(), aukcja.getUzytkownik(), aukcja.getDataZakonczenia(), aukcja.getDataWystawienia(), aukcja.getIloscOdwiedzin());
    }
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM aukcja WHERE id=?", id);
    }
}
