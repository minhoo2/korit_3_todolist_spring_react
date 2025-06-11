package com.example.todo_backend_mariadb.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// Spring data Rest를  통해서 REST API로 자동 노출 설정
//@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TodoRepository extends JpaRepository<Todo, Long> {

    // CrudRepository 를 상속받기 때문에 기본적인 데이터베이스으 작업 메서드들이 이미 주입되어있습니다.
    // ex) save(Todo entity), findById(Long id), findAll(), deleteById(Long id)
    List<Todo> findByUserOrderByIdDesc(User user);
}
