package com.example;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by user1 on 18-10-2016.
 */

@Repository
public interface AccountRepository extends CrudRepository<AccountModel, Long>
{
    @Query("select a from AccountModel a where a.lastName = :lastName")
    public List<AccountModel> findBylastName(String lastName);
}
