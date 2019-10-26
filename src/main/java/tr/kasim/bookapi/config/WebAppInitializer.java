/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.bookapi.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author SelmanKasim
 */


public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        
        return new Class[] {AppConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        
        return new Class[] {WebConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        
        return new String[] {"/"};
    }
    
}
