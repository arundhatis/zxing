/*
 * Copyright 2007 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing.client.result.test;

import com.google.zxing.common.BarcodeFormat;
import com.google.zxing.common.Result;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests {@link ISBNParsedResult}.
 *
 * @author Sean Owen
 */
public final class ISBNParsedResultTestCase extends Assert {

  @Test
  public void testISBN() {
    doTest("9784567890123");
  }

  private static void doTest(String contents) {
    Result fakeResult = new Result(contents, null, null, BarcodeFormat.EAN_13);
    ParsedResult result = ResultParser.parseResult(fakeResult);
    assertSame(ParsedResultType.ISBN, result.getType());
    ISBNParsedResult isbnResult = (ISBNParsedResult) result;
    assertEquals(contents, isbnResult.getISBN());
  }

}