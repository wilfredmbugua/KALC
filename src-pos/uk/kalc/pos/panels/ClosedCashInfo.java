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
package uk.kalc.pos.panels;

import java.util.Date;
import uk.kalc.basic.BasicException;
import uk.kalc.data.loader.DataRead;
import uk.kalc.data.loader.SerializableRead;

public class ClosedCashInfo implements SerializableRead {

    private static final long serialVersionUID = 9083257536541L;

    protected Date startDate;
    protected Date endDate;
    protected String host;
    protected Integer hostSequence;
    protected String moneyGuid;

    public ClosedCashInfo(Date startDate, Date endDate, String host, Integer hostSequence, String moneyGuid) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.host = host;
        this.hostSequence = hostSequence;
        this.moneyGuid = moneyGuid;
    }

    public ClosedCashInfo() {

    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getHost() {
        return host;
    }

    public Integer getHostSequence() {
        return hostSequence;
    }

    public String getMoneyGuid() {
        return moneyGuid;
    }

    @Override
    public void readValues(DataRead dr) throws BasicException {
        startDate = dr.getTimestamp(1);
        endDate = dr.getTimestamp(2);
        host = dr.getString(3);
        hostSequence = dr.getInt(4);
        moneyGuid = dr.getString(5);
    }

}
