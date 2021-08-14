package edu.stanford.protege.webprotege.frame;


import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static edu.stanford.protege.webprotege.MockingUtils.mockOWLClass;
import static edu.stanford.protege.webprotege.MockingUtils.mockOWLObjectProperty;

public class PropertyClassValue_Serialization_TestCase {

    private PlainPropertyClassValue propertyValue;

    @Before
    public void setUp() throws Exception {
        propertyValue = PlainPropertyClassValue.get(mockOWLObjectProperty(),
                                               mockOWLClass());
    }

    @Test
    public void shouldSerializeAndDeserializePropertyValue() throws IOException {
        
    }
}
