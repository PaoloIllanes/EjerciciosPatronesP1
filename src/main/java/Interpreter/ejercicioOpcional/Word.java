package Interpreter.ejercicioOpcional;

public class Word extends GherkinsExpression{
    private int size;
    public Word(int size){
        this.size=size;
    }
    @Override
    public void interpreter(Context context) {
        String cadena= context.input.substring(0,this.size);
        context.input= context.input.substring(this.size);
        context.output+=cadena+" ";
    }
}
