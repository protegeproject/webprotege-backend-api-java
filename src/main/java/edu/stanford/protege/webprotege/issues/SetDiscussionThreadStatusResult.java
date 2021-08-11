package edu.stanford.protege.webprotege.issues;


import edu.stanford.protege.webprotege.dispatch.Result;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 12 Oct 2016
 */
public record SetDiscussionThreadStatusResult(@Nonnull ThreadId threadId,
                                             @Nonnull Status result) implements Result {

}
