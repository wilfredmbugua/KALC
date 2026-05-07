/*
**    KALC POS  - The New Dynamic Open Source POS
**
**    Copyright (c)2015-2021
**    
**    KALC and previous contributing parties (Unicenta & Openbravo)
**    http://www.kalc.co.uk
**
**    This file is part of KALC POS Version KALC V1.4.0
**    
**    (at your option) any later version.
**
**    KALC POS is distributed under proprietary license.
**    but WITHOUT ANY WARRANTY; without even the implied warranty of
**    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
**
**
**
**
*/

package uk.kalc.editor;

import uk.kalc.format.Formats;

/**
 *
 *   
 */
public class JEditorCurrency extends JEditorNumber {
    
	private static final long serialVersionUID = 5096754100573262803L;
	
	/** Creates a new instance of JEditorCurrency */
    public JEditorCurrency() {
    }
    
    /**
     *
     * @return
     */
        @Override
    protected Formats getFormat() {
        return Formats.CURRENCY;
    }

    /**
     *
     * @return
     */
        @Override
    protected int getMode() {
        return EditorKeys.MODE_DOUBLE;
    }  
}
