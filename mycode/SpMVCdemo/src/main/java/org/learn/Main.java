package org.learn;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Main {
    static void main() {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();
        String contextpath = "";
        String baseDoc = new File(System.getProperty("src/main/webapp")).getAbsolutePath();
        Context context = tomcat.addContext(contextpath,baseDoc);
        context.st
    }
}
