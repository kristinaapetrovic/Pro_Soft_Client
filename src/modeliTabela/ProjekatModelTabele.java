/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import language.LanguageManager;
import model.Projekat;

/**
 *
 * @author Korisnik
 */
public class ProjekatModelTabele extends AbstractTableModel {

    List<Projekat> lista;
    String kol1 = LanguageManager.getString("reg_num");
    String kol2 = LanguageManager.getString("project_name");
    String kol3 = LanguageManager.getString("managers");
    String naziviKolona[] = {kol1, kol2, kol2};

    public ProjekatModelTabele(List<Projekat> lista) {
        this.lista = lista;
    }

    public List<Projekat> getLista() {
        return lista;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return super.getColumnClass(columnIndex); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
        Projekat pu = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pu.getRegBroj() + "";
            case 1:
                return pu.getNazivProjekta();
            case 2:
                return pu.getMenadzer().getImePrezime();
            default:
                return "na";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    public void dodajElement(Projekat element) {
        lista.add(element);
        fireTableDataChanged();
    }

}
