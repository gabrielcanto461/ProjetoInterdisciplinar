package br.edu.ifsp.projeto_interdisplinar.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Aluno {
    
    private Integer code;
    private String nome;
    private Integer nivel;
    private String curso;

}