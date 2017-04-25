package com.ztt.collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 如果这段代码好用，那它是tietuo.zhang写的
 * 如果不好用，我不知道是谁写的。
 *
 * @Description:
 * @Date: Created in 17:33 2017/4/25
 * @Modified by:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class collectionTest {

    @Test
    public void test() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<UserProjectPlan> list = new ArrayList<UserProjectPlan>();
        UserProjectPlan u = null;
        u = new UserProjectPlan();
        u.setLockEndTime(sdf.parse("2017-04-26"));
        u.setApplyEndMoney(100d);
        list.add(u);
        u = new UserProjectPlan();
        u.setLockEndTime(sdf.parse("2017-04-25"));
        u.setApplyEndMoney(200d);
        list.add(u);
        u = new UserProjectPlan();
        u.setLockEndTime(sdf.parse("2017-04-27"));
        u.setApplyEndMoney(100d);
        list.add(u);
        u = new UserProjectPlan();
        u.setLockEndTime(sdf.parse("2017-04-26"));
        u.setApplyEndMoney(50d);
        list.add(u);
        Collections.sort(list, new Comparator<UserProjectPlan>() {
            @Override
            public int compare(UserProjectPlan o1, UserProjectPlan o2) {
                if(o1.getLockEndTime().before(o2.getLockEndTime())) {
                    return -1;
                }else if (o1.getLockEndTime().equals(o2.getLockEndTime())){
                    if(o1.getApplyEndMoney() <= o2.getApplyEndMoney()) {
                        return -1;
                    }else {
                        return 1;
                    }
                }else{
                    return 1;
                }
            }
        });
    }
}
