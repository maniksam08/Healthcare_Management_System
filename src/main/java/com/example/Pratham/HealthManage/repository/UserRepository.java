package com.example.Pratham.HealthManage.repository;

import com.example.Pratham.HealthManage.entity.User;
import com.example.Pratham.HealthManage.entity.type.AuthProviderType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Optional<User> findByProviderIdAndProviderType(String providerId, AuthProviderType providerType);
}
