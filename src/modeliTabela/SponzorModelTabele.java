/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import language.LanguageManager;
import model.Sponzor;

/**
 *
 * @author Korisnik
 */
public class SponzorModelTabele extends AbstractTableModel {

    private List<Sponzor> lista;
    String kol1=LanguageManager.getString("rnc");
    String kol2=LanguageManager.getString("company_name");
    String kol3=LanguageManager.getString("owner");
    String kol4=LanguageManager.getString("city");
    private String naziviKolona[] = {kol1, kol2, kol3, kol4};

    public SponzorModelTabele(List<Sponzor> lista) {
        this.lista = lista;
    }

    public List<Sponzor> getLista() {
        return lista;
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
        Sponzor gi = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return gi.getMaticniBroj();
            case 1:
                return gi.getNazivFirme();
            case 2:
                return gi.getVlasnik();
            case 3:
                return gi.getMesto().getNazivMesto();
            default:
                return "na";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    public void dodajElement(Sponzor element) {
        if(lista.contains(element)) return;
        lista.add(element);
        fireTableDataChanged();
    }

    public void ukloniElement(int element) {
        lista.remove(element);
        fireTableDataChanged();
    }

}
