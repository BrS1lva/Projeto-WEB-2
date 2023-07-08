package br.uepb.edu.alunoConsumer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.uepb.edu.alunoConsumer.domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
  Optional<Aluno> findByName(String name);
}