package com.greenfox.repository;


import com.greenfox.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long > {
    List<Todo> findAllByDone(@Param("done") boolean isDone);

}
