package ru.otus.example.advancedconfigurationdemo.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanFactory implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        for (String beanName : beanFactory.getBeanDefinitionNames()) {
            System.out.println(beanName);
            if (beanName.equals("friendIgor")) {
/*
                BeanDefinition d = beanFactory.getBeanDefinition(beanName);
                d.setBeanClassName(FriendArnold.class.getName());
                ((ScannedGenericBeanDefinition) d).addMetadataAttribute(new BeanMetadataAttribute("className", FriendArnold.class.getName()));
                d.setAutowireCandidate(true);
*/
            }
        }
    }
}
