package br.uepb.edu.professorConsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.uepb.edu.professorConsumer.domain.Professor;


@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}