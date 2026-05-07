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

import javax.swing.JComponent;
import javax.swing.JPanel;
import ke.kalc.pos.forms.AppView;
import ke.kalc.pos.datalogic.DataLogicSales;
import ke.kalc.pos.sales.restaurant.JTicketsBagRestaurantMap;
import ke.kalc.pos.sales.shared.JTicketsBagShared;
import ke.kalc.pos.sales.simple.JTicketsBagSimple;

public abstract class JTicketsBag extends JPanel {

    protected AppView m_App;     
    protected DataLogicSales m_dlSales;
    protected TicketsEditor m_panelticket;    
    
    /** Creates new form JTicketsBag
     * @param oApp
     * @param panelticket */
    public JTicketsBag(AppView oApp, TicketsEditor panelticket) {        
        m_App = oApp;         
        m_panelticket = panelticket;        
        m_dlSales = (DataLogicSales) m_App.getBean("ke.kalc.pos.datalogic.DataLogicSales");
    }
    
    public abstract void activate();
    public abstract boolean deactivate();
    public abstract void deleteTicket();
    public abstract void deleteAllShared();
    public abstract void getTicketByCode(String id);
    protected abstract JComponent getBagComponent();
    protected abstract JComponent getNullComponent();
    
    public static JTicketsBag createTicketsBag(String sName, AppView app, TicketsEditor panelticket) {
        switch (sName) {
            case "standard":
                // return new JTicketsBagMulti(oApp, user, panelticket);
                return new JTicketsBagShared(app, panelticket);
            case "restaurant":
                return new JTicketsBagRestaurantMap(app, panelticket);
            default:
                // "simple"
           return new JTicketsBagSimple(app, panelticket);
        }
    }   
}
