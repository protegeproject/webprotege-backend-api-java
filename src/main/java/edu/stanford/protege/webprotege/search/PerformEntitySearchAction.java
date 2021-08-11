package edu.stanford.protege.webprotege.search;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import edu.stanford.protege.webprotege.lang.LangTagFilter;
import edu.stanford.protege.webprotege.pagination.PageRequest;
import edu.stanford.protege.webprotege.project.HasProjectId;
import edu.stanford.protege.webprotege.common.ProjectId;
import org.semanticweb.owlapi.model.EntityType;

import javax.annotation.Nonnull;
import java.util.Set;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 21 Apr 2017
 */


@JsonTypeName("PerformEntitySearch")
public record PerformEntitySearchAction(@JsonProperty("projectId") @Nonnull ProjectId projectId,
                                        @JsonProperty("searchString") @Nonnull String searchString,
                                        @JsonProperty("entityTypes") @Nonnull Set<EntityType<?>> entityTypes,
                                        @JsonProperty("langTagFilter") @Nonnull LangTagFilter langTagFilter,
                                        @JsonProperty("searchFilters") @Nonnull ImmutableList<EntitySearchFilter> searchFilters,
                                        @JsonProperty("pageRequest") @Nonnull PageRequest pageRequest) implements ProjectAction<PerformEntitySearchResult>, HasProjectId {
}