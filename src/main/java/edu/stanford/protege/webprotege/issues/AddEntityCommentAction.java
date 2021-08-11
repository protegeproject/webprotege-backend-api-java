package edu.stanford.protege.webprotege.issues;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import edu.stanford.protege.webprotege.project.HasProjectId;
import edu.stanford.protege.webprotege.common.ProjectId;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 7 Oct 2016
 */
@JsonTypeName("AddEntityComment")
public record AddEntityCommentAction(ProjectId projectId,
                                     ThreadId threadId,
                                     String comment) implements ProjectAction<AddEntityCommentResult>, HasProjectId {

    @JsonCreator
    public static AddEntityCommentAction addComment(@JsonProperty("projectId") @Nonnull ProjectId projectId,
                                                    @JsonProperty("threadId") @Nonnull ThreadId threadId,
                                                    @JsonProperty("comment") @Nonnull String comment) {
        return new AddEntityCommentAction(projectId, threadId, comment);
    }
}