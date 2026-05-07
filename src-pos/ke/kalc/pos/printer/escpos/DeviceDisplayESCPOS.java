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


package ke.kalc.pos.printer.escpos;
    
import ke.kalc.pos.printer.DeviceTicket;

/**
 *
 *   
 */
public class DeviceDisplayESCPOS extends DeviceDisplaySerial {
       
    private UnicodeTranslator trans;

    /** Creates a new instance of DeviceDisplayESCPOS
     * @param display
     * @param trans */
    public DeviceDisplayESCPOS(PrinterWritter display, UnicodeTranslator trans) {
        this.trans = trans;
        init(display);       
    }

    /**
     *
     */
    @Override
    public void initVisor() {
        display.init(ESCPOS.INIT);
        display.write(ESCPOS.SELECT_DISPLAY); // Al visor
        display.write(trans.getCodeTable());
        display.write(ESCPOS.VISOR_HIDE_CURSOR);         
        display.write(ESCPOS.VISOR_CLEAR);
        display.write(ESCPOS.VISOR_HOME);
        display.flush();
    }
        
    
    @Override
    public void repaintLines() {
        
        display.write(ESCPOS.SELECT_DISPLAY);
        display.write(ESCPOS.VISOR_CLEAR);
        display.write(ESCPOS.VISOR_HOME);
        display.write(trans.transString(DeviceTicket.alignLeft(m_displaylines.getLine1(), 20)));
        display.write(trans.transString(DeviceTicket.alignLeft(m_displaylines.getLine2(), 20)));        
        display.flush();
    }
}
