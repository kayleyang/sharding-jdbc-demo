package com.chtwm.sharding.jdbc.sub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Date: 2021/3/16
 * Time: 14:10
 *
 * @author: yangkai
 * EMail: yangkai01@chtwm.com
 */

@SpringBootApplication
@MapperScan(basePackages = "com.chtwm.sharding.jdbc.sub.mapper")
public class Application {
}
