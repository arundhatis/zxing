/*
 * Copyright 2008 ZXing authors
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

package com.google.zxing.oned;

import com.google.zxing.common.BarcodeFormat;
import com.google.zxing.readerwriter.MultiFormatReader;
import com.google.zxing.common.AbstractBlackBoxTestCase;

/**
 * @author Sean Owen
 */
public final class Code93BlackBox1TestCase extends AbstractBlackBoxTestCase {

  public Code93BlackBox1TestCase() {
    super("resources/blackbox/code93-1", new MultiFormatReader(), BarcodeFormat.CODE_93);
    addTest(3, 3, 0.0f);
    addTest(3, 3, 180.0f);
  }

}