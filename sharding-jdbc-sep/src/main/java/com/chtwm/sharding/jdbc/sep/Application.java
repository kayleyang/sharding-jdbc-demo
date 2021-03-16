package com.chtwm.sharding.jdbc.sep;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Date: 2021/3/16
 * Time: 14:30
 *
 * @author: yangkai
 * EMail: yangkai01@chtwm.com
 */
@SpringBootApplication
@MapperScan(basePackages = "com.chtwm.sharding.jdbc.sep.mapper")
public class Application {
}
