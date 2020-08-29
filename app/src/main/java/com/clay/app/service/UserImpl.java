package com.clay.app.service;

import com.clay.app.dao.UserRepository;
import com.clay.common.lib.Page;
import com.clay.uac_simple_api.entity.User;
import com.clay.uac_simple_api.entity.UserFilter;
import com.clay.uac_simple_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.*;
import java.util.*;

@Transactional
public class UserImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> queryUserList(UserFilter userFilter, Integer limit) {
        return null;
    }

    @Override
    public Page<User> queryUserPage(UserFilter userFilter, Integer size, Integer page) {
        return null;
    }

    @Override
    public Integer createUser(User user) {
        return null;
    }

    @Override
    public User findUser(Long id) {
        System.out.println(id);
        Optional<?> op = userRepository.findById(1L);
        System.out.println(op.isEmpty() ? null : op.get());
        return null;
    }

    @Override
    public Boolean updateUser(Integer id, User user) {
        return null;
    }

    @Override
    public Boolean deleteUser(Integer id) {
        return null;
    }

//    @Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public User findUser(Long id) {
//        Optional<User> op = userRepository.findById(id);
//        return op.isEmpty() ? null : op.get();
//    }
//
//    @Override
//    public List<User> findUsers(List<Long> ids) {
//        UserFilter userFilter = new UserFilter();
//        userFilter.setIds(ids);
//        userFilter.setIsDel(null);
//        userRepository.findAll(this.getUserSpecification(userFilter));
//        return null;
//    }
//
//    @Override
//    public User createUser(User user) {
//        return userRepository.save(user);
//    }
//
//    @Override
//    public User updateUser(Long id, User user) {
//        User userOrg = this.findUser(id);
//        userOrg.setNickname(user.getNickname());
//        return userRepository.save(userOrg);
//    }
//
//    @Override
//    public boolean deleteUser(Long id) {
//        User user = this.findUser(id);
//        if (user == null) return true;
//
//        if (user.getIsDel() == 0) {
//            user.setIsDel(1);
//            user = userRepository.save(user);
//        }
//
//        return user.getIsDel() == 1;
//    }
//
//    @Override
//    public List<User> queryUserList(UserFilter userFilter, int limit) {
//        Pageable pageable = PageRequest.of(0, limit);
//        org.springframework.data.domain.Page<User> jpaPage = userRepository.findAll(this.getUserSpecification(userFilter), pageable);
//        return jpaPage.getContent();
//    }
//
//    @Override
//    public Page<User> queryUserPage(UserFilter userFilter, int page, int size) {
//        Pageable pageable = PageRequest.of(page - 1, size);
//        org.springframework.data.domain.Page<User> jpaPage = userRepository.findAll(this.getUserSpecification(userFilter), pageable);
//        return new Page<>(jpaPage.getTotalElements(), jpaPage.getContent());
//    }
//
//    private Specification<User> getUserSpecification(UserFilter userFilter) {
//
//        return (Specification<User>) (root, criteriaQuery, criteriaBuilder) -> {
//            Path<String> idPath = root.get("id");
//            Path<String> mobilePath = root.get("mobile");
//
//            if (!StringUtils.isEmpty(userFilter.getId())) {
//                criteriaQuery.where(criteriaBuilder.equal(idPath, userFilter.getId()));
//            }
//
//            if (!StringUtils.isEmpty(userFilter.getMobile())) {
//                criteriaQuery.where(criteriaBuilder.equal(mobilePath, userFilter.getMobile()));
//            }
//
//            return null;
//        };
//
//    }
}
