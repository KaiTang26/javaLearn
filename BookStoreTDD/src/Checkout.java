public class Checkout {

    public double calculatePrice(Basket basket) {
        double result = 0;
        for(int i=0; i<basket.getBooksInBasket().size();i++){
            result += basket.getBooksInBasket().get(i).getPrice();
        }

        if(basket.getBooksInBasket().size()==3){
            result *= 0.99;
        }else if(basket.getBooksInBasket().size()==7){
            result *= 0.98;

        }


        return result;
    }
}
