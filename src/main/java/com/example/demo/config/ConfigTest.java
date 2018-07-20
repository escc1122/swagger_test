package com.example.demo.config;

import io.swagger.annotations.ApiParam;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration //让Spring来加载该类配置
@EnableSwagger2 //启用Swagger2
public class ConfigTest {
  @Bean
  public Docket alipayApi() {
    return new Docket(DocumentationType.SWAGGER_2)
            .groupName("會員資訊")
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
//            .paths(PathSelectors.any()).build();
            .paths(regex("/.*")).build();
  }
//  @Bean
//  public Docket weixinpayApi() {
//    return new Docket(DocumentationType.SWAGGER_2)
//            .groupName("微信API接口文档")
//            .apiInfo(apiInfo())
//            .select()
//            .apis(RequestHandlerSelectors.basePackage("com.itstyle.modules.weixinpay"))
//            .paths(PathSelectors.any()).build();
//  }
//  @Bean
//  public Docket unionpayApi() {
//    return new Docket(DocumentationType.SWAGGER_2)
//            .groupName("银联API接口文档")
//            .apiInfo(apiInfo())
//            .select()
//            .apis(RequestHandlerSelectors.basePackage("com.itstyle.modules.unionpay"))
//            .paths(PathSelectors.any()).build();
//  }
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
            .title("title")
            .description("altest")
            .termsOfServiceUrl("https://www.google.com.tw")
            .contact(new Contact("alTest ", "https://www.google.com.tw", "email?"))
            .version("1.0").build();
  }

}