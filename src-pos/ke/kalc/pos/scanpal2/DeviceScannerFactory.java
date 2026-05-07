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


package ke.kalc.pos.scanpal2;

import ke.kalc.commons.utils.TerminalInfo;
import ke.kalc.pos.forms.AppProperties;
import ke.kalc.pos.util.StringParser;

/**
 *
 *   
 */
public class DeviceScannerFactory {
    
    /** Creates a new instance of DeviceScannerFactory */
    private DeviceScannerFactory() {
    }
    
    /**
     *
     * @param props
     * @return
     */
    public static DeviceScanner createInstance(AppProperties props) {
        
        StringParser sd = new StringParser(TerminalInfo.getScales());
        String sScannerType = sd.nextToken(':');
        String sScannerParam1 = sd.nextToken(',');
        // String sScannerParam2 = sd.nextToken(',');
        
        if ("scanpal2".equals(sScannerType)) {
            return new DeviceScannerComm(sScannerParam1);
        } else {
            return null;
        }
    }  
}
