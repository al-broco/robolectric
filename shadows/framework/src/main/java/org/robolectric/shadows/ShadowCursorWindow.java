package org.robolectric.shadows;

import android.database.CursorWindow;
import org.robolectric.annotation.Implements;

@Implements(value = CursorWindow.class, shadowPicker = ShadowCursorWindow.Picker.class)
public class ShadowCursorWindow {
  public static class Picker extends SQLiteShadowPicker<ShadowCursorWindow> {
    public Picker() {
      super(ShadowLegacyCursorWindow.class, ShadowNativeCursorWindow.class);
    }
  }
}
