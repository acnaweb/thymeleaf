import org.springframework.data.repository.CrudRepository;

import com.github.acnaweb.thymeleaf.model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}
