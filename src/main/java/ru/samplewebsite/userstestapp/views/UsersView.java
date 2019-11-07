package ru.samplewebsite.userstestapp.views;

import ru.samplewebsite.userstestapp.models.User;
import ru.samplewebsite.userstestapp.repositories.UserRepository;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class UsersView implements Serializable{
    private static final long serialVersionUID = 1L;

    @Inject
    private UserRepository userRepository;

    private List<User> users;

    private Integer num = 11;

    @PostConstruct
    public void init() {
        users = userRepository.findAll();
        System.out.println("-----------HERE++++++++++");
        System.out.println(users.size());
        System.out.println(num);
    }

    public List<User> getUsers() {
        return users;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
