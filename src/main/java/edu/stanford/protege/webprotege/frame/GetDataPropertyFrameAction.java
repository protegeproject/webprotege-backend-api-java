package edu.stanford.protege.webprotege.frame;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.HasSubject;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import edu.stanford.protege.webprotege.common.ProjectId;
import org.semanticweb.owlapi.model.OWLDataProperty;

import javax.annotation.Nonnull;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 23/04/2013
 */


@JsonTypeName("GetDataPropertyFrame")
public record GetDataPropertyFrameAction(@JsonProperty("projectId") ProjectId projectId,
                                         @JsonProperty("subject") OWLDataProperty subject) implements ProjectAction<GetDataPropertyFrameResult>, HasSubject<OWLDataProperty> {

}