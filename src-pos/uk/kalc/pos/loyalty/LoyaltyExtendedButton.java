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


package uk.kalc.pos.loyalty;

import javax.swing.JButton;
import uk.kalc.pos.ticket.ProductInfoExt;

/**
 *
 * @author john.lewis
 */
public class LoyaltyExtendedButton extends JButton {

        private int cardBalance;
        private ProductInfoExt product;

        public LoyaltyExtendedButton(String text) {
            super(text);
        }

         public LoyaltyExtendedButton(String text, int cardBalance) {
            super(text);
            this.cardBalance = cardBalance;
        }
        
        public LoyaltyExtendedButton(String text, int cardBalance, ProductInfoExt product) {
            super(text);
            this.cardBalance = cardBalance;
            this.product = product;
        }

        public int getCardBalance() {
            return cardBalance;
        }

        public void setCardBalance(int cardBalance) {
            this.cardBalance = cardBalance;
        }
    }
