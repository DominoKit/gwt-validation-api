/*
 * Java instant.
 *
 * License: Apache License, Version 2.0 See the license.txt file in the root directory or
 * <http://www.apache.org/licenses/LICENSE-2.0>.
 */

package java.time;

public abstract class Instant implements Comparable<Instant> { // NOPMD
  public static Instant now() {
    return new Instant() {
      // nothing to implement
    };
  }

  @Override
  public int compareTo(final Instant o) {
    return 0;
  }
}
