package com.small.factory.simple;

/**
 * @author smallYJ
 * 开闭原则
 * 静态工厂模式
 * 新增一个新的产品,如果你不修改,做不到
 */
public class CarFactory {
    /** 如果现在要加入大众,方式一:修改代码,增加if
     * @param car
     * @return
     */
    public static Car getCar(String car){
        if (car.equals("五菱")){
            return new WuLing();
        } else if (car.equals("特斯拉")){
            return new Tesla();
        } else {
            return null;
        }
    }

    /**
     * 方法二
     * @return
     */
    public static Car getDaZhong(){
        return new DaZhong();
    }
}
