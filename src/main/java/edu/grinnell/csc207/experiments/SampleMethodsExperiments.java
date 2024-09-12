package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.SampleMethods;

import java.io.PrintWriter;

/**
 * A place to put experiments with our SampleMethods class.
 */
public class SampleMethodsExperiments {
  /**
   * Run some experiments.
   *
   * @param args
   *   Command-line arguments (ignored).
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    removeAsExperiments(pen);
    removeBsExperiments(pen);
    pen.close();
  } // main()

  /**
   * Experiments with `removeAs`.
   *
   * @param pen
   *   Where to print the output from the experiments.
   */
  public static void removeAsExperiments(PrintWriter pen) {
    removeAsExperiment(pen, "");
    removeAsExperiment(pen, "hello");
    removeAsExperiment(pen, "a");
    removeAsExperiment(pen, "aaaa");
    removeAsExperiment(pen, "pain");
    removeAsExperiment(pen, "alphabet");
    removeAsExperiment(pen, "aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa");
    removeAsExperiment(pen, "aaabbbaaa");
  } // removeAsExperiments

  /**
   * A single experiment with <code>removeAs</code>.
   *
   * @param pen
   *   Where to print output from the experiments.
   * @param str
   *   A string to use as a parameter to <code>removeAs</code>.
   */
  public static void removeAsExperiment(PrintWriter pen, String str) {
    pen.print("removeAs(\"" + str + "\") = ");
    pen.flush();
    String tmp = SampleMethods.removeAs(str);
    pen.println("\"" + tmp + "\"");
  } // removeAsExperiment(PrintWriter, String)

  public static void removeBsExperiments(PrintWriter pen) {
    removeBsExperiment(pen, "");
    removeBsExperiment(pen, "hello");
    removeBsExperiment(pen, "a");
    removeBsExperiment(pen, "aaaa");
    removeBsExperiment(pen, "pain");
    removeBsExperiment(pen, "alphabet");
    removeBsExperiment(pen, "aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa");
    removeBsExperiment(pen, "aaabbbaaa");
  } // removeAsExperiments

  /**
   * A single experiment with <code>removeAs</code>.
   *
   * @param pen
   *   Where to print output from the experiments.
   * @param str
   *   A string to use as a parameter to <code>removeAs</code>.
   */
  public static void removeBsExperiment(PrintWriter pen, String str) {
    pen.print("removeAs(\"" + str + "\") = ");
    pen.flush();
    String tmp = SampleMethods.removeBs(str);
    pen.println("\"" + tmp + "\"");
  } // removeAsExperiment(PrintWriter, String)
} // class SampleMethodsExperiment
