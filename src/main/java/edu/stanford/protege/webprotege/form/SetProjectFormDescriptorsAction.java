package edu.stanford.protege.webprotege.form;

import com.google.common.collect.ImmutableList;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2019-11-23
 */
public record SetProjectFormDescriptorsAction(ProjectId projectId,
                                             ImmutableList<FormDescriptor> formDescriptors) implements ProjectAction<SetProjectFormDescriptorsResult> {

}
