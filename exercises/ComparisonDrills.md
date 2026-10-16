# Comparison Drills (S26 homework)

Variables used in every row:

```java
String a = "cat";
String b = new String("cat");
String c = a;
String d = null;
```

**Predict first.** Fill in Predicted for all eight BEFORE running anything. Write `true`, `false` or `crash`.

| # | Expression | Predicted | Actual |
|---|---|---|---|
| 1 | `a == b` | | |
| 2 | `a.equals(b)` | | |
| 3 | `a == c` | | |
| 4 | `a.equals(c)` | | |
| 5 | `b == c` | | |
| 6 | `d == null` | | |
| 7 | `a.equals(d)` | | |
| 8 | `d.equals(a)` | | |

Run them in `src/ComparisonDrills.java` (row 8 is commented out so the rest can run; uncomment it to see the crash).

## For each miss
One sentence on what `==` was actually checking.

-

## Write two methods
Write them in `src/ComparisonDrills.java`:

- `isAdmin(String name)`: true for "admin" or "Admin", false for null. It must not crash.
- `sameLength(String a, String b)`: true when both have the same length. Return false if either is null.

Test `sameLength` four ways (both real, a null, b null, both null) and record the results in a comment.
