/*******************************************************************************
 * Copyright (c) 2008, 2011 Sonatype Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sonatype Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.test.mngeclipse937;

import org.apache.maven.it.Verifier;
import org.eclipse.tycho.test.AbstractTychoIntegrationTest;
import org.junit.Test;

public class CustomSourceEncodingTest extends AbstractTychoIntegrationTest {

    @Test
    public void test() throws Exception {
        Verifier verifier = getVerifier("MNGECLIPSE937");

        verifier.getSystemProperties().setProperty("file.encoding", "US-ASCII");

        verifier.executeGoal("integration-test");
        verifier.verifyErrorFreeLog();

    }
}
