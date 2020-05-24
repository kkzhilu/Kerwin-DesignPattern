package com.design.factory.simplefactory;

import com.design.factory.bean.AMDCpu;
import com.design.factory.bean.AbstractCPU;
import com.design.factory.bean.IntelCpu;

/**
 * ******************************
 * author：      Kerwin
 * createTime:   2020/5/24 10:26
 * description:  Static静态工厂 If方式 | Switch方式
 * version:      V1.0
 * ******************************
 */
public class SimpleFactory {

    public static AbstractCPU createCpu (String type) {
        switch (type) {
            case "INTEL":
                return new IntelCpu();
            default:
                return new AMDCpu();
        }

       /* if ("INTEL".equals(type)) {
            return new IntelCpu();
        } else if ("AMD".equals(type)){
            return new AMDCpu();
        }
        return null;*/
    }
}
