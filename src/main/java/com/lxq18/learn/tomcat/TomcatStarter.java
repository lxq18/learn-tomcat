package com.lxq18.learn.tomcat;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

/**
 * @author lxq
 * @create 2019/7/13 10:33
 */
public class TomcatStarter {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
//        Connector connector = new Connector("HTTP/1.10");
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(8080);
        tomcat.setConnector(connector);
        tomcat.start();
        tomcat.getServer().await();

    }
}
