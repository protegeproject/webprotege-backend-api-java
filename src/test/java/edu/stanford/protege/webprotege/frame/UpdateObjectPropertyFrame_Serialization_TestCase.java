package edu.stanford.protege.webprotege.frame;

import com.google.common.collect.ImmutableSet;
import edu.stanford.protege.webprotege.dispatch.Action;

import org.junit.Test;

import java.io.IOException;


import static edu.stanford.protege.webprotege.MockingUtils.*;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2021-04-07
 */
public class UpdateObjectPropertyFrame_Serialization_TestCase {

    @Test
    public void shouldSerializeAction() throws IOException {
        var action = new UpdateObjectPropertyFrameAction(
                mockProjectId(),
                PlainObjectPropertyFrame.get(
                        mockOWLObjectProperty(), ImmutableSet.of(),
                        ImmutableSet.of(),
                        ImmutableSet.of(),
                        ImmutableSet.of(),
                        ImmutableSet.of()
                ),
                PlainObjectPropertyFrame.get(
                        mockOWLObjectProperty(), ImmutableSet.of(),
                        ImmutableSet.of(),
                        ImmutableSet.of(),
                        ImmutableSet.of(),
                        ImmutableSet.of()
                )
        );

    }
}