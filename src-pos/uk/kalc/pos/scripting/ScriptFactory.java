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


public class ScriptFactory {
    
    /**
     *
     */
    public static final String VELOCITY = "velocity";

    /**
     *
     */
    public static final String BEANSHELL = "beanshell";

    /**
     *
     */
    public static final String RHINO = "rhino";
    
    /** Creates a new instance of ScriptFactory */
    private ScriptFactory() {
    }
    
    /**
     *
     * @param name
     * @return
     * @throws ScriptException
     */
    public static ScriptEngine getScriptEngine(String name) throws ScriptException {
        switch (name) {
            case VELOCITY:
                return new ScriptEngineVelocity();
            case BEANSHELL:
                return new ScriptEngineBeanshell();
            default:
                throw new ScriptException("Script engine not found: " + name);
        }
    }    
}
