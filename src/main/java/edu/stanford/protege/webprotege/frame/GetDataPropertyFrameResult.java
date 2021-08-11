package edu.stanford.protege.webprotege.frame;

import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.dispatch.Result;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 28 Jul 16
 */


@JsonTypeName("GetDataPropertyFrame")
public record GetDataPropertyFrameResult(DataPropertyFrame frame) implements Result {

}
