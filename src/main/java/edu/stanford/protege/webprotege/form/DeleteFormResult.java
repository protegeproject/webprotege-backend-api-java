package edu.stanford.protege.webprotege.form;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.dispatch.Result;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-04-15
 */


@JsonTypeName("DeleteForm")
public record DeleteFormResult() implements Result {
}