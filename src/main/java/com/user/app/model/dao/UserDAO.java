package com.user.app.model.dao;

import com.user.app.model.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user")
public interface UserDAO extends PagingAndSortingRepository<User,Long> {
    public User findByUsername(String username);

    @Query("select u from User u where u.username=?1")
    public User getUserByUsername(String username);
}
