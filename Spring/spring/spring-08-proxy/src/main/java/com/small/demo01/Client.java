package com.small.demo01;

/**
 * @author smallYJ
 */
public class Client {
    public static void main(String[] args) {
//        Host host = new Host();
//        host.rent();

        //房东要租房了
        Host host = new Host();

        //代理,中介帮房东租房子,但是中介会有一些附属操作
        Proxy proxy = new Proxy(host);
        //不用面对房东,直接找中介
        proxy.rent();

    }
}
