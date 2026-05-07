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

import uk.kalc.data.user.BrowsableEditableData;

public class CustomerInfoGlobal {

    private static CustomerInfoGlobal INSTANCE;
    private CustomerInfoExt customerInfoExt;
    private BrowsableEditableData editableData;

    private CustomerInfoGlobal() {
    }

    public static CustomerInfoGlobal getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerInfoGlobal();
        }

        return INSTANCE;
    }

    public CustomerInfoExt getCustomerInfoExt() {
        return customerInfoExt;
    }


    public void setCustomerInfoExt(CustomerInfoExt customerInfoExt) {
        this.customerInfoExt = customerInfoExt;
    }


    public BrowsableEditableData getEditableData() {
        return editableData;
    }

    public void setEditableData(BrowsableEditableData editableData) {
        this.editableData = editableData;
    }

}
