package per.spring.study.configs;


import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;

/**
 * @User: Administrator
 * @Time: 2021/5/19
 * @Description: @EnableAutoConfiguration 注解
 * @see org.springframework.boot.autoconfigure.EnableAutoConfiguration
 * @see org.springframework.boot.autoconfigure.AutoConfigurationImportSelector#selectImports
 *
 *
 * spring-boot自动配置 包中的META-INF\spring.factories文件（与上面的注解同包），即是自动配置bean的基础Bean，以及一些其他参数
 * 此外不光是这个依赖下的META-INF/spring.factories被读取到，所有 Spring Boot Starter 下的META-INF/spring.factories都会被读取到。
 *
 * 注解@ConditionalOnXXX等相关注解会判断bean是否达到了创建该bean的条件。未达到条件的类将被过滤掉，不会创建此bean
 * @see org.springframework.boot.autoconfigure.condition.ConditionalOnBean
 */

@ConditionalOnJava(JavaVersion.EIGHT)
public class EnableAutoConfigurationAnnotationTest {



}
