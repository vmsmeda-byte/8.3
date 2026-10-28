Here’s a Tip Calculator app GUI built with JavaFX components. You can enter the bill amount, select a tip percentage, choose the number of people, and calculate the tip and total bill.

# Tip Calculator

Calculate your tip in seconds

Bill amount ($)100.00

Choose tip percentage10%

15%

18%

20%

25%

Selected tip: 15%

Custom tip percentage0%

15%

30%

Number of people 2 people

[x]Split the bill between everyone

 Calculate Tip  Reset calculator

## JavaFX components used

| Component | Purpose |
| --- | --- |
| `Label` | Displays field names and results |
| `TextField` | Accepts the bill amount |
| `RadioButton` or `ToggleButton` | Can select a tip percentage |
| `Slider` | Adjusts the tip percentage |
| `ComboBox` | Selects the number of people |
| `CheckBox` | Enables splitting the bill |
| `Button` | Calculates the tip or resets inputs |
| `VBox` and `HBox` | Arrange components vertically and horizontally |

## How user interactions work

- Text input: The bill amount changes when the user enters a new value.
- Tip selection: Selecting a percentage or moving the slider changes the tip rate.
- People selection: Choosing a different number of people updates the split calculation.
- Calculate button: Displays the tip, total, and per-person amounts.
- Reset button: Restores the default values.

The calculation follows these formulas:

$$
\text{Tip}=\text{Bill}\times\frac{\text{Tip \%}}{100}
$$

$$
\text{Total}=\text{Bill}+\text{Tip}
$$

$$
\text{Per Person}=\frac{\text{Total}}{\text{Number of People}}
$$

This interactive preview demonstrates the GUI and its behavior. A standalone JavaFX application would implement the same interface using JavaFX controls and event handlers such as `setOnAction()`.
