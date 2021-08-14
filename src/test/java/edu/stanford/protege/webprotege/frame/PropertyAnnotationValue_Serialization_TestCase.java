package edu.stanford.protege.webprotege.frame;


import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static edu.stanford.protege.webprotege.MockingUtils.mockOWLAnnotationProperty;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.Literal;

public class PropertyAnnotationValue_Serialization_TestCase {

    private PlainPropertyAnnotationValue propertyValue;

    @Before
    public void setUp() throws Exception {
        propertyValue = PlainPropertyAnnotationValue.get(mockOWLAnnotationProperty(),
                                                      Literal("Hello"));
    }

    @Test
    public void shouldSerializeAndDeserializePropertyValue() throws IOException {
        
    }
}
