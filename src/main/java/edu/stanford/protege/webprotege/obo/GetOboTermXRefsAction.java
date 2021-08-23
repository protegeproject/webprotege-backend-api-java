package edu.stanford.protege.webprotege.obo;

import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import org.semanticweb.owlapi.model.OWLEntity;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 22 Jun 2017
 */
public record GetOboTermXRefsAction(@Nonnull ProjectId projectId, @Nonnull OWLEntity entity) implements ProjectAction<GetOboTermXRefsResult> {

    public static final String CHANNEL = "webprotege.obo.GetOboTermXRefs";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}
