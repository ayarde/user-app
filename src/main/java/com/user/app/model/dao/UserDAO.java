package com.user.app.model.dao;

import com.microservice.common.user.modal.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "user")
public interface UserDAO extends PagingAndSortingRepository<User,Long> {
    @RestResource(path="findUser")
    public User findByUsername(@Param("username") String username);

    @Query("select u from User u where u.username=?1")
    public User getUserByUsername(String username);
}
