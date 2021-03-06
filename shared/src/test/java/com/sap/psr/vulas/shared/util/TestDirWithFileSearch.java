/**
 * This file is part of Eclipse Steady.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.sap.psr.vulas.shared.util;

import static org.junit.Assert.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

import org.junit.Test;

public class TestDirWithFileSearch {

	@Test
	public void testSearch() {
		final DirWithFileSearch s = new DirWithFileSearch("readme.txt");
		
		// 1 hit
		Set<Path> r = s.search(Paths.get("src/test/resources/foo"));
		assertEquals(1, r.size());
		
		// 0 hits
		s.clear();
		r = s.search(Paths.get("src/test/resources/foo/empty"));
		assertEquals(0, r.size());
	}
}
