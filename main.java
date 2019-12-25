import Sweet.cake;
import Sweet.candy;
import Sweet.jellybean;
import Sweet.sweet;

public class main {
    public static void main(String[] args) {
        cake cake1 = new cake("pichenka",28.50,1.5,"black");
        candy candy1 = new candy("alenka",10.50,1.0,"oktyabr");
        jellybean jelly1 = new jellybean("marmeladka",20,1.2,"apple");

        sweet[] box = {cake1,candy1,jelly1};


        double sumPrice = 0;
        double sumWeight = 0;
        System.out.println("Состав подарка: ");
        for (int i=0;i < box.length;i++){
            if (sumPrice < sumPrice + box[i].getPrice()){
                sumPrice = sumPrice + box[i].getPrice();
            }
            if (sumWeight < sumWeight + box[i].getWeight()){
                sumWeight = sumWeight + box[i].getWeight();
            }
            System.out.println(box[i]);
        }
        System.out.println("Цена подарка = "+sumPrice);
        System.out.println("Вес подарка = "+sumWeight);

    }


}
