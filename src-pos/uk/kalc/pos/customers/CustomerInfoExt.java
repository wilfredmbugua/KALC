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


package uk.kalc.pos.customers;

import java.util.Date;
import uk.kalc.format.Formats;
import uk.kalc.pos.util.RoundUtils;

public class CustomerInfoExt extends CustomerInfo {

    protected String taxcustomerid;
  
    public CustomerInfoExt(String id) {
        super(id);
    }

    public String getTaxCustCategoryID() {
        return taxcustomerid;
    }

    public void setTaxCustomerID(String taxcustomerid) {
        this.taxcustomerid = taxcustomerid;
    }

    public String printMaxDebt() {
        return Formats.CURRENCY.formatValue(RoundUtils.getValue(getMaxDebt()));
    }

    public String printDiscount() {
        return Formats.PERCENT.formatValue(RoundUtils.getValue(getCustomerDiscount()));
    }

    public String printCurDate() {
        return Formats.DATE.formatValue(getCurDate());
    }

    public String printCurDebt() {
        return Formats.CURRENCY.formatValue(RoundUtils.getValue(getCurrentDebt()));
    }

    public void updateCurDebt(Double amount, Date d) {

        currentDebt = currentDebt == null ? amount : currentDebt + amount;
        curDate = (new Date());

        if (RoundUtils.compare(currentDebt, 0.0) > 0) {
            if (curDate == null) {
                curDate = d;
            }
        } else if (RoundUtils.compare(currentDebt, 0.0) == 0) {
            currentDebt = 0.00;
            curDate = null;
        } else {
            curDate = null;
        }
    } 

}
