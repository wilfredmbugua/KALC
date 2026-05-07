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


package ke.kalc.pos.printer.escpos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 *   
 */
public abstract class PrinterWritter {
    
    private boolean initialized = false;

    private ExecutorService exec;
    
    /**
     *
     */
    public PrinterWritter() {
        exec = Executors.newSingleThreadExecutor();
    }
    
    /**
     *
     * @param data
     */
    protected abstract void internalWrite(byte[] data);

    /**
     *
     */
    protected abstract void internalFlush();

    /**
     *
     */
    protected abstract void internalClose();
    
    /**
     *
     * @param data
     */
    public void init(final byte[] data) {
        if (!initialized) {
            write(data);
            initialized = true;
        }
    }
       
    /**
     *
     * @param sValue
     */
    public void write(String sValue) {
        write(sValue.getBytes());
    }

    /**
     *
     * @param data
     */
    public void write(final byte[] data) {
        exec.execute(new Runnable() {
            @Override
            public void run() {
                internalWrite(data);
            }
        });
    }
    
    /**
     *
     */
    public void flush() {
        exec.execute(new Runnable() {
            @Override
            public void run() {
                internalFlush();
            }
        });
    }
    
    /**
     *
     */
    public void close() {
        exec.execute(new Runnable() {
            @Override
            public void run() {
                internalClose();
            }
        });
        exec.shutdown();
    }
}
