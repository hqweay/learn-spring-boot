package net.leay.demo.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/12/20 8:27 PM
 */
@Configuration
public class SwaggerConfig {
  /**
   * 根据配置读取是否开启swagger文档，针对测试与生产环境采用不同的配置
   */
  @Value("${swagger.enable}")
  private boolean isSwaggerEnable;

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.OAS_30)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
            .paths(PathSelectors.any())
            .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
            .title("俺的接口文档")
            .description("没有描述")
            .version("1.0")
            .build();
  }
}
