/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import language.LanguageManager;
import model.Aktivnost;

/**
 *
 * @author Korisnik
 */
public class AktivnostModelTabele extends AbstractTableModel {

    private List<Aktivnost> lista;
    private String[] naziviKolona;

    String kol1=LanguageManager.getString("no");
    String kol2=LanguageManager.getString("act_name");
    String kol3=LanguageManager.getString("act_desc");
    String kol4=LanguageManager.getString("act_type");
    String kol5=LanguageManager.getString("done");
    String kol6=LanguageManager.getString("done_date");
    
    public AktivnostModelTabele() {
    }

    public List<Aktivnost> getLista() {
        return lista;
    }

    public AktivnostModelTabele(List<Aktivnost> lista, boolean daLiJeZavrsena) {
        this.lista = lista;
        if (daLiJeZavrsena) {
            this.naziviKolona = new String[]{kol1, kol2, kol3, kol4, kol5, kol6};
        } else {
            this.naziviKolona = new String[]{kol1, kol2, kol3, kol4};
        }
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
        Aktivnost aktivnost = lista.get(rowIndex);
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        switch (columnIndex) {
            case 0:
                return aktivnost.getRedniBroj() + "";
            case 1:
                return aktivnost.getNazivAktivnosti();
            case 2:
                return aktivnost.getOpisAktivnosti();
            case 3:
                return aktivnost.getVrstaAktivnosti().getNazivVrstaAktivnosti();
            case 4:
                return aktivnost.isObavljena();
            case 5:
                return aktivnost.getDatumRealizacije() == null ? "Nepoznato" : format.format(aktivnost.getDatumRealizacije());
            default:
                return "na";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    public void dodajElement(Aktivnost element) {
        if (lista.contains(element)) {
            return;
        }
        lista.add(element);
        fireTableDataChanged();
    }

    public void ukloniElement(Aktivnost get) {
        lista.remove(get);
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 4;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 4) {
            return Boolean.class;
        }
        return String.class;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 4 && aValue instanceof Boolean) {
            lista.get(rowIndex).setObavljena((boolean) aValue);
            if ((Boolean) aValue) {
                lista.get(rowIndex).setDatumRealizacije(new Date()); 
                System.out.println("Obavljena: "+lista.get(rowIndex).getDatumRealizacije());
            } else {
                lista.get(rowIndex).setDatumRealizacije(null); 
            }
            fireTableCellUpdated(rowIndex, columnIndex);
        }
    }
}
