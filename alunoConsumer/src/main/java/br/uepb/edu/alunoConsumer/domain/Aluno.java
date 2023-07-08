package br.uepb.edu.alunoConsumer.domain;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "aluno")
public class Aluno {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column(name = "name")
  private String name;
  @Column(name = "matricula",unique = true)
  private String matricula;
  @Column(name = "email",unique = true)
  private String email;

  public Aluno(String name, String matricula, String email) {
    this.name = name;
    this.matricula = matricula;
    this.email = email;
  }
}
