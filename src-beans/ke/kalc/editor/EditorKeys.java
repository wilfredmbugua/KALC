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

/**
 *
 *   
 */
public interface EditorKeys {
    
    /**
     *
     */
    public final static int MODE_STRING = 0;

    /**
     *
     */
    public final static int MODE_DOUBLE = 1;

    /**
     *
     */
    public final static int MODE_DOUBLE_POSITIVE = 2;

    /**
     *
     */
    public final static int MODE_INTEGER = 3;

    /**
     *
     */
    public final static int MODE_INTEGER_POSITIVE = 4;
    
    /**
     *
     * @param e
     * @param imode
     */
    public void setActive(EditorComponent e, int imode);

    /**
     *
     * @param e
     */
    public void setInactive(EditorComponent e);
}
