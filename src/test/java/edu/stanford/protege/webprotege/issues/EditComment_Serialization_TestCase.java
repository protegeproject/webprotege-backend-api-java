package edu.stanford.protege.webprotege.issues;

import edu.stanford.protege.webprotege.MockingUtils;
import edu.stanford.protege.webprotege.dispatch.Action;
import edu.stanford.protege.webprotege.dispatch.Result;
import edu.stanford.protege.webprotege.match.JsonSerializationTestUtil;
import edu.stanford.protege.webprotege.common.ProjectId;
import org.junit.Test;

import java.io.IOException;
import java.util.Optional;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2021-04-06
 */
public class EditComment_Serialization_TestCase {


    @Test
    public void shouldSerializeAction() throws IOException {
        var action = new EditCommentAction(ProjectId.generate(),
                                                   ThreadId.create(),
                                                   CommentId.create(),
                                                   "Body"); JsonSerializationTestUtil.testSerialization(action, Action.class);
    }

    @Test
    public void shouldSerializeResult() throws IOException {
        var result = new EditCommentResult(Optional.empty());
        JsonSerializationTestUtil.testSerialization(result, Result.class);
    }
}
