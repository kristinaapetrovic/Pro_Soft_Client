/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import language.LanguageManager;
import model.JeSponzor;
import model.Sponzor;

/**
 *
 * @author Korisnik
 */
public class JeSponzorModelTabele extends AbstractTableModel {

    private List<JeSponzor> lista;
    String kol1 = LanguageManager.getString("company_name");
    String kol2 = LanguageManager.getString("merchandise");
    String kol3 = LanguageManager.getString("financial");
    String kol4 = LanguageManager.getString("spons_amount");
    private String[] naziviKolona = {kol1, kol2, kol3, kol4};

    public JeSponzorModelTabele(List<JeSponzor> lista) {
        this.lista = lista;
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
        JeSponzor js = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return js.getSponzor().getNazivFirme();
            case 1:
                return js.isRobni();
            case 2:
                return js.isNovcani();
            case 3:
                return js.getIznos() + "";
            default:
                return "greska";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    public void dodajElement(JeSponzor js) {
        if (postojiUListi(js)) {
            return;
        }
        lista.add(js);
        fireTableDataChanged();
    }

    public void ukloniElement(int selektovan) {
        lista.remove(selektovan);
        fireTableDataChanged();
    }

    public List<JeSponzor> getLista() {
        return lista;
    }

    private boolean postojiUListi(JeSponzor js) {
        for (JeSponzor s : lista) {
            if (s.getSponzor().getNazivFirme().equals(js.getSponzor().getNazivFirme())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 1 || columnIndex == 2) {
            return Boolean.class;
        }
        return String.class;
    }

}
