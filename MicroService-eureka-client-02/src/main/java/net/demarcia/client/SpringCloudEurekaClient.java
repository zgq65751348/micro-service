/**
* @Title: SpringCloudEurekaClient.java
* @Package net.demarcia.client
* @Description: TODO
* @author 墨茗琦妙
* @date 2019年11月1日
* @version V1.0
*/
package net.demarcia.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * <p>@ClassName: SpringCloudEurekaClient</p>
 * <p>@version 1.0</p>
 * <p>@Description: </p>
 * </p>
 * windows 7  旗舰版
 * 
 * @author 墨茗琦妙
 * @since 2019年11月1日 下午1:49:51
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClient {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClient.class, args);

	}

}
