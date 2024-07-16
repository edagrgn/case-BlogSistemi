package com.tobeto.case_java4a.service.abstracts;

import org.apache.catalina.User;

public interface UserService {
    User save(User user);

    com.tobeto.case_java4a.model.entity.User save(com.tobeto.case_java4a.model.entity.User user);

    User findByUsername(String username);
}
