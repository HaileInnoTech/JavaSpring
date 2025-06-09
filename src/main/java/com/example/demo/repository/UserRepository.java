package com.example.demo.repository;

import com.example.demo.entity.user.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository // optional, but good for clarity
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // user pagenable
    Page<UserEntity> findByUserName(String username, Pageable pageable);

    // Custom query methods (if any) go here
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);
    UserEntity findByUserName(String userName);
    List<UserEntity> findByUserNameStartingWith(String userEmail);
    List<UserEntity> findByUserNameEndingWith(String userName);
    List<UserEntity> findByIdLessThan(Long id);


}
