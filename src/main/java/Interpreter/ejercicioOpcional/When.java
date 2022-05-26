package Interpreter.ejercicioOpcional;

public class When extends GherkinsExpression{
    private int size;
    public When(int size){
        this.size=size;
    }
    @Override
    public void interpreter(Context context) {
        context.input= context.input.substring(this.size);
        context.output+="When ";
    }
}
