package org.robolectric.shadows;

import static org.robolectric.util.reflector.Reflector.reflector;

import android.app.ActivityOptions;
import android.os.Bundle;
import org.robolectric.annotation.Implements;
import org.robolectric.util.reflector.Direct;
import org.robolectric.util.reflector.ForType;
import org.robolectric.util.reflector.Static;

/** Shadow of ActivityOptions to allow access to hidden {@code fromBundle} method */
@Implements(ActivityOptions.class)
public class ShadowActivityOptions {

  public static ActivityOptions fromBundle(Bundle options) {
    return reflector(ActivityOptionsReflector.class).fromBundle(options);
  }

  @ForType(ActivityOptions.class)
  interface ActivityOptionsReflector {
    @Static
    @Direct
    ActivityOptions fromBundle(Bundle options);
  }
}
