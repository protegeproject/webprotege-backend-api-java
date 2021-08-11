package edu.stanford.protege.webprotege.project;

import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.Action;
import org.jetbrains.annotations.NotNull;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 05/04/2013
 */
@JsonTypeName("LoadProject")
public record LoadProjectAction(ProjectId projectId) implements Action<LoadProjectResult>, HasProjectId {

    @NotNull
    @Override
    public ProjectId getProjectId() {
        return projectId();
    }
}
