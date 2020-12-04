package counter;

public class Counter {

    int defaultValue;
    int resetValue;

    public Counter(){
        this.defaultValue = 0;
        this.resetValue = 0;
    }

    public Counter(int defaultValue) {
        this.defaultValue = defaultValue;
        this.resetValue = defaultValue;
    }

    public void add(){
        this.defaultValue = this.defaultValue + 1;
    }

    public void add(int n){
        this.defaultValue = this.defaultValue + n;
    }

    public int get() {
        return defaultValue;
    }

    public void reset(){
        this.defaultValue = resetValue;
    }

}
