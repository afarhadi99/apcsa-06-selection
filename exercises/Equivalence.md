# Simplify and Prove (S25 homework)

## 1. Push the negation inside
Rewrite each condition with NO `!` in front of parentheses. Use De Morgan's laws, then simplify any `!(x > 5)` style parts with the opposite operator.

1. `!(x > 5 && y < 3)`  becomes:
2. `!(a || b)`  becomes:
3. `!(score >= 90 || late)`  becomes:
4. `!(n % 2 == 0 && n > 10)`  becomes:

## 2. Distribution: prove it with a table
Fill in the 8 rows. Then say whether the last two columns are always equal.

| a | b | c | `a || (b && c)` | `(a || b) && (a || c)` |
|---|---|---|---|---|
| true | true | true | | |
| true | true | false | | |
| true | false | true | | |
| true | false | false | | |
| false | true | true | | |
| false | true | false | | |
| false | false | true | | |
| false | false | false | | |

Equal in every row?

## 3. A look-alike that is NOT equivalent
Write two expressions that look equivalent but are not.

Left:
Right:

Show ONE row (values of a and b) where they disagree:

## 4. Check yourself
Edit `src/Equivalence.java` from class and use it to check two of your answers above. Which two?
