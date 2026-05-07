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


package uk.kalc.pos.ticket;

import uk.kalc.basic.BasicException;
import uk.kalc.data.loader.Vectorer;
import uk.kalc.format.Formats;
import uk.kalc.pos.forms.AppLocal;

public class ProductVectorer implements Vectorer {
    
    private static String[] m_sHeaders = {
        AppLocal.getIntString("label.prodref"),
        AppLocal.getIntString("label.prodbarcode"),
        AppLocal.getIntString("label.prodname"),
        AppLocal.getIntString("label.prodpricebuy"),
        AppLocal.getIntString("label.prodpricesell")
    };
    
    /** Creates a new instance of ProductVectorer */
    public ProductVectorer() {
    }
    
    /**
     *
     * @return
     * @throws BasicException
     */
    public String[] getHeaders() throws BasicException {
        return m_sHeaders;
    }

    /**
     *
     * @param obj
     * @return
     * @throws BasicException
     */
    public String[] getValues(Object obj) throws BasicException {   
        ProductInfoExt myprod = (ProductInfoExt) obj;
        String[] m_sValues = new String[5];
        m_sValues[0] = Formats.STRING.formatValue(myprod.getReference());
        m_sValues[1] = Formats.STRING.formatValue(myprod.getCode());
        m_sValues[2] = Formats.STRING.formatValue(myprod.getName());
        m_sValues[3] = Formats.CURRENCY.formatValue(Double.valueOf(myprod.getPriceBuy()));
        m_sValues[4] = Formats.CURRENCY.formatValue(Double.valueOf(myprod.getPriceSell()));     
        return m_sValues;
    }
}
