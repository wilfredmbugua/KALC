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

package ke.kalc.editor;


public class JEditorStringNumber extends JEditorText {
    
    /** Creates a new instance of JEditorStringNumber */
    public JEditorStringNumber() {
        super();
    }
    
    /**
     *
     * @return
     */
    protected int getMode() {
        return EditorKeys.MODE_INTEGER_POSITIVE;
    }

    /**
     *
     * @return
     */
    protected int getStartMode() {
        return MODE_123;
    }    
}
