package edu.stanford.protege.webprotege.usage;

import com.google.common.collect.ImmutableList;
import edu.stanford.protege.webprotege.dispatch.Action;
import edu.stanford.protege.webprotege.dispatch.Result;

import org.junit.Test;
import org.semanticweb.owlapi.model.AxiomType;

import java.io.IOException;
import java.util.Optional;


import static edu.stanford.protege.webprotege.MockingUtils.*;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2021-04-07
 */
public class GetUsage_Serialization_TestCase {

    @Test
    public void shouldSerializeAction() throws IOException {
        var action = new GetUsageAction(mockOWLClass(), mockProjectId(), new UsageFilter());
        
    }

    @Test
    public void shouldSerializeResult() throws IOException {
        var result = new GetUsageResult(mockProjectId(),
                                           mockOWLClassNode(),
                                           ImmutableList.of(
                                                   new UsageReference(AxiomType.DECLARATION,
                                                                      "Declaration(Class(http://example.org/A))",
                                                                      Optional.empty(),
                                                                      Optional.empty()
                                                   )
                                           ), 22);
        
    }
}