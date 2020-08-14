package com.small.factory.abstract1;

/**
 * @author smallYJ
 */
public class XiaomiFactory implements ProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiIphone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new XiaomiRouter();
    }
}
