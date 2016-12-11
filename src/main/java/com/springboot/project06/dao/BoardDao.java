package com.springboot.project06.dao;

import com.springboot.project06.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nick on 16. 9. 25.
 */
public interface BoardDao extends JpaRepository<Board, Integer> {

}
