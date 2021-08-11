package edu.stanford.protege.webprotege.obo;

import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.dispatch.Result;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 22 Jun 2017
 */


@JsonTypeName("SetOboTermCrossProduct")
public record SetOboTermCrossProductResult() implements Result {
}
