package edu.stanford.protege.webprotege.entity;

import edu.stanford.protege.webprotege.dispatch.Action;
import edu.stanford.protege.webprotege.dispatch.Result;
import edu.stanford.protege.webprotege.match.JsonSerializationTestUtil;
import edu.stanford.protege.webprotege.pagination.Page;
import edu.stanford.protege.webprotege.pagination.PageRequest;
import edu.stanford.protege.webprotege.common.ProjectId;
import org.junit.Test;
import org.semanticweb.owlapi.model.EntityType;

import java.io.IOException;
import java.util.Collections;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2021-04-07
 */
public class GetDeprecatedEntities_Serialization_TestCase {


    @Test
    public void shouldSerializeAction() throws IOException {
        var action = new GetDeprecatedEntitiesAction(ProjectId.generate(),
                                                        PageRequest.requestFirstPage(),
                                                        Collections.singleton(EntityType.CLASS));
        JsonSerializationTestUtil.testSerialization(action, Action.class);
    }

    @Test
    public void shouldSerializeResult() throws IOException {
        var result = new GetDeprecatedEntitiesResult(Page.emptyPage());
        JsonSerializationTestUtil.testSerialization(result, Result.class);
    }
}