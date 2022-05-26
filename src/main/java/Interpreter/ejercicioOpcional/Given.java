package Interpreter.ejercicioOpcional;

public class Given extends GherkinsExpression{
   private int size;
    public Given(int size){
        this.size=size;
    }
    @Override
    public void interpreter(Context context) {
        context.input= context.input.substring(this.size);
        context.output+="Given ";
}
}
