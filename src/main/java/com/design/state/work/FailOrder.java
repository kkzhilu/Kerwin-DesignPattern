package com.design.state.work;

import com.design.utils.CodeUtils;

import java.text.MessageFormat;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2019/7/26 17:34
 * description:  处理失败状态
 * version:      V1.0
 * ******************************
 */
public class FailOrder implements StateInterface {

    @Override
    public void doAction(Context context) {
        printCurrentState();

        System.out.println(MessageFormat.format("订单处理失败... 当前执行次数: {0}", context.getFailNum()));

        // 大于3次丢弃
        if (context.getFailNum() >= Context.FAIL_NUM) {
            context.setAbandon(true);
        }

        // 处理次数加 1
        context.setFailNum(context.getFailNum() + 1);

        // 指向处理状态
        context.setStateInterface(new HandleOrder());

        CodeUtils.spilt();
    }

    @Override
    public StateEnums getCurrentState() {
        return StateEnums.FAIL_ORDER;
    }
}
