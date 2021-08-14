package edu.stanford.protege.webprotege.change;

import edu.stanford.protege.webprotege.common.PageRequest;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.UserId;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 27/02/15
 */
@RunWith(MockitoJUnitRunner.class)
public class GetWatchedEntityChangesAction_TestCase {


    private GetWatchedEntityChangesAction action;

    private GetWatchedEntityChangesAction otherAction;

    private ProjectId projectId = ProjectId.generate();

    @Mock
    private UserId userId;

    @Mock
    private PageRequest pageRequest;

    @Before
    public void setUp() throws Exception {
        action = new GetWatchedEntityChangesAction(projectId, userId);
        otherAction = new GetWatchedEntityChangesAction(projectId, userId);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionIf_ProjectId_IsNull() {
        new GetWatchedEntityChangesAction(null, userId);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionIf_UserId_IsNull() {
        new GetWatchedEntityChangesAction(projectId, null);
    }

    @Test
    public void shouldBeEqualToSelf() {
        assertThat(action, is(equalTo(action)));
    }

    @Test
    public void shouldNotBeEqualToNull() {
        assertThat(action, is(not(equalTo(null))));
    }

    @Test
    public void shouldBeEqualToOther() {
        assertThat(action, is(equalTo(otherAction)));
    }

    @Test
    public void shouldHaveSameHashCodeAsOther() {
        assertThat(action.hashCode(), is(otherAction.hashCode()));
    }

    @Test
    public void shouldGenerateToString() {
        assertThat(action.toString(), startsWith("GetWatchedEntityChangesAction"));
    }

    @Test
    public void shouldReturnSupplied_ProjectId() {
        assertThat(action.projectId(), is(projectId));
    }

    @Test
    public void shouldReturnSupplied_UserId() {
        assertThat(action.userId(), is(userId));
    }
}