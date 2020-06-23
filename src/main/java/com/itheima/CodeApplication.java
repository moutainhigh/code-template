package com.itheima;

import com.itheima.code.build.ControllerBuilder;
import com.itheima.code.build.TemplateBuilder;

/****
 * @Author:shenkunlin
 * @Description:
 * @Date 2019/6/14 23:43
 *****/
public class CodeApplication {

    public static void main(String[] args) {
        System.out.println(ControllerBuilder.class.getResource("/template/dao").getPath());
        System.out.println(System.getProperty("user.dir"));
        //调用该方法即可
        TemplateBuilder.builder();
    }
}
