package edu.stanford.protege.webprotege.perspective;


import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import edu.stanford.protege.webprotege.common.ProjectId;

import javax.annotation.Nonnull;

import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 15 Mar 2017
 *
 * Requests that the perspective identified by the specified id in the specified project is reset to
 * the default for the current user.
 * @param projectId The project id.
 * @param perspectiveId The perspective id.
 */
public record ResetPerspectiveLayoutAction(ProjectId projectId,
                                          PerspectiveId perspectiveId) implements ProjectAction<ResetPerspectiveLayoutResult> {


}