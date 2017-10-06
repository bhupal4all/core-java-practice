### Controls
#### Block scope
* A block or compound statement consists of a number of Java statements, surrounded by a pair of braces
* A block can be nested inside another block
    * Cant define same variable name inside nested block
```java
public static void main(String[] args)
{
   int n;
   ...
   {
     int k;
     int n; // Error--can't redefine n in inner block
     ...
   }
}
```

#### Conditional Statements
* `if`
* `if` ... `else`
* `if` ... `else if` ... `else`

#### Loops
* `while`
* `do` ... `while`
* `for` (Determinate Loop)

#### Multi selections
* `switch`
* A Case Label can be 
    * constant expression of type char, byte, short, or int
    * An enumerated constant
    * Starting with Java SE 7, a string literal
> **Note:** If you forget to add a break at the end of an alternative, execution falls through to the next alternative! 

#### Statements That Break Control Flow
##### `break`
* breaks the regular flow of control and can be used to break the loop either in while, for or do-while
* If you have multiple loops and you need break out of those completly?
* we can use break label
```java
label:
{
    ...
    if (condition) break label; // exits block
    ...
}
// jumps here when the break statement executes
```
> **Note:** Naturally, we don’t recommend this approach. Note, however, that you can only jump out of a block, never into a block.

##### `continue`
* The continue statement transfers control to the header of the innermost enclosing loop.