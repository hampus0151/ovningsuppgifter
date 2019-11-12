public class Clock {
        String displayString;
        NumberDisplay hours;
        NumberDisplay minutes;

        public Clock(){
            hours = new NumberDisplay(24);
            minutes = new NumberDisplay(59);
            updateDisplay();
        }
        public Clock(int hour, int minute) {
            hours = new NumberDisplay(24);
            hours.setValue(hour);
            minutes = new NumberDisplay(59);
            minutes.setValue(minute);
            updateDisplay();
        }
        public void timeTick() {
            minutes.increment();
            updateDisplay();
        }
        public void setTime(int hour ,int minute) {
            hours.setValue(hour);
            minutes.setValue(minute);
            updateDisplay();
        }
        public String getTime() {
            return displayString;
        }

        private void updateDisplay() {
            if (minutes.getValue() == 59) {
                hours.increment();
            }
        }
}
