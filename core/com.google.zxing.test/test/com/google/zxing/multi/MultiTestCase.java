/*
 * Copyright 2016 ZXing authors
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

package com.google.zxing.multi;

import com.google.zxing.common.*;
import com.google.zxing.multi.barcode.MultipleBarcodeReader;
import com.google.zxing.readerwriter.MultiFormatReader;
import org.junit.Assert;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.nio.file.Path;

public final class MultiTestCase extends Assert {

  @Test
  public void testMulti() throws Exception {
    // Very basic test for now
    Path testBase = AbstractBlackBoxTestCase.buildTestBase("resources/blackbox/multi-1");

    Path testImage = testBase.resolve("1.png");
    BufferedImage image = ImageIO.read(testImage.toFile());
    LuminanceSource source = new BufferedImageLuminanceSource(image);
    BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

    MultipleBarcodeReader reader = new GenericMultipleBarcodeReader(new MultiFormatReader());
    Result[] results = reader.decodeMultiple(bitmap);
    assertNotNull(results);
    assertEquals(2, results.length);

    assertEquals("031415926531", results[0].getText());
    assertEquals(BarcodeFormat.UPC_A, results[0].getBarcodeFormat());

    assertEquals("www.airtable.com/jobs", results[1].getText());
    assertEquals(BarcodeFormat.QR_CODE, results[1].getBarcodeFormat());
  }

}
