package br.uepb.edu.professorConsumer.domain;

import javax.persistence.*;
import lombok.*;

// Um professor tem nome, formação, matrícula e e-mail (estes dois últimos devem ser únicos no banco).

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "professores")

public class Professor {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "formacao")
  private String formacao;

  @Column(name = "matricula", unique = true) //, unique = true
  private String matricula;

  @Column(name = "email", unique = true)
  private String email;
  
  public Professor(String name, String formacao, String matricula, String email){
    this.name = name;
    this.formacao = formacao;
    this.matricula = matricula;
    this.email = email;
  }
}