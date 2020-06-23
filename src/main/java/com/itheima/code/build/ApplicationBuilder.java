package com.itheima.code.build;

import java.util.Map;

/**
 * @Author: qiuhang
 * @Description: ${description}
 * @Date: 2020/6/23 13:57
 */
public class ApplicationBuilder {
    /***
     * 构建Dao
     * @param modelMap
     */
    public static void builder(Map<String,Object> modelMap){
        //生成Dao层文件
        BuilderFactory.builder(modelMap,
                "/template",
                "Application.java",
                TemplateBuilder.PROJPACKAGE,
                "Application.java");
    }
}
