package edu.stanford.protege.webprotege.change;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.dispatch.Result;


import edu.stanford.protege.webprotege.event.ProjectEvent;
import edu.stanford.protege.webprotege.project.HasProjectId;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.revision.RevisionNumber;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 19/03/15
 */


@JsonTypeName("RevertRevision")
public record RevertRevisionResult(@JsonProperty("projectId") @Nonnull ProjectId projectId,
                                   @JsonProperty("revisionNumber") @Nonnull RevisionNumber revisionNumber) implements Result {


}