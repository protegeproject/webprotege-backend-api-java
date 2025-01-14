package edu.stanford.protege.webprotege.hierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.PageRequest;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import org.semanticweb.owlapi.model.OWLEntity;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 13 Sep 2018
 */


@JsonTypeName("webprotege.hierarchies.GetHierarchySiblings")
public record GetHierarchySiblingsAction(@JsonProperty("projectId") ProjectId projectId,
                                         @JsonProperty("entity") OWLEntity entity,
                                         @JsonProperty("hierarchyDescriptor") HierarchyDescriptor hierarchyDescriptor,
                                         @JsonProperty("pageRequest") PageRequest pageRequest) implements ProjectAction<GetHierarchySiblingsResult> {

    public static final String CHANNEL = "webprotege.hierarchies.GetHierarchySiblings";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}
