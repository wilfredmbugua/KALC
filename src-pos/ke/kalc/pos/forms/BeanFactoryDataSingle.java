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


package ke.kalc.pos.forms;

import ke.kalc.data.loader.Session;

public abstract class BeanFactoryDataSingle implements BeanFactoryApp {
    
    /** Creates a new instance of BeanFactoryData */
    public BeanFactoryDataSingle() {
    }
    
    /**
     *
     * @param s
     */
    public abstract void init(Session s);

    /**
     *
     * @param app
     * @throws BeanFactoryException
     */
    @Override
    public void init(AppView app) throws BeanFactoryException {        
        init(app.getSession());                     
    }

    /**
     *
     * @return
     */
    @Override
    public Object getBean() {
        return this;
    }  
}
