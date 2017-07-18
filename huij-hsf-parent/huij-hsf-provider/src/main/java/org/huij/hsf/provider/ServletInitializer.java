package org.huij.hsf.provider;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * 类似web.xml中初始化Spring上下文的监听器功能，这样就不用谢xml配置了
 * @author Jason
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StartupDemoApplication.class);
	}

}
