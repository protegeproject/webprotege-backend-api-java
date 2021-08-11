package edu.stanford.protege.webprotege.permissions;

import com.google.common.collect.ImmutableSet;
import edu.stanford.protege.webprotege.authorization.api.ActionId;
import edu.stanford.protege.webprotege.dispatch.Result;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 23/02/15
 */
public record GetProjectPermissionsResult(ImmutableSet<ActionId> allowedActions) implements Result {

}
