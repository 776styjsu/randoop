package randoop.generation;

import java.util.Objects;

/** Represents a pair of lifecycle methods: a start method and its corresponding stop method. */
public class MethodPair {

  /** The name of the start method. */
  private final String startMethodName;

  /** The name of the stop method. */
  private final String stopMethodName;

  /**
   * Constructs a MethodPair with the specified start and stop method names.
   *
   * @param startMethodName the name of the start method (e.g., "start")
   * @param stopMethodName the name of the corresponding stop method (e.g., "stop")
   * @throws NullPointerException if either method name is {@code null}
   * @throws IllegalArgumentException if the method names are the same
   */
  public MethodPair(String startMethodName, String stopMethodName) {
    this.startMethodName =
        Objects.requireNonNull(startMethodName, "Start method name cannot be null");
    this.stopMethodName = Objects.requireNonNull(stopMethodName, "Stop method name cannot be null");

    if (startMethodName.equals(stopMethodName)) {
      throw new IllegalArgumentException("Start and stop method names cannot be the same");
    }
  }

  /**
   * Returns the name of the start method.
   *
   * @return the name of the start method
   */
  public String getStartMethodName() {
    return startMethodName;
  }

  /**
   * Returns the name of the stop method.
   *
   * @return the name of the stop method
   */
  public String getStopMethodName() {
    return stopMethodName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof MethodPair)) {
      return false;
    }

    MethodPair that = (MethodPair) o;

    if (!startMethodName.equals(that.startMethodName)) return false;
    return stopMethodName.equals(that.stopMethodName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startMethodName, stopMethodName);
  }

  @Override
  public String toString() {
    return "MethodPair{"
        + "startMethodName='"
        + startMethodName
        + '\''
        + ", stopMethodName='"
        + stopMethodName
        + '\''
        + '}';
  }
}