/*
**    KALC POS  - Open Source Point of Sale
**
**    Copyright (c) 2015-2023 KALC Corporation   
**
**    http://kalcapps.com/enterprise
**   
**    (at your option) any later version.
**
**    KALC POS is distributed under proprietary license.
**    but WITHOUT ANY WARRANTY; without even the implied warranty of
**    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
**
**
*/


package uk.kalc.pos.inventory;

import javax.swing.table.AbstractTableModel;
import uk.kalc.basic.BasicException;
import uk.kalc.data.user.BrowsableData;
import uk.kalc.format.Formats;

public class StockModel extends AbstractTableModel {
    
    private BrowsableData m_bd;
    private Formats[] m_formats;
    private boolean[] m_bedit;
    
    /** Creates a new instance of StockModel
     * @param bd
     * @param f
     * @param bedit */
    public StockModel(BrowsableData bd, Formats[] f, boolean[] bedit) {
        m_bd = bd;
        m_formats = f;
        m_bedit = bedit;
    }
    @Override
    public int getRowCount() {
        return m_bd.getSize();
    }
    @Override
    public int getColumnCount() {
        return m_formats.length;
    }
    @Override
    public Object getValueAt(int row, int column) {
        return m_formats[column].formatValue(
                ((Object[]) m_bd.getElementAt(row))[column]);
    }     
    @Override
    public boolean isCellEditable(int row, int column) {
        return m_bedit[column];
    }
    @Override
    public void setValueAt(Object aValue, int row, int column) {
        Object[] record = (Object[]) m_bd.getElementAt(row);
        try {
            record[column] = m_formats[column].parseValue((String) aValue);           
            m_bd.updateRecord(row, record);
        } catch (BasicException e) {           
        }
    }
}
