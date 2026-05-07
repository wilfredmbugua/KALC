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


public class DeviceDisplaySurePOS extends DeviceDisplaySerial {
    
    private UnicodeTranslator trans;
    
    /**
     *
     * @param display
     */
    public DeviceDisplaySurePOS(PrinterWritter display) { 
        trans = new UnicodeTranslatorSurePOS();
        init(display);                
    }
   
    /**
     *
     */
    @Override
    public void initVisor() {
        display.write(new byte[]{0x00, 0x01}); // IBM Mode
        display.write(new byte[]{0x02}); // Set the code page
        display.write(trans.getCodeTable());
        display.write(new byte[]{0x11}); // HIDE CURSOR
        display.write(new byte[]{0x14}); // HIDE CURSOR
        display.write(new byte[]{0x10, 0x00}); // VISOR HOME
        display.flush();
    }

    /**
     *
     */
    @Override
    public void repaintLines() {
        display.write(new byte[]{0x10, 0x00}); // VISOR HOME
        display.write(trans.transString(DeviceTicket.alignLeft(m_displaylines.getLine1(), 20)));
        display.write(new byte[]{0x10, 0x14});
        display.write(trans.transString(DeviceTicket.alignLeft(m_displaylines.getLine2(), 20)));        
        display.flush();
    }
}
