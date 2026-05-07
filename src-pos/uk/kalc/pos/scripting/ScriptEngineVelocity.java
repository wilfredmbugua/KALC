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


package uk.kalc.pos.scripting;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
//import org.apache.velocity.VelocityContext;
//import org.apache.velocity.app.VelocityEngine;
//import org.apache.velocity.exception.MethodInvocationException;
//import org.apache.velocity.exception.ParseErrorException;
//import org.apache.velocity.tools.generic.directive.Ifnotnull;
import uk.kalc.pos.forms.AppView;

class ScriptEngineVelocity implements ScriptEngine {

    private static VelocityEngine m_ve = null;

    private VelocityContext c = null;
    private AppView m_App;

    /**
     * Creates a new instance of ScriptEngineVelocity
     */
    public ScriptEngineVelocity() throws ScriptException {

        if (m_ve == null) {
            // Inicializo Velocity
            m_ve = new VelocityEngine();
            // ve.setProperty(VelocityEngine.RUNTIME_LOG_LOGSYSTEM, this);

            //        m_ve.setProperty(VelocityEngine.RESOURCE_LOADER, "class");
            //        // m_ve.setProperty("class.resource.loader.description", "Velocity Classpath Resource Loader");
            //        // m_ve.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
            //        m_ve.setProperty("class.resource.loader.class", "uk.kalc.pos.forms.SystemResourceLoader");
            //        m_ve.setProperty("class.resource.loader.description", "Velocity Resource Loader");
            //        m_ve.setProperty("class.resource.loader.appresources", this);
            
            
           //m_ve.setProperty(VelocityEngine.RUNTIME_LOG_LOGSYSTEM_CLASS, "org.apache.velocity.runtime.log.NullLogSystem");
            m_ve.setProperty(VelocityEngine.ENCODING_DEFAULT, "UTF-8");
            m_ve.setProperty(VelocityEngine.INPUT_ENCODING, "UTF-8");
           
         //   m_ve.setProperty("userdirective", "org.apache.velocity.tools.generic.directive.Ifnotnull");
            try {
                m_ve.init();
            } catch (Exception e) {
                throw new ScriptException("Cannot initialize Velocity Engine", e);
            }
        }
        c = new VelocityContext();
    }

    @Override
    public void put(String key, Object value) {
        c.put(key, value);
    }

    @Override
    public Object get(String key) {
        return c.get(key);
    }

    @Override
    public Object eval(String src) throws ScriptException {
        if (m_ve == null) {
            throw new ScriptException("Velocity engine not initialized.");
        } else {
            Writer w = new StringWriter();
            try {
                if (m_ve.evaluate(c, w, "log", new StringReader(src))) {
                    return w.toString();
                } else {
                    throw new ScriptException("Velocity engine unexpected error.");
                }
            } catch (ParseErrorException e) {
                throw new ScriptException(e.getMessage(), e);
            } catch (MethodInvocationException e) {
                throw new ScriptException(e.getMessage(), e);
            } catch (Exception e) {
                throw new ScriptException(e.getMessage(), e);
            }
        }
    }
}
