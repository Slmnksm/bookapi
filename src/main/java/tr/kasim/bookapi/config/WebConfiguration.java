/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.bookapi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 *
 * @author SelmanKasim
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"tr.kasim.bookapi.controller"})
public class WebConfig extends WebMvcConfigurerAdapter{
      
}
