package org.robolectric.shadows;

import static android.os.Build.VERSION_CODES.N;
import static com.google.common.truth.Truth.assertThat;

import android.app.ActivityOptions;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

/** Unit tests for ShadowActivityOptions. */
@RunWith(AndroidJUnit4.class)
public final class ShadowActivityOptionsTest {

  @Test
  @Config(minSdk = N)
  public void testFromBundle() {
    Rect launchBounds = new Rect(1, 2, 3, 4);
    Bundle optionsBundle = ActivityOptions.makeBasic().setLaunchBounds(launchBounds).toBundle();
    ActivityOptions options = ShadowActivityOptions.fromBundle(optionsBundle);
    assertThat(options.getLaunchBounds()).isEqualTo(launchBounds);
  }
}
