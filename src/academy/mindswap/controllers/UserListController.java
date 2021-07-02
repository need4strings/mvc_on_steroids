package academy.mindswap.controllers;

import academy.mindswap.models.User;
import academy.mindswap.service.UserServiceImplementation;
import academy.mindswap.views.UserListView;

import java.util.List;

public class UserListController implements Controller {

    private UserListView userListView;
    private UserServiceImplementation userServiceImplementation;
    private List<User> userList;

    @Override
    public void init() {
        this.userList = userServiceImplementation.getUsers();
        userListView.show();
    }

    public List<User> getUserList() {
        System.out.println(userList);
        return this.userList;
    }

    public void setUserListView(UserListView userListView) {
        this.userListView = userListView;
    }

    public void setUserServiceImplementation(UserServiceImplementation userServiceImplementation) {
        this.userServiceImplementation = userServiceImplementation;
    }
}
