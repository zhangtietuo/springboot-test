package com.ztt.collections;

import java.util.Date;

/**
 * 如果这段代码好用，那它是tietuo.zhang写的
 * 如果不好用，我不知道是谁写的。
 *
 * @Description:
 * @Date: Created in 17:34 2017/4/25
 * @Modified by:
 */
public class UserProjectPlan {

    private Date lockEndTime;

    private Double applyEndMoney;

    public Date getLockEndTime() {
        return lockEndTime;
    }

    public void setLockEndTime(Date lockEndTime) {
        this.lockEndTime = lockEndTime;
    }

    public Double getApplyEndMoney() {
        return applyEndMoney;
    }

    public void setApplyEndMoney(Double applyEndMoney) {
        this.applyEndMoney = applyEndMoney;
    }
}
