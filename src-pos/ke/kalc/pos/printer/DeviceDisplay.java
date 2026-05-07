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


package ke.kalc.pos.printer;

import javax.swing.JComponent;

/**
 *
 *   
 */
public interface DeviceDisplay {


    /**
     *
     * @return
     */
        public String getDisplayName();

    /**
     *
     * @return
     */
    public String getDisplayDescription();

    /**
     *
     * @return
     */
    public JComponent getDisplayComponent();
    
    // INTERFAZ VISOR

    /**
     *
     * @param animation
     * @param sLine1
     * @param sLine2
     */
        public void writeVisor(int animation, String sLine1, String sLine2);

    /**
     *
     * @param sLine1
     * @param sLine2
     */
    public void writeVisor(String sLine1, String sLine2);

    /**
     *
     */
    public void clearVisor();
}
