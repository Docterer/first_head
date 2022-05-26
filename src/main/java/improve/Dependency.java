package improve;

public class Dependency {
    public static void main(String[] args) {
        TCL tcl = new TCL(new TCLRemoteControl());
        tcl.play();
    }
}

interface Itv{
    void play();

    void close();
}

interface OperationTv{
    void operate();
}

class TCL implements Itv{

    private OperationTv operationTv;

    TCL(OperationTv operationTv){
        this.operationTv = operationTv;
    }

    @Override
    public void play() {
        operationTv.operate();
    }

    @Override
    public void close() {
        System.out.println(this.getClass().getName() + ": 电视机关闭");
    }
}

class TCLRemoteControl implements OperationTv{
    @Override
    public void operate() {
        System.out.println(this.getClass().getName() + ": 电视机打开");
    }
}