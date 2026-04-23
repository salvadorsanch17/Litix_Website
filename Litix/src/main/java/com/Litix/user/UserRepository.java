package com.Litix.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{ //User Repo interacts with pulling and saving to
    //repository
    User findByUsername(String username);

    User findByEmail(String email);

}
