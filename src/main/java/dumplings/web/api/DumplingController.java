package dumplings.web.api;

import dumplings.Dumpling;
import dumplings.data.DumplingRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
