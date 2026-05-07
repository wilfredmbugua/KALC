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


package uk.kalc.pos.sales.restaurant;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JList;
import uk.kalc.globals.IconFactory;


public class ReservationRenderer extends DefaultListCellRenderer {
                
    private Icon icocustomer;

    public ReservationRenderer() {

      //  icocustomer = new ImageIcon(getClass().getClassLoader().getResource("customer_sml.png"));
        icocustomer =IconFactory.getIcon("timer.png");
        
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, null, index, isSelected, cellHasFocus);
        setText(value.toString());
        setIcon(icocustomer);
        return this;
    }      
}
