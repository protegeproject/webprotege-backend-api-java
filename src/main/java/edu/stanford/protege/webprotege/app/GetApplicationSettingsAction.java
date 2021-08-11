package edu.stanford.protege.webprotege.app;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.dispatch.Action;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 16 Mar 2017
 */


@JsonTypeName("GetApplicationSettings")
public record GetApplicationSettingsAction() implements Action<GetApplicationSettingsResult> {

}