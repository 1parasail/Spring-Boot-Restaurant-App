package dumplings.web.api;

import dumplings.Dumpling;
import dumplings.data.DumplingRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(path="/api/dumplings", produces = "application/json")
@CrossOrigin(origins = "http://zhanchik:8080")
public class DumplingController {

    private DumplingRepository dumplingRepository;

    public DumplingController(DumplingRepository dumplingRepository) {
        this.dumplingRepository = dumplingRepository;
    }

   @GetMapping(params="recent")
    public Iterable<Dumpling> recentsDumplings()
    {
        PageRequest page = PageRequest.of(0, 10, Sort.by("createdAt").descending());
        return dumplingRepository.findAll(page).getContent();
    }

    @GetMapping("/{id}")
    public Optional<Dumpling> dumplingById (@PathVariable("id") Long id)
    {
        return dumplingRepository.findById(id);
    }

    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Dumpling createDumpling (@RequestBody Dumpling dumpling)
    {
        return dumplingRepository.save(dumpling);
    }

}
