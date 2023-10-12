package guru.springframework.spring6di.services;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycle Bean Constructor ##");
    }

    private String javaVer;

    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer) {
        this.javaVer = javaVer;
        System.out.println("## 1 properties Set. Java Ver: " + this.javaVer);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## 3 BeanNameAware  - Bean Factory has been Set ##");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4 ApplicationContextAware  - Application Context has been Set ##");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## 4 postConstruct  - annotated method has been called ##");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## 2 Bean NameAware My Bean Name is: " + name  );
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## 8 DisposableBean.destroy  Life Cycle has been terminated ##");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 6 afterPropertiesSet  populates ##");
    }


}
