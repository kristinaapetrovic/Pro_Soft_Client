/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import language.LanguageManager;
import model.Mesto;

/**
 *
 * @author Korisnik
 */
public class MestoModelTabele extends AbstractTableModel {

    private List<Mesto> lista = new ArrayList<>();
    String kol1 = LanguageManager.getString("postal_code");
    String kol2 = LanguageManager.getString("city_name");
    private String naziviKolona[] = {kol1, kol2};

    public List<Mesto> getLista() {
        return lista;
    }

    public MestoModelTabele(List<Mesto> lista) {
        this.lista = lista;
    }

    public void dodajElement(Mesto element) {
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
        Mesto mesto = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return mesto.getPostanskiBroj() + "";
            case 1:
                return mesto.getNazivMesto();
            default:
                return "na";
        }

    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    public void ukloniElement(Mesto mesto) {
        lista.remove(mesto);
        fireTableDataChanged();
    }

}
