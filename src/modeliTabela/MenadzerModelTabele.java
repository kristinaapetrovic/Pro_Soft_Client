/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import language.LanguageManager;
import model.Menadzer;

/**
 *
 * @author Korisnik
 */
public class MenadzerModelTabele extends AbstractTableModel {

    private List<Menadzer> lista = new ArrayList<>();
    String kol1 = LanguageManager.getString("umcn");
    String kol2 = LanguageManager.getString("name_surname");
    String kol3 = LanguageManager.getString("email");
    String kol4 = LanguageManager.getString("birthday");
    private String naziviKolona[] = {kol1, kol2, kol3, kol4};

    public List<Menadzer> getLista() {
        return lista;
    }

    public MenadzerModelTabele(List<Menadzer> lista) {
        this.lista = lista;
    }

    public void dodajElement(Menadzer element) {
        lista.add(element);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Menadzer menadzer = lista.get(rowIndex);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        switch (columnIndex) {
            case 0:
                return menadzer.getJmbg();
            case 1:
                return menadzer.getImePrezime();
            case 2:
                return menadzer.getEmail();
            case 3:
                return format.format(menadzer.getDatumRodjenja());
            default:
                return "na";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

}
