public class NumberDisplay {
    protected int limit;
    protected int value;

    /**
     * Sets a value for numberdisplay.
     * @param maxLimit defines a limit for the numberdisplay.
     */
    public NumberDisplay(int maxLimit) {
        value = 0;
        limit = maxLimit;
    }

    /**
     * returnes value when getValue is called
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     * changes value of int value when its reaches the defined limit
     * @param newValue
     */
    public void setValue(int newValue) {
        if (newValue < limit && newValue > 0) {
            this.value = newValue;
        }
    }

    /**
     * gives getDispayValue an value to display and changes the value to ex 01 if the value is less than 10.
     * @returns the value for display
     */
    public String getDisplayValue() {
        String display = null;
        if (value > 9) {
            display = String.valueOf(value);
        } else if (value < 10) {
            display = "0" + value;
        }
        return display;
    }

    /**
     *
     * @return
     */
    public int increment() {
        value++;
        if (value >= limit) {
            value = 0;
        }
        return value;
    }
}