/**
 * 
 */
package org.huij.hsf.consumer.config;

import org.huij.hsf.api.service.MemberService;
import org.springframework.context.annotation.Configuration;

import com.alibaba.boot.hsf.annotation.HSFConsumer;

/**
 * @author Administrator
 *
 */
@Configuration
public class HsfConfig {

	 /**
	   * 版本接口，这里只需要一个注解，就完成了服务订阅，在使用的地方，直接@Autowired即可使用。
	   * 注意：配置方式订阅服务方式不需要写该注解
	   */
	  @HSFConsumer(serviceGroup="HSF",clientTimeout=3000,serviceVersion="1.0.0")
	  private MemberService memberService;
}
