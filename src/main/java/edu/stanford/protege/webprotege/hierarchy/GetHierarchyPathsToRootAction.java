package edu.stanford.protege.webprotege.hierarchy;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import edu.stanford.protege.webprotege.common.ProjectId;
import org.semanticweb.owlapi.model.OWLEntity;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge Stanford Center for Biomedical Informatics Research 28 Nov 2017
 */


@JsonTypeName("GetHierarchyPathsToRoot")
public record GetHierarchyPathsToRootAction(@JsonProperty("projectId") @Nonnull ProjectId projectId,
                                            @JsonProperty("term") @Nonnull OWLEntity entity,
                                            @JsonProperty("hierarchyId") @Nonnull HierarchyId hierarchyId) implements ProjectAction<GetHierarchyPathsToRootResult> {
}