package lessons.lesson6.HW1;

import java.util.Objects;

public class WorkStation extends Laptop{
  private  int frequency;
   private String keyboard;

    public void keyboard(){
        System.out.println("this work station has" + this.keyboard);
    }

    public WorkStation() {
    }

    public WorkStation(int frequency, String keyboard) {
        this.frequency = frequency;
        this.keyboard = keyboard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WorkStation that = (WorkStation) o;
        return frequency == that.frequency &&
                keyboard.equals(that.keyboard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), frequency, keyboard);
    }


    @Override
    public String toString() {
        return "WorkStation{" +
                "frequency=" + frequency +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}
