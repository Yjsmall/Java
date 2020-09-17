package com.small.demo01;

import org.w3c.dom.html.HTMLObjectElement;

/**
 * @author smallYJ
 */
public class Proxy {
    private Host host;

    public Proxy(){
    }

    public Proxy(Host host){
        this.host = host;
    }

    /**
     * 租房
     */
    public void rent(){
        seeHouse();
        host.rent();
        contract();
        fee();
    }

    /**
     * 看房
     */
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    /**
     * 签合同
     */
    public void contract(){
        System.out.println("签租合同");
    }

    /**
     * 收中介费
     */
    public void fee(){
        System.out.println("收中介费");
    }
}
