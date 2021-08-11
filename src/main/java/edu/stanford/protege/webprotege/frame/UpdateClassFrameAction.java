package edu.stanford.protege.webprotege.frame;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 20/02/2013
 */


@JsonTypeName("UpdateClassFrame")
public record UpdateClassFrameAction(@JsonProperty("projectId") ProjectId projectId,
                                     @JsonProperty("from") PlainClassFrame from,
                                     @JsonProperty("to") PlainClassFrame to) implements ProjectAction<UpdateClassFrameResult> {
}
