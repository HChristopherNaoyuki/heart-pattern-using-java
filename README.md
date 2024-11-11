# Heart Shape Using Stars

This program generates a heart shape pattern made of stars (`*`). It is structured into two parts:
1. **Upper Pyramid**: The top part of the heart with stars and spaces.
2. **Bottom Inverted Pyramid**: The lower part of the heart.

## Features

- **Dynamic Pattern**: You can change the size of the heart by adjusting the value of `n`.
- **Efficient String Construction**: The pattern is generated using `StringBuilder` for optimal performance.
- **Simple Structure**: The program uses loops to print spaces and stars in the desired pattern.

## How It Works

The program generates the heart pattern by using two main loops:
1. The first loop creates the upper pyramid, printing stars on both the left and right side, with spaces in between.
2. The second loop generates the bottom inverted pyramid, printing stars in a progressively wider pattern.

## Example Output

For `n = 10`, the output will look like this:

```
  *****     *****
 *******   *******
********* *********
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *
```

## Usage

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/heart-pattern-using-java.git
   ```

2. Navigate to the project directory:
   ```bash
   cd heart-shape-stars
   ```

3. Compile and run the Java program:
   ```bash
   javac Solution.java
   java Solution
   ```

4. Modify the `n` value in the code to adjust the size of the heart shape.

---
