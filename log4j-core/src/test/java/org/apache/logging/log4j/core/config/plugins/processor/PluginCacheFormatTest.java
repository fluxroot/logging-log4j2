/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */

package org.apache.logging.log4j.core.config.plugins.processor;

import java.io.IOException;

import org.apache.logging.log4j.core.config.plugins.processor.PluginCache.Format;
import org.junit.Assert;
import org.junit.Test;

public class PluginCacheFormatTest {

    @Test
    public void testParseFormats() {
        Assert.assertArrayEquals(new Format[] { Format.DAT, Format.XML }, Format.parse("DAT,XML", Format.DAT));
    }

    @Test
    public void testPropertiesXml() throws IOException {
        Format.PROPERTIES_XML.writeCache(PluginProcessorTest.loadCacheFiles(), System.out);
    }

    @Test
    public void testProperties() throws IOException {
        Format.PROPERTIES.writeCache(PluginProcessorTest.loadCacheFiles(), System.out);
    }
}
