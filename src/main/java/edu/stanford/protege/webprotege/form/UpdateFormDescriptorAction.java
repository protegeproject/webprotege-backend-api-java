package edu.stanford.protege.webprotege.form;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import edu.stanford.protege.webprotege.common.ProjectId;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-08-22
 */


@JsonTypeName("UpdateFormDescriptor")
public record UpdateFormDescriptorAction(@JsonProperty("projectId") @Nonnull ProjectId projectId,
                                         @JsonProperty("formDescriptor") @Nonnull FormDescriptor descriptor) implements ProjectAction<UpdateFormDescriptorResult> {

}