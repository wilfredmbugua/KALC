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


package uk.kalc.pos.panels;

import java.math.BigDecimal;
import java.math.RoundingMode;
import uk.kalc.basic.BasicException;
import uk.kalc.data.loader.DataRead;
import uk.kalc.data.loader.SerializerRead;

/**
 *
 * @author John
 */
public class UserSales {
    
    private String userName;
    private Double userSales;
    
    public UserSales(String userName, Double userSales){
        this.userName = userName;
        this.userSales = userSales;
    }
    
    public String getUserName(){
        return userName;
    }
       
    public String getUserSales() {
        BigDecimal bd = new BigDecimal(userSales);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.toString();
    }
    
    public static SerializerRead getSerializerRead() {
        return new SerializerRead() {
            @Override
            public Object readValues(DataRead dr) throws BasicException {
                String userName = dr.getString(1);
                Double userSales = dr.getDouble(2);
                return new UserSales(userName, userSales);
            }
        };
    }
    
}
