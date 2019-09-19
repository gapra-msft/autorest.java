package fixtures.head;

import com.microsoft.rest.v3.credentials.BasicAuthenticationCredentials;
import com.microsoft.rest.v3.http.HttpPipeline;
import com.microsoft.rest.v3.policy.CredentialsPolicyFactory;
import com.microsoft.rest.v3.policy.PortPolicyFactory;
import com.microsoft.rest.v3.policy.ProtocolPolicyFactory;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import fixtures.head.implementation.AutoRestHeadTestServiceImpl;

public class HttpSuccessTests {
    private static AutoRestHeadTestServiceImpl client;

    @BeforeClass
    public static void setup() {
        final HttpPipeline httpPipeline = HttpPipeline.build(
                new ProtocolPolicyFactory("http"),
                new PortPolicyFactory(3000),
                new CredentialsPolicyFactory(new BasicAuthenticationCredentials(null, null)));
        client = new AutoRestHeadTestServiceImpl(httpPipeline);
    }

    @Test
    public void head200() throws Exception {
        Assert.assertTrue(client.httpSuccess().head200());
    }

    @Test
    public void head204() throws Exception {
        Assert.assertTrue(client.httpSuccess().head204());
    }

    @Test
    public void head404() throws Exception {
        Assert.assertFalse(client.httpSuccess().head404());
    }
}