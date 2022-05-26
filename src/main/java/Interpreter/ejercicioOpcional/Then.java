package Interpreter.ejercicioOpcional;

public class Then extends GherkinsExpression{
    private int size;
    public Then(int size){
        this.size=size;
    }
    @Override
    public void interpreter(Context context) {
        context.input= context.input.substring(this.size);
        context.output+="Then ";
    }
}
