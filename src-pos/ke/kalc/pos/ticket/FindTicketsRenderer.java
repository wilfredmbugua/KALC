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


package ke.kalc.pos.ticket;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JList;
import ke.kalc.globals.IconFactory;


public class FindTicketsRenderer extends DefaultListCellRenderer {
    
    private Icon icoTicketNormal;
    private Icon icoTicketRefund;

    /**
     *
     */
    public static final int RECEIPT_NORMAL = 0;
    
    /** Creates a new instance of ProductRenderer */
    public FindTicketsRenderer() {
        this.icoTicketNormal = IconFactory.getIcon("pay.png");
        this.icoTicketRefund = IconFactory.getIcon("refundit.png");
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, null, index, isSelected, cellHasFocus);

        int ticketType = ((FindTicketsInfo)value).getTicketType();
        setText("<html><table>" + value.toString() +"</table></html>");
        if (ticketType == RECEIPT_NORMAL) {
            setIcon(icoTicketNormal);
        } else {
            setIcon(icoTicketRefund);
        }
        
        return this;
    }   
}
