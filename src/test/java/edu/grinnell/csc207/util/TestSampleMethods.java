package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Alex Pollock, Drew Fargo
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * Convert 0 degrees celcius to fahrenheit.
   */
  @Test
  void testZeroCtoF() {
    assertEquals(32, SampleMethods.c2f(0));
  }

  /**
   * Convert 100 degrees celcius to fahrenheit.
   */
  @Test
  void testOneHundredCtoF() {
    assertEquals(212, SampleMethods.c2f(100));
  }

  /**
   * Convert -100 degrees celcius to fahrenheit.
   */
  @Test
  void testNegativeOneHundredCtoF() {
    assertEquals(-148, SampleMethods.c2f(-100));
  }

  /**
   * Convert -40 degrees celcius to fahrenheit.
   * Should return the exact same value.
   */
  @Test
  void testNegativeFourtyCtoF() {
    assertEquals(-40, SampleMethods.c2f(-40));
  }
  /**
   * Adds the first three natural numbers.
   */
  @Test
  void addFirstThree() {
    assertEquals(6, SampleMethods.sum(new int[] {1,2,3}));
  }

  /**
   * Adds the first three negative integers.
   */
  @Test
  void addNegativeFirstThree() {
    assertEquals(-6, SampleMethods.sum(new int[] {-1,-2,-3}));
  }

  /**
   * Empty set
   */
  @Test
  void emptyTest() {
    assertEquals(0, SampleMethods.sum(new int[] {}));
  }

  @Test
  void testExtremes() {
    int tmp = Integer.MAX_VALUE - 10;
    int[] values = { tmp, tmp, -tmp, -tmp };
    assertEquals(0, SampleMethods.sum(values), "extreme values");
 } // testExtremes


 /**
  * Test the expt method on base 2 power 3
  */
  @Test
  void exptBaseTwoPowerThreeTest() {
    assertEquals(64, SampleMethods.expt(2,6));
  }
 /**
  * Test the expt method on base 2 for k=0-10
  */
  @Test
  void exptBase2PowerK() {
    int expected = 1;
    for (int i = 0; i < 11; i++, expected *= 2) {
      assertEquals(expected, SampleMethods.expt(2, i));
    }
  }

  /**
   * Test the expt method on base n=-10-10, k=0-10, where n increments by .1
   */
  @Test
  void exptBaseNPowerK() {
    for (double n = -10; n - 10 < 0.0001; n += 0.1) {
      double expected = 1;
      for (int k = 0; k < 11; k++, expected *= n) {
        assertEquals(expected, SampleMethods.expt(n,k), 0.0001); 
      }
    }
  }

} // class TestSampleMethods
