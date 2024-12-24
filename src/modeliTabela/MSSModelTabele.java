/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.MSS;

/**
 *
 * @author Korisnik
 */
public class MSSModelTabele extends AbstractTableModel{

    private List<MSS> lista=new ArrayList<>();
    private String [] naziviKolona={"Naziv strucne spreme", "Datum"};
    public MSSModelTabele(List<MSS> lista) {
        this.lista = lista;
    }

    public List<MSS> getLista() {
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
        MSS mss=lista.get(rowIndex);
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        switch(columnIndex){
            case 0: return mss.getStrucnaSprema().getNazivStrucnaSprema();
            case 1: return format.format(mss.getDatumMSS());
            default: return "greska";
        }
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column];
    }

    public void dodajElement(MSS mss) {
        lista.add(mss);
        fireTableDataChanged();
    }

    public void ukloniElement(MSS mss) {
        lista.remove(mss);
        fireTableDataChanged();
    }
    
}
