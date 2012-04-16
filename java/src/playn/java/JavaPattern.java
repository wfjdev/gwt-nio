/**
 * Copyright 2010 The PlayN Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package playn.java;

import playn.core.Pattern;

import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

class JavaPattern implements Pattern {

  private JavaImage img;
  private TexturePaint paint;

  JavaPattern(JavaImage img) {
    this.img = img;
  }

  TexturePaint paint () {
    if (paint == null && img.isReady()) {
      paint = img.createTexture(img.width(), img.height());
    }
    return paint;
  }
}
