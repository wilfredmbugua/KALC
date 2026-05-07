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


package ke.kalc.pos.ticket;

import ke.kalc.basic.BasicException;
import ke.kalc.data.loader.DataRead;
import ke.kalc.data.loader.IKeyed;
import ke.kalc.data.loader.SerializerRead;
import ke.kalc.format.Formats;


public class SalesDetailInfo_1 implements IKeyed {

    private static final long serialVersionUID = 8612449444103L;
    private String productName;
    private int lineNO;

    /**
     *
     * @return
     */
    public int getLineNO() {
        return lineNO;
    }

    /**
     *
     * @param lineNO
     */
    public void setLineNO(int lineNO) {
        this.lineNO = lineNO;
    }
    
    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }
    
    /**
     *
     * @return
     */
    public String printPrice() {
        return Formats.CURRENCY.formatValue(price);
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    private double price;

    /** Creates new CategoryInfo
     * @param lineNo
     * @param productName
     * @param price */
    public SalesDetailInfo_1(int lineNo, String productName, double price) {
        this.lineNO = lineNo;
        this.productName = productName;
        this.price = price;
    }

    /**
     *
     * @return
     */
    public static SerializerRead getSerializerRead() {
        return new SerializerRead() {@Override
 public Object readValues(DataRead dr) throws BasicException {
            return new SalesDetailInfo(dr.getInt(1), dr.getString(2), dr.getDouble(3));
        }};
    }

    /**
     *
     * @return
     */
    @Override
    public Object getKey() {
       return getLineNO();
    }
}