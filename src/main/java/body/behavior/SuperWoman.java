package body.behavior;

import body.success.GuaranteedSuccess;

public interface SuperWoman {
     default GuaranteedSuccess useMyOwnSuperPowers() {
        return new GuaranteedSuccess();
    }
}
