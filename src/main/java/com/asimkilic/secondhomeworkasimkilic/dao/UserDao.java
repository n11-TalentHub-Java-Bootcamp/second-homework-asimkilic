package com.asimkilic.secondhomeworkasimkilic.dao;

import com.asimkilic.secondhomeworkasimkilic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
