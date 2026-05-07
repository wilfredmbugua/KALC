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


package ke.kalc.pos.sales;

import ke.kalc.pos.ticket.TicketInfo;

/**
 *
 *   
 */
public interface TicketsEditor {
    
    /**
     *
     * @param oTicket
     * @param oTicketExt
     */
    public void setActiveTicket(TicketInfo oTicket, Object oTicketExt); 

    public void setTicketName(String tName);
    /**
     *
     * @return
     */
    public TicketInfo getActiveTicket(); 
    
    public void addServiceChargeLine();
}
