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

public interface AppUserView {

    public static final String ACTION_TASKNAME = "taskname";

    public AppUser getUser(); 

    public void showTask(String sTaskClass);

    public void executeTask(String sTaskClass);
}
