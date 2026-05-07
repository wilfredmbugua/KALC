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

import java.util.Timer;
import java.util.TimerTask;

public class Refresh {
		
	private Timer refreshTimer;
	//private TimerTask task;
        private Integer period = 10000;
        private Boolean running = false;
	
	private static Refresh INSTANCE = new Refresh();

        
	public static Refresh getInstance() {		
		if (INSTANCE == null){
			synchronized (Refresh.class){
				if (INSTANCE == null){
					INSTANCE = new Refresh();
				}
			}
		}			
		return INSTANCE;
	}
	
	public void pause(){
            if (running)
		refreshTimer.cancel();
                running = false;
	}
	
        public void stop(){                        
            if (running)
		refreshTimer.cancel();
                running = false;
        }
        
        public void start(TimerTask task){
            if (running)stop();
            refreshTimer = new Timer();
            refreshTimer.scheduleAtFixedRate(task,100, this.period);            
            running = true;
        }
               
        public void setTimer(TimerTask task, Integer period){
            if (running) stop();
            this.period = period;
            refreshTimer = new Timer();
            refreshTimer.scheduleAtFixedRate(task, 100, period);
            running = true;
	}		
      
        public Boolean isRunning(){
            return this.running;
        }
}

