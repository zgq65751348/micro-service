/**
* @Title: SpringCloudEurekaServerApplication.java
* @Package net.demarcia.server
* @Description: TODO
* @author 墨茗琦妙
* @date 2019年11月1日
* @version V1.0
*/
package net.demarcia.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 * <p>@ClassName: SpringCloudEurekaServerApplication</p>
 * <p>@version 1.0</p>
 * <p>@Description: </p>
 * </p>
 * windows 7  旗舰版
 * 
 * @author 墨茗琦妙
 * @since 2019年11月1日 上午11:22:30
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServerApplication10012 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerApplication10012.class, args);
	}

}
