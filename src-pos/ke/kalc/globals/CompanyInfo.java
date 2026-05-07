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
package ke.kalc.globals;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author John
 */
public class CompanyInfo {

    public CompanyInfo() {

    }

    public String getName() {
        try {
            return new String(Company.NAME.getBytes("UTF-8"), "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            return Company.NAME;
        }
    }

    public String getAddressLine1() {
        return Company.ADDRESSLINE1;
    }

    public String getAddressLine2() {
        return Company.ADDRESSLINE2;
    }

    public String getAddressLine3() {
        return Company.ADDRESSLINE3;
    }

    public String getPostcode() {
        return Company.POSTCODE;
    }

    public String getTaxNumber() {
        return Company.TAXNUMBER;
    }

    public String getPhoneNumber() {
        return Company.PHONENUMBER;
    }

    public String getEmailAddr() {
        return Company.EMAILADDR;
    }

    public String getWebSite() {
        return Company.WEBSITE;
    }

    public String getRegisationNumber() {
        return Company.REGISTRATIONNUMBER;
    }

}
