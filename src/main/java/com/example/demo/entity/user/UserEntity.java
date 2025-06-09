package com.example.demo.entity.user;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@Table(name="java user 001")
@DynamicInsert
@DynamicUpdate
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "varchar(255) comment 'userName'", nullable = false)
    private String userName;
    @Column(columnDefinition = "varchar(255) comment 'userEmail'", nullable = false, unique = true)
    private String userEmail;
}
