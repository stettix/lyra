package net.jodah.lyra.config;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

@Test
public class RetryPolicyTest {
  public void emptyPolicyShouldAllowRetries() {
    assertTrue(new RetryPolicy().allowsAttempts());
  }

  public void emptyPolicyShouldDefaultToNotRetryAuthenticationExceptions() {
    assertFalse(new RetryPolicy().retryAuthenticationException());
  }
}
