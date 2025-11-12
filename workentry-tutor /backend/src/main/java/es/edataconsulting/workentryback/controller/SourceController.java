package es.edataconsulting.workentryback.controller;

import es.edataconsulting.workentryback.entity.Source;
import es.edataconsulting.workentryback.exception.EmptyFieldException;
import es.edataconsulting.workentryback.exception.FieldOverflowException;
import es.edataconsulting.workentryback.service.SourceService;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import es.edataconsulting.workentryback.exception.EmptylistException;
import java.util.List;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("source")
public class SourceController extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(SourceController.class);
    private final SourceService dashboardService;


    public SourceController(SourceService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping(value="/all")
    public List<Source> getAllSource() {

        List<Source> allSource = dashboardService.getAllSource();
        try {
            if (allSource.size()==0) throw new EmptylistException ("The list is empty");
        } catch (EmptylistException e) {
            LOGGER.error(e.getMessage() + ": " + HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return allSource;
    }

    @PostMapping
    public Source saveSourceInfo(@RequestBody Source source) {
        try {

            if(source.getName().length() > 45 || source.getLink().length() > 45) {

                throw new FieldOverflowException("The maximum number of characters has been exceeded");

            }

            if (source.getName().length() == 0 || source.getLink().length() == 0) {

                throw new EmptyFieldException("Is empty");

            }
            return dashboardService.addSource(source);

        } catch (EmptyFieldException e) {
            LOGGER.error(e.getMessage() + ": " + HttpStatus.BAD_REQUEST);



        } catch (FieldOverflowException e) {
            LOGGER.error(e.getMessage() + ": " + HttpStatus.BAD_REQUEST);

        }

        return null;
    }

}
