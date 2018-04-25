package pers.xiaoming.java_spring.spring_ioc.basic_annotation_injection.autowired_bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pers.xiaoming.java_spring.spring_ioc.basic_annotation_injection.repository.MyRepository;

import javax.inject.Inject;

@Controller("customized bean name: parameter inject")
public class MyParameterInject implements MyService {
    @Inject
    @Qualifier("My Repository")
    private MyRepository myRepo;

    public String showRepo() {
        return myRepo.showRepo();
    }
}