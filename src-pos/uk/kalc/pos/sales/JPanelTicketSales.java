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


package uk.kalc.pos.sales;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import uk.kalc.globals.SystemProperty;
import uk.kalc.basic.BasicException;
import uk.kalc.commons.utils.TerminalInfo;
import uk.kalc.pos.catalog.CatalogSelector;
import uk.kalc.pos.catalog.JCatalog;
import uk.kalc.pos.catalog.JCatalogFull;
import uk.kalc.pos.datalogic.DataLogicSystem;
import uk.kalc.pos.forms.AppView;
import uk.kalc.pos.ticket.ProductInfoExt;

/**
 *
 *
 */
public class JPanelTicketSales extends JPanelTicket {

    private CatalogSelector m_cat;
    private DataLogicSystem dlSystem;

    public JPanelTicketSales() {
    }

    @Override
    public void init(AppView app) {
        super.init(app);
        dlSystem = (DataLogicSystem) app.getBean("uk.kalc.pos.datalogic.DataLogicSystem");
        ticketLines.addListSelectionListener(new CatalogSelectionListener());
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    protected Component getSouthComponent() {

        if (SystemProperty.NEWSCREEN) {
            m_cat = new JCatalogFull(dlSales,
                    "true".equals(m_jbtnconfig.getProperty("pricevisible")),
                    "true".equals(m_jbtnconfig.getProperty("taxesincluded")),
                    siteGuid);
        } else {
            m_cat = new JCatalog(dlSales,
                    "true".equals(m_jbtnconfig.getProperty("pricevisible")),
                    "true".equals(m_jbtnconfig.getProperty("taxesincluded")),
                    siteGuid);
        }

        m_cat.addActionListener(new CatalogListener());
        m_cat.getComponent().setPreferredSize(new Dimension(
                0,
                Integer.parseInt(m_jbtnconfig.getProperty("cat-height", "245"))));
        return m_cat.getComponent();
    }

    @Override
    protected void resetSouthComponent() {
        m_cat.showCatalogPanel(null);
    }

    @Override
    protected JTicketsBag getJTicketsBag() {
        return JTicketsBag.createTicketsBag(TerminalInfo.getPosType(), m_App, this);
    }

    @Override
    public void activate() throws BasicException {
        super.activate();
        m_cat.loadCatalog(siteGuid);
    }

    @Override
    public void reLoadCatalog() {
        try {
            m_cat.loadCatalog(siteGuid);
        } catch (BasicException ex) {
        }

    }

    private class CatalogListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonTransition((ProductInfoExt) e.getSource());
        }
    }

    private class CatalogSelectionListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {

            if (!e.getValueIsAdjusting()) {
                int i = ticketLines.getSelectedIndex();
                
                if (i >= 0) {
                    // Look for the first non auxiliar product.
                    while (i >= 0 && m_oTicket.getLine(i).isProductCom()) {
                        i--;
                    }

                    // Show the accurate catalog panel...
                    if (i >= 0) {
                        m_cat.showCatalogPanel(m_oTicket.getLine(i).getProductID());
                    } else {
                        m_cat.showCatalogPanel(null);
                    }
                }
            }
        }
    }    
}
