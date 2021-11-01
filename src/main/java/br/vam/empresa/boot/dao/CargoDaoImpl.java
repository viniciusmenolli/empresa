package br.vam.empresa.boot.dao;

import br.vam.empresa.boot.domain.Cargo;
import org.springframework.stereotype.Repository;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {
}
