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

import java.awt.Component;

/**
 *
 *   
 */
public interface EditorComponent {
    
    /**
     *
     * @param ed
     */
    public void addEditorKeys(EditorKeys ed);    

    /**
     *
     * @return
     */
    public Component getComponent();
    
    /**
     *
     */
    public void deactivate();

    /**
     *
     * @param c
     */
    public void typeChar(char c);

    /**
     *
     * @param c
     */
    public void transChar(char c);
}
