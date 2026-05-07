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


package uk.kalc.pos.forms;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import uk.kalc.globals.IconFactory;

public class MenuPanelAction extends AbstractAction {

    private final AppView m_App;
    private final String m_sMyView;

    /**
     * Creates a new instance of MenuPanelAction
     *
     * @param app
     * @param icon
     * @param keytext
     * @param sMyView
     */
    public MenuPanelAction(AppView app, String icon, String keytext, String sMyView) {
        //  putValue(Action.SMALL_ICON, new ImageIcon(JPrincipalApp.class.getResource(icon)));

        if (icon.lastIndexOf("/") > 0) {
            icon = icon.substring(icon.lastIndexOf("/") + 1);
        }
        putValue(Action.SMALL_ICON, IconFactory.getIcon(icon));
        putValue(Action.NAME, AppLocal.getIntString(keytext));
        putValue(AppUserView.ACTION_TASKNAME, sMyView);
        m_App = app;
        m_sMyView = sMyView;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {

        m_App.getAppUserView().showTask(m_sMyView);
    }
}
