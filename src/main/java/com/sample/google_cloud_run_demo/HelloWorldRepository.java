package com.sample.google_cloud_run_demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HelloWorldRepository extends JpaRepository<Users, Long> {

    @Query(value = "SELECT * FROM users WHERE ID=?1",nativeQuery = true)
    Users findId(Long id);
}