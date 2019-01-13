/**   
 * @Title: RedisConfig.java 
 * @Package com.boot.microservice 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author [tianpei] 
 * @date 2019年1月10日 下午2:38:47 
 * @version V1.0   
 */
package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2019年1月10日]
 * @package com.boot.microservice
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2019年1月10日|tianpei|新增|RedisConfig.java新增
 */
@Configuration
public class RedisConfig {

	/**
	 * 实例化 RedisTemplate 对象
	 *
	 * @return
	 */
	@Bean
	public RedisTemplate<String, Object> functionDomainRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
		initDomainRedisTemplate(redisTemplate, redisConnectionFactory);
		return redisTemplate;
	}

	/**
	 * 设置数据存入 redis 的序列化方式,并开启事务
	 *
	 * @param redisTemplate
	 * @param factory
	 */
	private void initDomainRedisTemplate(RedisTemplate<String, Object> redisTemplate, RedisConnectionFactory factory) {
		//如果不配置Serializer，那么存储的时候缺省使用String，如果用User类型存储，那么会提示错误User can't cast to String！
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
		redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
		// 开启事务
//		redisTemplate.setEnableTransactionSupport(true);
//		redisTemplate.setConnectionFactory(factory);
	}

	/**
	 * 注入封装RedisTemplate
	 *
	 */
	@Bean(name = "redisUtil")
	public RedisUtil redisUtil(RedisTemplate<String, Object> redisTemplate) {
		RedisUtil redisUtil = new RedisUtil();
		redisUtil.setRedisTemplate(redisTemplate);
		return redisUtil;
	}
	class RedisUtil {
		
		RedisTemplate<String, Object> redisTemplate;
		
		/**
		 * 普通缓存获取
		 * @param key 键
		 * @return 值
		 */
		public Object get(String key){
			return key==null?null:redisTemplate.opsForValue().get(key);
		}

		/**
		 * 普通缓存放入
		 * @param key 键
		 * @param value 值
		 * @return true成功 false失败
		 */
		public boolean set(String key,Object value) {
			try {
				redisTemplate.opsForValue().set(key, value);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}

		}

		public RedisTemplate<String, Object> getRedisTemplate() {
			return redisTemplate;
		}

		public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
			this.redisTemplate = redisTemplate;
		}
		
	}
}
