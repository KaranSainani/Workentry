package es.edataconsulting.workentryback.service.impl;

import es.edataconsulting.workentryback.entity.Source;
import es.edataconsulting.workentryback.repository.SourceRepository;
import es.edataconsulting.workentryback.service.SourceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SourceServiceImpl implements SourceService {
    private final SourceRepository sourceRepository;

    public SourceServiceImpl(SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository;
    }

    @Override
    public Source addSource(Source source) {
        return sourceRepository.save(source);
    }

    @Override
    public List<Source> getAllSource() {
        return sourceRepository.findAll();
    }
}
