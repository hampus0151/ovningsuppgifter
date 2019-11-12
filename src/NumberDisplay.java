public class NumberDisplay {
    protected int limit;
    protected int value;

    public NumberDisplay(int maxLimit) {
        value = 0;
        limit = maxLimit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (newValue < limit && newValue > 0) {
            this.value = newValue;
        }
    }

    public String getDisplayValue() {
        String display = null;
        if (value > 9) {
            display = String.valueOf(value);
        } else if (value < 10) {
            display = "0" + value;
        }
        return display;
    }

    public int increment() {
        value++;
        if (value >= limit) {
            value = 0;
        }
        return value;
    }
}