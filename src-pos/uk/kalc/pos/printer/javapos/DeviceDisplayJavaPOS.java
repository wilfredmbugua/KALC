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


package uk.kalc.pos.printer.javapos;

import jpos.JposException;
import jpos.LineDisplay;
import jpos.LineDisplayConst;
import uk.kalc.pos.printer.DeviceDisplay;
import uk.kalc.pos.printer.DeviceDisplayBase;
import uk.kalc.pos.printer.DeviceDisplayImpl;
import uk.kalc.pos.printer.TicketPrinterException;
 
/**
 *
 *   
 */
public class DeviceDisplayJavaPOS implements DeviceDisplay, DeviceDisplayImpl {
    
    private String m_sName;
    private LineDisplay m_ld;
    
    private DeviceDisplayBase m_displaylines;
    
    /** Creates a new instance of DeviceDisplayJavaPOS
     * @param sDeviceName
     * @throws uk.kalc.pos.printer.TicketPrinterException */
    public DeviceDisplayJavaPOS(String sDeviceName) throws TicketPrinterException {
        m_sName = sDeviceName;
        
        m_ld = new LineDisplay();
        try {       
            m_ld.open(m_sName);
            m_ld.claim(10000);
            m_ld.setDeviceEnabled(true);
        } catch (JposException e) {
            throw new TicketPrinterException(e.getMessage(), e);
        }

        m_displaylines = new DeviceDisplayBase(this);
   }
    
    /**
     *
     * @return
     */
    @Override
    public String getDisplayName() {
        return m_sName;
    }    

    /**
     *
     * @return
     */
    @Override
    public String getDisplayDescription() {
        return null;
    }      

    /**
     *
     * @return
     */
    @Override
    public javax.swing.JComponent getDisplayComponent() {
        return null;
    }
    
    /**
     *
     * @param animation
     * @param sLine1
     * @param sLine2
     */
    @Override
    public void writeVisor(int animation, String sLine1, String sLine2) {
        m_displaylines.writeVisor(animation, sLine1, sLine2);
    }

    /**
     *
     * @param sLine1
     * @param sLine2
     */
    @Override
    public void writeVisor(String sLine1, String sLine2) {        
        m_displaylines.writeVisor(sLine1, sLine2);
    }
     
    /**
     *
     */
    @Override
    public void clearVisor() {
        m_displaylines.clearVisor();
    }
    
    /**
     *
     */
    @Override
    public void repaintLines() {
        try {
            m_ld.displayTextAt(0, 0, m_displaylines.getLine1(), LineDisplayConst.DISP_DT_NORMAL);
            m_ld.displayTextAt(1, 0, m_displaylines.getLine2(), LineDisplayConst.DISP_DT_NORMAL);
        } catch (JposException e) {
        }
    }
    
    @Override
    public void finalize() throws Throwable {
   
        m_ld.setDeviceEnabled(false);
        m_ld.release();
        m_ld.close();
        
        super.finalize();
    }
}
