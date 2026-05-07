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


package ke.kalc.pos.scale;

import java.awt.Component;
import ke.kalc.beans.JNumberDialog;
import ke.kalc.globals.IconFactory;
import ke.kalc.pos.forms.AppLocal;


public class ScaleDialog implements Scale {

    private Component parent;

    /**
     *
     * @param parent
     */
    public ScaleDialog(Component parent) {
        this.parent = parent;
    }

    /**
     *
     * @return
     * @throws ScaleException
     */
    @Override
    public Double readWeight() throws ScaleException {

        return JNumberDialog.showEditNumber(parent, AppLocal.getIntString("label.scale"), AppLocal.getIntString("label.scaleinput"), IconFactory.getIcon("ark2.png"));
    }
}
