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


package ke.kalc.pos.giftcards;

import java.math.BigDecimal;

/**
 *
 * @author John Lewis
 */
public class GiftCardInfo {

    private String openingValue = "0.00";
    private String remainingValue = "0.00";
    private String redeemedValue = "0.00";

    public GiftCardInfo() {

    }

    public GiftCardInfo(String openingValue, String remainingValue, String redeemedValue) {
        this.openingValue = openingValue;
        this.remainingValue = remainingValue;
        this.redeemedValue = redeemedValue;
    }

    public String getOpeningValue() {
        return openingValue;
    }

    public void setOpeningValue(String openingValue) {
        this.openingValue = openingValue;
    }

    public String getRemainingValue() {
        return remainingValue;
    }

    public void setRemainingValue(String remainingValue) {
        this.remainingValue = remainingValue;
    }

    public String getRedeemedValue() {
        return redeemedValue;
    }

    public void setRedeemedValue(String redeemedValue) {
        this.redeemedValue = redeemedValue;
    }

    public void updateCardTransaction(String redeemedValue) {
        setRemainingValue((new BigDecimal(getRemainingValue())).subtract(new BigDecimal(redeemedValue)).toString());
        setRedeemedValue((new BigDecimal(getRedeemedValue())).add(new BigDecimal(redeemedValue)).toString());
    }

    public Boolean checkValue(String value) {
        return (new BigDecimal(getRemainingValue()).compareTo(new BigDecimal(value))) == -1;
    }

}
