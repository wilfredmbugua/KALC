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


package ke.kalc.pos.payment;

import ke.kalc.globals.SystemProperty;
import ke.kalc.pos.forms.AppConfig;

/**
 *
 *   
 */
public class PaymentGatewayFac {
    
    /** Creates a new instance of PaymentGatewayFac */
    private PaymentGatewayFac() {
    }
    
    /**
     *
     * @param props
     * @return
     */
    public static PaymentGateway getPaymentGateway() {
        
        String sReader = SystemProperty.GATEWAY;
        switch (sReader) {
            case "external":
                return new PaymentGatewayExt();
            default:
                return null;
        }
    }      
}
