package br.com.hhc.samples.fullstackspringhibernate.data;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

@ContextConfiguration(locations = { "classpath:/spring/fullstackspringhibernate-spring-dataRoot-test.xml" })
@TransactionConfiguration(defaultRollback = true)
public abstract class AbstractDataTestSuite extends AbstractTransactionalJUnit4SpringContextTests {
	
    protected static final Logger logger = LoggerFactory.getLogger(AbstractDataTestSuite.class);

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        LocaleContextHolder.setLocale(new Locale("pt", "BR"));
    }

    protected void print(final Object object) {
        if ( object != null ) {
            for (final Field field : object.getClass().getDeclaredFields()) {
                final String fieldName = field.getName();
                final Method method = ReflectionUtils.findMethod(object.getClass(), "get" + StringUtils.capitalize(fieldName));

                if ( method != null ) {
                    logger.info(String.format("[%1$s] %2$s", fieldName, ReflectionUtils.invokeMethod(method, object)));
                    System.out.println(String.format("[%1$s] %2$s", fieldName, ReflectionUtils.invokeMethod(method, object)));
                }
            }
        }
    }

}
