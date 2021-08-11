package edu.stanford.protege.webprotege.renderer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.dispatch.Result;
import edu.stanford.protege.webprotege.entity.OWLEntityData;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-03-27
 */


@JsonTypeName("GetEntityHtmlRendering")
public record GetEntityHtmlRenderingResult(@JsonProperty("entityData") OWLEntityData entityData,
                                           @JsonProperty("rendering") @Nonnull String rendering) implements Result {
}
