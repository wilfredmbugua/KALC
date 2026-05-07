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


package ke.kalc.pos.vouchers;

import java.util.Date;
 
/**
 *
 * @author John
 */
public class Voucher {

    protected String voucherID;
    protected Date issueDate;
    
    public Voucher(String voucherID){
        this.voucherID = voucherID;      
    }
    
    
}
