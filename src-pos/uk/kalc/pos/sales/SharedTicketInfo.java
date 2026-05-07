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


package uk.kalc.pos.sales;

import uk.kalc.basic.BasicException;
import uk.kalc.data.loader.DataRead;
import uk.kalc.data.loader.DataWrite;
import uk.kalc.data.loader.SerializableRead;
import uk.kalc.data.loader.SerializableWrite;

public class SharedTicketInfo implements SerializableRead, SerializableWrite {

    private static final long serialVersionUID = 7640633837719L;
    private String id;
    private String name;
    private String userName;
    private String customerName;
    private String loyalty;
    private String pickupBarcode;
    private CustomerDeliveryInfo deliveryInfo;

    /**
     * Creates a new instance of SharedTicketInfo
     */
    public SharedTicketInfo() {
    }

    /**
     *
     * @param dr
     * @throws BasicException
     */
    @Override
    public void readValues(DataRead dr) throws BasicException {
        id = dr.getString(1);
        name = dr.getString(2);
        userName = dr.getString(3);
        customerName = dr.getString(4);
        loyalty = dr.getString(5);
        pickupBarcode = dr.getString(6);
     //   deliveryInfo = (CustomerDeliveryInfo) dr.getObject(7);
    }

    /**
     *
     * @param dp
     * @throws BasicException
     */
    @Override
    public void writeValues(DataWrite dp) throws BasicException {
        dp.setString(1, id);
        dp.setString(2, name);
        dp.setString(3, userName);
        dp.setString(4, customerName);
        dp.setString(5, loyalty);
        dp.setString(6, pickupBarcode);
        dp.setObject(7, deliveryInfo);
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getAppUser() {
        return userName;
    }

    /**
     *
     * @return
     */
    public String getCustomerName() {
        return customerName;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public String getPickupBarcode() {
        return pickupBarcode;
    }

    public CustomerDeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }
}
