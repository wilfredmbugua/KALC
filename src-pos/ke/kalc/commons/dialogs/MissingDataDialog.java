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


package ke.kalc.commons.dialogs;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

/**
 * @author John Lewis
 */
public class MissingDataDialog extends JDialog {

    private JPanel mainPanel;
    private JPanel logoPanel;
    private JPanel btnPanel;

    private Image img;
    private JTextArea contextArea;
    private JTextArea headerTextArea;
    private JLabel headerText;
    private JLabel iconLabel = new JLabel();

    private JSeparator separator = new JSeparator();
    private Font font;

    protected MissingDataDialog(Boolean showLogo, JPanel content, Boolean unDecorated) {
        super(new JFrame());
        //  separator.setOrientation(JSeparator.HORIZONTAL);
        infoDialog(showLogo, content, unDecorated);
        pack();
    }

    private void infoDialog(Boolean showLogo, JPanel content, Boolean unDecorated) {
        mainPanel = new JPanel(new MigLayout("insets 10 4 5 2"));
        btnPanel = new JPanel();

        if (showLogo) {
            logoPanel = new JPanel(new MigLayout("", "[500]"));
            ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/ke/kalc/fixedimages/kalclogo_small.png"));
            JLabel imageLabel = new JLabel(imageIcon);
            logoPanel.add(imageLabel, "align left");
            mainPanel.add(logoPanel, "wrap");
        }

        mainPanel.add(content,"width 500, wrap");
        
        
        //Set the dialog with no minimize or expand icons on title bar
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                dispose();
            }
        });

        setAlwaysOnTop(true);
        setResizable(false);
        setModal(true);
        setUndecorated(unDecorated);

        String laf = UIManager.getLookAndFeel().getClass().toString();
        if ((!UIManager.getLookAndFeel().getClass().toString().contains("com.jtattoo.plaf"))
                && (!UIManager.getLookAndFeel().getClass().toString().contains("com.alee.laf"))) {
            // removed border to undecorated dialog
            if (unDecorated) {
                logoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            }
        }

        getContentPane().add(mainPanel);

    }

}
