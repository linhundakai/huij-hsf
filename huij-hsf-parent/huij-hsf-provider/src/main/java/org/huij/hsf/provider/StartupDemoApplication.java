package org.huij.hsf.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//导入HSF配置文件
@SpringBootApplication
@MapperScan("org.huij.hsf.provider.mapper")
public class StartupDemoApplication {

	public static void main(String[] args) {
		//启动服务
		SpringApplication.run(StartupDemoApplication.class, args);
	}
}
