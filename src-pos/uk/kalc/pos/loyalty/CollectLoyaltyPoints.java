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


package uk.kalc.pos.loyalty;

import uk.kalc.data.gui.MessageInf;
import uk.kalc.pos.forms.AppLocal;
import uk.kalc.pos.datalogic.DataLogicSystem;
import uk.kalc.pos.printer.TicketParser;
import uk.kalc.pos.printer.TicketPrinterException;
import uk.kalc.pos.scripting.ScriptEngine;
import uk.kalc.pos.scripting.ScriptException;
import uk.kalc.pos.scripting.ScriptFactory;
import uk.kalc.pos.ticket.TicketInfo;
import uk.kalc.data.loader.SessionFactory;
import uk.kalc.pos.printer.IncludeFile;

/**
 *
 * @author John
 */
public class CollectLoyaltyPoints extends LoyaltyCard {

    protected static DataLogicSystem dlSystem = null;

    public CollectLoyaltyPoints(String cardNumber) {
        super(cardNumber);
        dlSystem = new DataLogicSystem();
        dlSystem.init(SessionFactory.getSession());

    }

    private void printVoucher(String sresourcename) {
        String source = dlSystem.getResourceAsXML(sresourcename);

        String sresource;
        IncludeFile incFile = new IncludeFile(source, dlSystem);

        if (source == null) {
            MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotprintticket"));
        } else {
            sresource = incFile.processInclude();
            try {
                ScriptEngine script = ScriptFactory.getScriptEngine(ScriptFactory.VELOCITY);
                m_TTP.printTicket(script.eval(sresource).toString());
            } catch (ScriptException | TicketPrinterException e) {
                MessageInf msg = new MessageInf(MessageInf.SGN_WARNING, AppLocal.getIntString("message.cannotprintticket"), e);
            }
        }
    }

    @Override
    public void processVoucherCheck(TicketInfo ticket, TicketParser m_TTP) {
    }

    @Override
    public void processTicketPoints(String cardNumber, TicketInfo ticket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getRedeemedPoints(String cardNumber, TicketInfo ticket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getEarnedPoints(String cardNumber, TicketInfo ticket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
