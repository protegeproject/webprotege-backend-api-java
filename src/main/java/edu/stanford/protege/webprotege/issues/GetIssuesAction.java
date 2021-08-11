package edu.stanford.protege.webprotege.issues;

import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import edu.stanford.protege.webprotege.common.ProjectId;

import javax.annotation.Nonnull;
import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 27 Jul 16
 */
public class GetIssuesAction implements ProjectAction<GetIssuesResult> {

    private ProjectId projectId;

    private GetIssuesAction() {
    }

    public GetIssuesAction(ProjectId projectId) {
        this.projectId = checkNotNull(projectId);
    }

    @Nonnull
    @Override
    public ProjectId projectId() {
        return projectId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
                projectId
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetIssuesAction)) {
            return false;
        }
        GetIssuesAction other = (GetIssuesAction) obj;
        return this.projectId.equals(other.projectId);
    }


    @Override
    public String toString() {
        return toStringHelper("GetIssuesAction")
                .addValue(projectId)
                .toString();
    }
}