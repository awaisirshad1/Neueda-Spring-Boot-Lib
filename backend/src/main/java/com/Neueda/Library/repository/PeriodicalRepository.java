package com.Neueda.Library.repository;

import com.Neueda.Library.model.Periodical;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PeriodicalRepository extends JpaRepository<Periodical, Long> {
}