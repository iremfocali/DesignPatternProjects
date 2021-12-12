package SecondOne;

import SecondOne.Model.Currency;
import SecondOne.Model.Product;
import SecondOne.Model.Size;

import java.util.List;

import static SecondOne.Model.Currency.USD;

public class AmericaShopping implements Shopping {
    ITaxBehavior americaDutyTax;
    IBaseDeliveryBehavior americaBaseDelivery;
    ITaxBehavior additionalTax;
    public AmericaShopping() {
        americaDutyTax = new DutyTaxForAmerica();
        americaBaseDelivery = new BaseDeliveryFeeForAmerica();
        additionalTax = new AdditionalTax();
    }
    @Override
    public double calculatePrice(List<Product> products) {
        double adt = americaDutyTax.differentDutyTax(); // 1.01
        double abdf = americaBaseDelivery.differentBaseDeliveryFee(); // 15
        double at = additionalTax.differentDutyTax(); //1.0075

        double totalProductPrice = 0;
        double shippingfee = 0;
        double p = 0;

        for(int i = 0; i < products.size() ; i++){
            Size sproduct = products.get(i).getSize();
            double productPrice  = products.get(i).getPrice();
            if(sproduct == Size.XL)
            {
                shippingfee = 10.0;
            }
            else{
                shippingfee = 5.0;
            }
            p += shippingfee;
            p += productPrice*adt; // adt == 1.01
            totalProductPrice = p + abdf; //abdf == 15
        }
        return totalProductPrice*at; // at == 1.0075
    }

    @Override
    public Currency getCurrency() {
         return USD;
    }
}
