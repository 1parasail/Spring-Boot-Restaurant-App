package dumplings.data;

import org.springframework.data.repository.CrudRepository;
import dumplings.DumplingOrder;
public interface OrderRepository
        extends CrudRepository<DumplingOrder, Long> {
}
