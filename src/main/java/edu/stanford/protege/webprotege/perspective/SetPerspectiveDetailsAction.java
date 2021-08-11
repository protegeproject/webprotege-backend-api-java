package edu.stanford.protege.webprotege.perspective;

import com.google.common.collect.ImmutableList;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;

import javax.annotation.Nonnull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-09-03
 */
public class SetPerspectiveDetailsAction implements ProjectAction<SetPerspectiveDetailsResult> {

    private ProjectId projectId;

    private ImmutableList<PerspectiveDetails> perspectiveDetails;

    public SetPerspectiveDetailsAction(@Nonnull ProjectId projectId,
                                       @Nonnull ImmutableList<PerspectiveDetails> perspectiveDetails) {
        this.projectId = checkNotNull(projectId);
        this.perspectiveDetails = checkNotNull(perspectiveDetails);
    }


    private SetPerspectiveDetailsAction() {
    }

    @Nonnull
    @Override
    public ProjectId projectId() {
        return projectId;
    }

    @Nonnull
    public ImmutableList<PerspectiveDetails> getPerspectiveDetails() {
        return perspectiveDetails;
    }
}
