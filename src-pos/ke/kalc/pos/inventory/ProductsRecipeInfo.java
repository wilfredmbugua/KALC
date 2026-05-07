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


package ke.kalc.pos.inventory;

import ke.kalc.basic.BasicException;
import ke.kalc.data.loader.DataRead;
import ke.kalc.data.loader.SerializerRead;

public class ProductsRecipeInfo {
    private static final long serialVersionUID = 7587646873036L;
    
    protected String id;
    protected String productId;
    protected String productKitId;
    protected Double quantity;
    protected Boolean isManaged;

    /**
     * 
     * @param id
     * @param product
     * @param productKit
     * @param quantity 
     */
    public ProductsRecipeInfo(String id, String productId, String productKitId, Double quantity, Boolean isManaged) {
        this.id = id;
        this.productId = productId;
        this.productKitId = productKitId;
        this.quantity = quantity;
        this.isManaged = isManaged;
    }
    

    public void setM_ID(String id) {
        this.id = id;
    }

    public void setM_sProduct(String productId) {
        this.productId = productId;
    }

    public void setM_sProductKit(String productKitId) {
        this.productKitId = productKitId;
    }

    public void setM_dQuantity(Double m_dQuantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductKitId() {
        return productKitId;
    }

    public Double getQuantity() {
        return quantity;
    }
    
    public Boolean isManaged(){
        return isManaged;
    }
    
    public static SerializerRead getSerializerRead() {
        return new SerializerRead() {
            @Override
            public Object readValues(DataRead dr) throws BasicException {
                return new ProductsRecipeInfo(dr.getString(1), dr.getString(2), dr.getString(3), dr.getDouble(4), dr.getBoolean(5));
        }};
    }
    
}
