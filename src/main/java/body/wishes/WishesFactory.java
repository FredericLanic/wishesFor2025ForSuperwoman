package body.wishes;

import body.Me;
import body.MyInnerSelf;
import body.behavior.SuperWoman;
import body.success.GuaranteedSuccess;

public class WishesFactory {
    public static GuaranteedSuccess wishesFor2025() {
        MyInnerSelf myInnerSelf = Me::new;
        SuperWoman justMe = myInnerSelf.justMe();
        return justMe.useMyOwnSuperPowers();
    }
}
