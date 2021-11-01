package br.vam.empresa.boot.dao;

import br.vam.empresa.boot.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}

