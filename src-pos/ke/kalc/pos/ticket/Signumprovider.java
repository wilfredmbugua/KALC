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

import java.util.HashSet;
import java.util.Set;

/**
 *
 *   
 */
public class Signumprovider {
    
    private Set m_positives = new HashSet();
    private Set m_negatives = new HashSet();
    
    /** Creates a new instance of Signumprovider */
    public Signumprovider() {
    }
    
    /**
     *
     * @param key
     */
    public void addPositive(Object key) {
        m_positives.add(key);
    }
    
    /**
     *
     * @param key
     */
    public void addNegative(Object key) {
        m_negatives.add(key);
    }
    
    /**
     *
     * @param key
     * @param value
     * @return
     */
    public Double correctSignum(Object key, Double value) {
        if (m_positives.contains(key)) {
            return value.doubleValue() < 0.0 ? Double.valueOf(-value.doubleValue()) : value;
        } else if (m_negatives.contains(key)) {
            return value.doubleValue() > 0.0 ? Double.valueOf(-value.doubleValue()) : value;
        } else {
            return value;
        }        
    }    
}
