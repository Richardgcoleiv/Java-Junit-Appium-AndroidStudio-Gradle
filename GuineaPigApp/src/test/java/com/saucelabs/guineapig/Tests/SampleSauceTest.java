package com.saucelabs.guineapig.Tests;

import com.saucelabs.common.SauceOnDemandSessionIdProvider;

import org.junit.Test;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SampleSauceTest extends SampleSauceTestBase {

  /**
   * Constructs a new instance of the test.  The constructor requires three string parameters,
   * which represent the operating system, version and browser to be used when launching a Sauce
   * VM.  The order of the parameters should be the same
   * as that of the elements within the {@link #browsersStrings()} method.
   *
   * @param platformName      name of the platformName. (Android, iOS, etc.)
   * @param deviceName        name of the device
   * @param platformVersion   Os version of the device
   * @param appiumVersion     appium version
   * @param deviceOrientation device orientation
   */
  public SampleSauceTest(String platformName, String deviceName, String platformVersion, String appiumVersion, String deviceOrientation) {
    super(
            "Android",
            "Samsung Galaxy S9 HD GoogleAPI Emulator",
            "7.1",
            "1.8.1",
            "portrait");
  }


  @Test
  public void deployApp() throws InvalidElementStateException, InterruptedException {

    /**
     * Test Actions here...
     */
    TimeUnit.SECONDS.sleep(10);

  }
}
