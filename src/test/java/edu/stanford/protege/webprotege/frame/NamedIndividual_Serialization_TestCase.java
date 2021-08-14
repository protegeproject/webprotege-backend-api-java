package edu.stanford.protege.webprotege.frame;

import com.google.common.collect.ImmutableSet;
import edu.stanford.protege.webprotege.MockingUtils;

import org.junit.Test;

import java.io.IOException;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2021-04-08
 */
public class NamedIndividual_Serialization_TestCase {
    @Test
    public void shouldSerializeFrame() throws IOException {
        Frame frame = NamedIndividualFrame.get(MockingUtils.mockOWLNamedIndividualData(),
                                               ImmutableSet.of(),
                                               ImmutableSet.of(),
                                               ImmutableSet.of());
        
    }
}
