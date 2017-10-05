# Basics 
## Fundamentals
### Data Types
#### Integer Types
| Type | Size | Range |
|-|-|-|
| int | 4 bytes |  -2 147 483 648 (-2<sup>31</sup>) to +2 147 483 647 |
| short | 2 bytes | -32 768 (-2<sup>15</sup>) to +32 767 |
| long | 8 types | -9 223 372 036 854 775 808 (-2<sup>63</sup>) to +9 223 372 036 854 775 807 |
| byte | 1 byte | -128 (-2<sup>7</sup>) to +127 |

#### Floating Point Types
* Numbers of `float` needs to be suffixed by either `F` or `f`, else type would be considered as `double`
* Numbers of `double` can be suffixed by either `D` or `d`

| Type | Size | Range |
|-|-|-|
| float | 4 bytes | approximately ±3.40282347E+38F (6-7 significant decimal digits) Java implements IEEE 754 standard |
| double | 8 bytes | approximately ±1.79769313486231570E+308
(15 significant decimal digits) |

> **Note:** floating point numbers are NOT stored exactly. For example, '0.9' is stored as '0.8999999999999999'

> **Note:** methods tagged with the `strictfp` keyword must use strict floating-point operations that yield reproducible results. <br/>
For Example:
```java
public static strictfp void main (String args[]) { ... }
```

#### Char Types
* Unicode values are represented by prefixing `\u`
* Some special characters are prefixed by `\ (backslash)`
| Type | Size |
|-|-|
| char | 2 bytes, not necessarily always 2 bytes|
> **Note:** 
* In the case of encodings, it would be 1 byte or for most common characters.  
* Since the platform default encoding is usually a 1-byte encoding such as ISO-8859-1 or a variable-length encoding such as UTF-8, it can easily convert that 1 byte to a single character.

#### Boolean Type
* `boolean` type has two values, `false` and `true`
* Non Zero Value ==> true





