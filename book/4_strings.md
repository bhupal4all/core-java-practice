#### Strings
* substring
  * substring(index, length)
* concatination
  * concat
  * adding strings by `+`
* equality
  * equals
  * equalsIgnoreCase
* empty or null string
  * string.length() == 0
  * string.equals("")
* Code Points and Code Units
  * Code Unit - The basic multilingual plane are represented as 16-bit values
  * `String.charAt(position)` return the code unit at given position
  * `length` gives number of code units required for a given string in UTF-16 encoding
  * to find out true length of the string
  ```java
  int cpCount = greeting.codePointCount(0, greeting.length());
  ```

#### Building Strings
* Prior to Java1.5, we use `StringBuffer`, this is slightly less efficient at this classes uses multi threading to add or remove the characters
* `StringBuilder` introduced in Java 1.6 and this uses single thread and so this is more efficient than the `StringBuffer`