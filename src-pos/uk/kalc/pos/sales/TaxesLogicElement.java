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

import java.util.ArrayList;
import java.util.List;
import uk.kalc.pos.ticket.TaxInfo;


public class TaxesLogicElement {
    
    private TaxInfo tax;
    private List<TaxesLogicElement> taxsons;
    
    /**
     *
     * @param tax
     */
    public TaxesLogicElement(TaxInfo tax) {
        this.tax = tax;       
        this.taxsons = new ArrayList<>();
    }
    
    /**
     *
     * @return
     */
    public TaxInfo getTax() {
        return tax;
    }
    
    /**
     *
     * @return
     */
    public List<TaxesLogicElement> getSons() {
        return taxsons;
    }
}
