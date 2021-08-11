package edu.stanford.protege.webprotege.itemlist;

import com.google.common.base.Objects;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import edu.stanford.protege.webprotege.sharing.PersonId;

import java.util.List;

import static com.google.common.base.MoreObjects.toStringHelper;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 13/05/15
 */
public record GetPersonIdItemsAction(ProjectId projectId, List<String> itemNames) implements ProjectAction<GetPersonIdItemsResult> {

}