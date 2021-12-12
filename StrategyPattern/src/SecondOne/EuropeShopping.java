package SecondOne;

import SecondOne.Model.Currency;
import SecondOne.Model.Product;
import SecondOne.Model.Size;

import java.util.List;

import static SecondOne.Model.Currency.EUR;

public class EuropeShopping implements Shopping {
    ITaxBehavior europeDutyTax;
    IBaseDeliveryBehavior europeBaseDelivery;
    public EuropeShopping() {
        europeDutyTax = new DutyTaxForEurope();
        europeBaseDelivery = new BaseDeliveryFeeForEurope();
    }
    @Override
    public double calculatePrice(List<Product> products) {
        double edt = europeDutyTax.differentDutyTax(); //1.015
        double ebdf = europeBaseDelivery.differentBaseDeliveryFee(); //11
        double p = 0;
        double totalProductPrice = 0;
        double shippingfee = 0;

        for(int i = 0; i < products.size() ; i++){
            Size sproduct = products.get(i).getSize();
            double productPrice  = products.get(i).getPrice();
            if(sproduct == Size.XL)
            {
                shippingfee += 10.0;
            }

            p += shippingfee;
            p += productPrice*edt; // edt == 1.015
            totalProductPrice = p + ebdf; //ebdf == 11
        }
        return totalProductPrice;
    }

    @Override
    public Currency getCurrency() {
        return EUR;
    }

}
