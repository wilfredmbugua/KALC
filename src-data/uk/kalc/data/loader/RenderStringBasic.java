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


package uk.kalc.data.loader;

import uk.kalc.format.Formats;


public class RenderStringBasic implements IRenderString {
    
    private Formats[] m_aFormats;
    private int[] m_aiIndex;
    
    /** Creates a new instance of StringnizerBasic
     * @param fmts
     * @param aiIndex */
    public RenderStringBasic(Formats[] fmts, int[] aiIndex) {
        m_aFormats = fmts; 
        m_aiIndex = aiIndex;
    }

    /**
     *
     * @param value
     * @return
     */
    public String getRenderString(Object value) {
        
        if (value == null) {
            return null; 
        } else {
            Object [] avalue = (Object[]) value;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < m_aiIndex.length; i++) {
                if (i > 0) {
                    sb.append(" - ");
                }
                sb.append(m_aFormats[m_aiIndex[i]].formatValue(avalue[m_aiIndex[i]]));
            }
            
            return sb.toString();
        }
    }  
   
}
