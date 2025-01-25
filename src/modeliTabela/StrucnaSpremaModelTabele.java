/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import language.LanguageManager;
import model.StrucnaSprema;

/**
 *
 * @author Korisnik
 */
public class StrucnaSpremaModelTabele extends AbstractTableModel {

    private List<StrucnaSprema> lista = new ArrayList<>();
    String kol1 = "ID";
    String kol2 = LanguageManager.getString("education_name");
    private String naziviKolona[] = {kol1, kol2};

    public List<StrucnaSprema> getLista() {
        return lista;
    }

    public StrucnaSpremaModelTabele() {
    }

    public StrucnaSpremaModelTabele(List<StrucnaSprema> lista) {
        this.lista = lista;
    }

    public void dodajElement(StrucnaSprema element) {
        lista.add(element);
        fireTableDataChanged();
    }

    public void ukloniElement(StrucnaSprema element) {
        lista.remove(element);
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
        StrucnaSprema ss = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ss.getIdStrucnaSprema() + "";
            case 1:
                return ss.getNazivStrucnaSprema();
            default:
                return "na";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

}
