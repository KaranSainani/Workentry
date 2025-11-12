package es.edataconsulting.workentryback.service;

import es.edataconsulting.workentryback.entity.Source;

import java.util.List;

public interface SourceService {
    List<Source> getAllSource();

    Source addSource(Source source);
}
