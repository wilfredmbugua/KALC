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


package uk.kalc.pos.util;

/**
*
* @author Xibergy Systems
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertyUtils {

    private Properties m_propsconfig;
    private File configFile;
    private final String APP_ID = "upos-app";

    /**
     *
     */
    public PropertyUtils() {
        init(getDefaultConfig());
    }

    private void init(File configfile) {
        this.configFile = configfile;
        load();
    }

    private File getDefaultConfig() {
        return new File(new File("./"), "kalc.properties");
    }

    private void load() {
        // Load Properties
        try {
            InputStream in = new FileInputStream(configFile);
            if (in != null) {
                m_propsconfig = new Properties();
                m_propsconfig.load(in);
                in.close();
            }
        } catch (IOException e) {
        }
    }

    /**
     *
     * @param sKey
     * @return
     */
    public String getProperty(String sKey) {
        return m_propsconfig.getProperty(sKey);
    }

    /**
     *
     * @return
     */
    public String getDriverName() {
        return m_propsconfig.getProperty("db.driver");
    }

    /**
     *
     * @return
     */
    public String getUrl() {
        return m_propsconfig.getProperty("db.URL");
    }

    /**
     *
     * @return
     */
    public String getDBUser() {
        return m_propsconfig.getProperty("db.user");
    }

    /**
     *
     * @return
     */
    public String getDBPassword() {
        String m_password = "[color=#FF0000]YourDBPassword[/color]";
        return m_password;
    }
}
