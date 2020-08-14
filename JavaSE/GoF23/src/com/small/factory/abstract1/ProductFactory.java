package com.small.factory.abstract1;

/**
 * 抽象产品工厂
 * @author smallYJ
 */
public interface ProductFactory {
    /**
     * 生产手机
     * @return
     */
    IphoneProduct iphoneProduct();

    /**
     * 生产路由器
     * @return
     */
    IRouterProduct routerProduct();


}
