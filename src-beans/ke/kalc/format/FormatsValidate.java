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


package ke.kalc.format;

import java.text.ParseException;

/**
 *
 *   
 */
public class FormatsValidate extends Formats {
    
    private Formats m_fmt;
    private FormatsConstrain[] m_aConstrains;
    
    /** Creates a new instance of FormatsValidate
     * @param fmt
     * @param constrains */
    public FormatsValidate(Formats fmt, FormatsConstrain[] constrains) {
        m_fmt = fmt;
        m_aConstrains = constrains;
    }
    /** Creates a new instance of FormatsValidate
     * @param fmt */
    public FormatsValidate(Formats fmt) {
        this(fmt, new FormatsConstrain[0]);
    }
    /** Creates a new instance of FormatsValidate
     * @param fmt
     * @param constrain */
    public FormatsValidate(Formats fmt, FormatsConstrain constrain) {
        this(fmt, new FormatsConstrain[]{constrain});
    }
    
    /**
     *
     * @param value
     * @return
     */
    @Override
    protected String formatValueInt(Object value) {
        return m_fmt.formatValueInt(value);
    }

    /**
     *
     * @param value
     * @return
     * @throws ParseException
     */
    @Override
    protected Object parseValueInt(String value) throws ParseException {
        // Primero obtenemos el valor        
        Object val = m_fmt.parseValueInt(value);        
        for (int i = 0; i < m_aConstrains.length; i++) {
            val = m_aConstrains[i].check(val);
        }
        
        return val;
    }

    /**
     *
     * @return
     */
    @Override
    public int getAlignment() {
        return m_fmt.getAlignment();
    }
}
