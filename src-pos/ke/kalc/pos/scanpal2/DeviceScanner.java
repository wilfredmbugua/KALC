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


package ke.kalc.pos.scanpal2;

/**
 *
 *   
 */
public interface DeviceScanner {

    /**
     *
     * @throws DeviceScannerException
     */
    public void connectDevice() throws DeviceScannerException;

    /**
     *
     */
    public void disconnectDevice();

    /**
     *
     * @throws DeviceScannerException
     */
    public void startDownloadProduct() throws DeviceScannerException;

    /**
     *
     * @return
     * @throws DeviceScannerException
     */
    public ProductDownloaded recieveProduct() throws DeviceScannerException;
    
    /**
     *
     * @throws DeviceScannerException
     */
    public void startUploadProduct() throws DeviceScannerException;

    /**
     *
     * @param sName
     * @param sCode
     * @param dPrice
     * @throws DeviceScannerException
     */
    public void sendProduct(String sName, String sCode, Double dPrice) throws DeviceScannerException;

    /**
     *
     * @throws DeviceScannerException
     */
    public void stopUploadProduct() throws DeviceScannerException;    
}
