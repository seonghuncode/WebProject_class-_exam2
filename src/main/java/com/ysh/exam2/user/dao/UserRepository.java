package com.ysh.exam2.user.dao;

import com.ysh.exam2.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//userrepository는 user table과 통신하는 역할 (user가 있으면 userrepository도 있어야 한다.)
public interface UserRepository extends JpaRepository<User, Long> {



}
