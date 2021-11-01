package br.vam.empresa.boot.dao;

import br.vam.empresa.boot.dao.AbstractDao;
import br.vam.empresa.boot.dao.DepartamentoDao;
import br.vam.empresa.boot.domain.Departamento;
import org.springframework.stereotype.Repository;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {

}
