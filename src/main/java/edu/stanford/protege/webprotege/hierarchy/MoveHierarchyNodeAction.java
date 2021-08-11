package edu.stanford.protege.webprotege.hierarchy;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import edu.stanford.protege.webprotege.entity.EntityNode;
import edu.stanford.protege.webprotege.common.ProjectId;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge Stanford Center for Biomedical Informatics Research 8 Dec 2017
 */


@JsonTypeName("MoveHierarchyNode")
public record MoveHierarchyNodeAction(@JsonProperty("projectId") @Nonnull ProjectId projectId,
                                      @JsonProperty("hierarchyId") @Nonnull HierarchyId hierarchyId,
                                      @JsonProperty("fromNodePath") @Nonnull Path<EntityNode> fromNodePath,
                                      @JsonProperty("toNodeParentPath") @Nonnull Path<EntityNode> toNodeParentPath,
                                      @JsonProperty("dropType") @Nonnull DropType dropType) implements ProjectAction<MoveHierarchyNodeResult> {


}