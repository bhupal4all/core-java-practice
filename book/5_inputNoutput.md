### Input And Output
#### Reading Input
* Input from the console would be read by `java.util.Scanner` by using `System.in`, `Scanner` reads the input from `java.lang.System.in` and provides various functions to read.
    * nextLine
    * nextInt
    * next - read next word (whitespace as delimiter)
    * hasNext
    * check API for whole list
* `Scanner` could read from various inputs like File, InputStream, Path, Readable and so on
```java
Scanner scan = new Scanner(System.in);
```
* What about password?
    * `Scanner` reads as characters and those are visible, `Scanner` is not the best option to read passwords
    * `java.io.Console` could read the password from `java.lang.System`
    ```java
    Console cons = System.console();
    String username = cons.readLine("User name: ");
    char[] passwd = cons.readPassword("Password: ");
    ```

#### Formatting Output
* `System.out.printf` method formats the output