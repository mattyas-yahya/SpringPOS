package com.matt.templateQ.TemplateSpringBoot2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.matt.templateQ.TemplateSpringBoot2.model.User;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long>
{
    User findByEmail(String email);
    User findByName(String name);


    String Q="select link from user where name=? ";
    @Query(value = Q,nativeQuery = true)
    User findByLiQ(String name);


}