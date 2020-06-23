package com.itheima.code.build;

import java.util.Map;

/**
 * @Author: qiuhang
 * @Description: ${description}
 * @Date: 2020/6/23 14:56
 */
public class EntityBuilder {
    /***
     * 构建Pojo
     * @param dataModel
     */
    public static void builder(Map<String,Object> dataModel){
        //生成Pojo层文件
        BuilderFactory.builder(dataModel,
                "/template/entity",
                TemplateBuilder.PACKAGE_ENTITY);
    }
}
