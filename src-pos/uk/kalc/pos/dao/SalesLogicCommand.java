/*
**    KALC Administration  - Open Source Point of Sale
**
**    This file is part of KALC Administration Version KALC V1.5.0
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
package uk.kalc.pos.dao;

import uk.kalc.basic.BasicException;
import uk.kalc.data.loader.Datas;
import uk.kalc.data.loader.SentenceExec;
import uk.kalc.data.loader.SerializerWriteBasic;
import uk.kalc.data.loader.Session;
import uk.kalc.data.loader.SessionFactory;
import uk.kalc.data.loader.StaticSentence;

/**
 *
 * @author John
 */
public class SalesLogicCommand {

    protected static Session session  = SessionFactory.getSession();
    protected SentenceExec lineRemoved;

    public void init() {
        
        lineRemoved = new StaticSentence(session,
                "insert into lineremoved (id, name, terminalid, ticketid, description, productid, productname, units, value) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?)",
                new SerializerWriteBasic(new Datas[]{Datas.STRING, Datas.STRING, Datas.STRING, Datas.STRING, Datas.STRING, Datas.STRING, Datas.STRING, Datas.DOUBLE, Datas.DOUBLE}));

    }

    
    public final void execLineRemoved(Object[] line) {
        try {
            lineRemoved.exec(line);
        } catch (BasicException e) {
        }
    }
}
