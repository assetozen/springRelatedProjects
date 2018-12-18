package com.assegd.SpringAnno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // is added because this class is reponsible for configuration and to give the objects
@ComponentScan(basePackages="com.assegd.SpringAnno")
public class AppConfig {

}
