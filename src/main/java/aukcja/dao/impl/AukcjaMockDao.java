package aukcja.dao.impl;

import aukcja.model.Aukcja;

import java.time.LocalDate;
import java.util.List;

public class AukcjaMockDao implements AukcjaDao{
    private List<Aukcja> aukcje;

    public AukcjaMockDao() {
        Aukcja.builder().idAukcja(1).tytuł("Smartfon Apple iPhone 5s").opis("Witam, sprzedam telefon iPhone 5S 16 Gb, używany prywatnie, stan bardzo dobry, bez uszkodzeń, w zestawie ładowarka i słuchawki, pudełko. Zapraszam do licytacji").kategoria("Elekronika").kwotaMinimalna(180).kwotaMinimalna(250).dataWystawienia(LocalDate.of(2022,03,05)).dataZakończenia(LocalDate.of(2022,05,15)).ilośćOdwiedzin(5);
        Aukcja.builder().idAukcja(2).tytuł("Koszulka męska GUESS").opis("Mam do sprzedania koszulke męską GUESS koloru granatowego, rozmiar M. Koszulka jest nowa bez metki").kategoria("Moda").kwotaMinimalna(120).kwotaKupTeraz(150).dataWystawienia(LocalDate.of(2022,05,11)).dataZakończenia(LocalDate.of(2022,05,20)).ilośćOdwiedzin(12);
        Aukcja.builder().idAukcja(3).tytuł("Szampon BEBIO").opis("Do sprzedania naturalny szampon do włosów z olejem kokosowym oraz ekstraktem z oliwek i debu francuskiego, pojemność 300 ml. Produkt nie używany, zapakowany oryginalnie. Zapraszam do licytacji lub kupna").kategoria("Uroda").kwotaMinimalna(20).kwotaKupTeraz(27).dataWystawienia(LocalDate.of(2022,05,12)).dataZakończenia(LocalDate.of(2022,05,22)).ilośćOdwiedzin(2);
    }



    @Override
    public Aukcja getByID(int idAukcja) {
        for(Aukcja a: aukcje) {
            if (a.getIdAukcja() == idAukcja) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Aukcja> getAll() {
        return aukcje;
    }
}
