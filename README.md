# AP CSA — Assignment 06: Selection
**Boolean expressions, if / else-if / nested if, compound conditions, De Morgan, and null-safe comparison. Sessions 20-27.**

Yeshivah of Flatbush · AP Computer Science A · 2026-27

---

## How to work

1. **Fork** this repo to your own account (Fork button, top right).
2. Open your fork in a **Codespace** (green Code button > Codespaces tab > Create codespace on main).
3. Do the exercise in class, then the homework. **Commit with a real message** and push.
4. Submit the URL of **your fork** (it must have your username in it) in Google Classroom.
5. Stop your Codespace when you are done.

## Exercises

| Session | File | Type | Name |
|---|---|---|---|
| S20 | `src/TruthTable.java` | Classwork | Truth Table Lab |
| S20 | `exercises/TruthTables.md` | Homework | Truth Table Set |
| S21 | `src/PassFail.java` | Classwork | PassFail |
| S21 | `src/ShippingCost.java` | Homework | ShippingCost |
| S22 | `src/GradeCalculator.java` | Classwork | Grade Calculator |
| S22 | `src/BmiCategory.java` | Homework | BMI Category Sorter |
| S23 | `src/LeapYear.java` | Classwork | Leap Year |
| S23 | `src/TicketPricing.java` | Homework | Ticket Pricing |
| S24 | `src/LeapCompound.java` | Classwork | Leap Year, One Expression |
| S24 | `src/SignupValidator.java` | Homework | Signup Validator |
| S25 | `src/Equivalence.java` | Classwork | Equivalence Checker |
| S25 | `exercises/Equivalence.md` | Homework | Simplify and Prove |
| S26 | `src/SafeCompare.java` | Classwork | Safe Compare |
| S26 | `exercises/ComparisonDrills.md` | Homework | Comparison Drills |
| S27 | `src/DeliveryFee.java` | Classwork | FRQ 1 Practice: deliveryFee |
| S27 | `exercises/Unit3Review.md` | Homework | Unit 3 Test Prep |

## Traps to watch for

- **= assigns, == compares.** And never compare doubles with ==.
- **else-if chains stop at the first true test,** so order matters.
- **&& and || short-circuit.** Put the safety check on the left.
- **!(a && b) is !a || !b.** Flip the operator AND negate each part.

Slides for every session are in the [apcsa-slides](https://github.com/afarhadi99/apcsa-slides) repo.
