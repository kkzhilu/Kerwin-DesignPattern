package com.design.state.work;

import com.design.utils.CodeUtils;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/7/26 12:54
 * description:  对应状态 - 处理订单
 * version:      V1.0
 * ******************************
 */
public class HandleOrder implements StateInterface {

    @Override
    public void doAction(Context context) {
        printCurrentState();

        // do somethings
        int num = (int) (Math.random() * 11);
        if (num >= 8) {
            System.out.println("处理订单完成, 进入成功状态...");
            context.setStateInterface(new SuccessOrder());
        } else {
            System.out.println("处理订单失败, 进入失败状态...");
            context.setStateInterface(new FailOrder());
        }

        CodeUtils.spilt();
    }

    @Override
    public StateEnums getCurrentState() {
        return StateEnums.HANDLE_ORDER;
    }
}
