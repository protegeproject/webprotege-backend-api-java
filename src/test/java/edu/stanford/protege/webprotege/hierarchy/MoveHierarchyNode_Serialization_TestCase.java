package edu.stanford.protege.webprotege.hierarchy;

import edu.stanford.protege.webprotege.dispatch.Action;
import edu.stanford.protege.webprotege.dispatch.Result;

import org.junit.Test;

import java.io.IOException;


import static edu.stanford.protege.webprotege.MockingUtils.*;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2021-04-07
 */
public class MoveHierarchyNode_Serialization_TestCase {

    @Test
    public void shouldSerializeAction() throws IOException {
        var action = new MoveHierarchyNodeAction(mockProjectId(),
                                                    HierarchyId.CLASS_HIERARCHY, Path.asPath(mockOWLClassNode()),
                                                    Path.emptyPath(),
                                                    DropType.ADD);
        
    }

    @Test
    public void shouldSerializeResult() throws IOException {
        var result = new MoveHierarchyNodeResult(true);
        
    }
}