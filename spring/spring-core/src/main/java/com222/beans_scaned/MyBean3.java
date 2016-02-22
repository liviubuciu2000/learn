package com222.beans_scaned;

import com222.injected.InjectedBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.inject.Inject;


@Component("myBean3_Component")
public class MyBean3 {

    @Qualifier("injected")
    @Inject
    private InjectedBean myInjectedBean;

    public String toString() {
        return "from " + MyBean3.class.getName() + " and injected bean: " + myInjectedBean.testBean();
    }
}
