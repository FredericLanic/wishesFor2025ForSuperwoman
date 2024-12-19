package app;

import body.success.GuaranteedSuccess;
import body.wishes.WishesFactory;

public class Main {

    public static void main(String... args) {
        GuaranteedSuccess guaranteedSuccess = WishesFactory.wishesFor2025();
        System.out.println(guaranteedSuccess);
    }

}
