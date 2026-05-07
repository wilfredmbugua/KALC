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


package uk.kalc.pos.printer.escpos;

import uk.kalc.pos.forms.AppLocal;
import uk.kalc.pos.printer.DeviceDisplay;
import uk.kalc.pos.printer.DeviceDisplayBase;
import uk.kalc.pos.printer.DeviceDisplayImpl;

public abstract class DeviceDisplaySerial implements DeviceDisplay, DeviceDisplayImpl {
    
    private String m_sName;    

    /**
     *
     */
    protected PrinterWritter display;

    /**
     *
     */
    protected DeviceDisplayBase m_displaylines;
    
    /**
     *
     */
    public DeviceDisplaySerial() {
        m_displaylines = new DeviceDisplayBase(this);
    }
    
    /**
     *
     * @param display
     */
    protected void init(PrinterWritter display) {                
        m_sName = AppLocal.getIntString("printer.serial");
        this.display = display;      
        initVisor();        
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
    public abstract void initVisor();
}
