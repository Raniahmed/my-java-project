package classes;

public class GiftCardMain {
    public static void main(String[] args) {

        GiftCard bestBuy = new GiftCard(true);

        System.out.println(bestBuy.getBalance());
        System.out.println(bestBuy.isActivated());

        // put money on the card
        bestBuy.loadCard(100);

        System.out.println(bestBuy.getBalance());

        bestBuy.loadCard(400);

        System.out.println(bestBuy.getBalance());

        bestBuy.purchase(100);
        System.out.println(bestBuy.getBalance());

    }
}
