/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.VrstaAktivnosti;

/**
 *
 * @author Korisnik
 */
public class VrstaAktivnostiModelTabele extends AbstractTableModel {

    private List<VrstaAktivnosti> lista = new ArrayList<>();
    private String naziviKolona[] = {"ID", "Naziv"};

    public List<VrstaAktivnosti> getLista() {
        return lista;
    }

 
    public VrstaAktivnostiModelTabele(List<VrstaAktivnosti> lista) {
        this.lista = lista;
    }

    public void dodajElement(VrstaAktivnosti element) {
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
        VrstaAktivnosti vrstaAkt = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return vrstaAkt.getIdVrstaAktivnosti() + "";
            case 1:
                return vrstaAkt.getNazivVrstaAktivnosti();
            default:
                return "na";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    public void ukloniElement(VrstaAktivnosti vakt) {
        lista.remove(vakt);
        fireTableDataChanged();
    }

    

}
