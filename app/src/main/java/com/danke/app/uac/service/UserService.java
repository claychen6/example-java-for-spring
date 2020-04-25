package com.danke.app.uac.service;

import com.danke.common.libs.Page;
import com.danke.contract.uac.entity.User;
import com.danke.contract.uac.filter.UserFilter;
import com.danke.contract.uac.service.UserInterface;
import com.danke.app.uac.dao.UserRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.*;
import java.util.*;

@Service
@Transactional
public class UserService implements UserInterface {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUser(Long id) {
        Optional<User> op = userRepository.findById(id);
        return op.isEmpty() ? null : op.get();
    }

    @Override
    public List<User> findUsers(List<Long> ids) {
        UserFilter userFilter = new UserFilter();
        userFilter.setIds(ids);
        userFilter.setIsDel(null);
        // TODO userFilter -> JPACondition
        // userRepository.findAll(userFilter);
        return null;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User userOrg = this.findUser(id);
        userOrg.setNickname(user.getNickname());
        return userRepository.save(userOrg);
    }

    @Override
    public boolean deleteUser(Long id) {
        User user = this.findUser(id);
        if (user == null) return true;

        if (user.getIsDel() == 0) {
            user.setIsDel(1);
            user = userRepository.save(user);
        }

        return user.getIsDel() == 1;
    }

    @Override
    public List<User> queryUserList(UserFilter userFilter) {
        return null;
//        return userRepository.findAll(userFilter);
    }

    @Override
    public Page<User> queryUserPage(UserFilter userFilter, int page, int size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        // TODO userFilter to JPACondition
        // return userRepository.findAll(userFilter, pageable);
        return null;
    }
}
