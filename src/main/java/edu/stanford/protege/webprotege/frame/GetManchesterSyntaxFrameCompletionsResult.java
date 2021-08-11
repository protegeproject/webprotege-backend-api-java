package edu.stanford.protege.webprotege.frame;

import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.dispatch.Result;
import edu.stanford.protege.webprotege.mansyntax.AutoCompletionResult;

/**
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics Research Group, Date: 20/03/2014
 */


@JsonTypeName("GetManchesterSyntaxFrameCompletions")
public record GetManchesterSyntaxFrameCompletionsResult(AutoCompletionResult autoCompletionResult) implements Result {
}
