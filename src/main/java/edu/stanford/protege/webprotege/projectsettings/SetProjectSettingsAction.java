package edu.stanford.protege.webprotege.projectsettings;

import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 25/11/14
 */
public record SetProjectSettingsAction(ProjectId projectId,
                                       ProjectSettings settings) implements ProjectAction<SetProjectSettingsResult> {

    @Override
    public String getChannel() {
        return "webprotege.projects.SetProjectSettings";
    }
}
