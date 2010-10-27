/*
 * Copyright (c) 2009, GoodData Corporation. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
 * that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice, this list of conditions and
 *        the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright notice, this list of conditions
 *        and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *     * Neither the name of the GoodData Corporation nor the names of its contributors may be used to endorse
 *        or promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 * AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.gooddata.integration.rest;

import com.gooddata.integration.rest.configuration.NamePasswordConfiguration;
import com.gooddata.processor.Command;
import junit.framework.TestCase;
import org.apache.log4j.Logger;

import java.io.InputStream;
import java.util.List;

/**
 * GoodData
 *
 * @author zd <zd@gooddata.com>
 * @version 1.0
 */
public class TestGdcRestApiWrapper extends TestCase {

    private static Logger l = Logger.getLogger(TestGdcRestApiWrapper.class);

    NamePasswordConfiguration config = null;

    //NamePasswordConfiguration config = new NamePasswordConfiguration("https","secure.gooddata.com","username","password");

    public void testComputeMetric() throws Exception {
        try {
            if(config != null) {
                GdcRESTApiWrapper rest = new GdcRESTApiWrapper(config);
                rest.login();
                double value = rest.computeMetric("/gdc/md/uikbr0t694tnh3uje22yedukbyzyt30o/obj/1177");
                System.err.println("ret val = "+value);
            }
        }
        catch(Exception e) {
           e.printStackTrace();
        }
    }


}