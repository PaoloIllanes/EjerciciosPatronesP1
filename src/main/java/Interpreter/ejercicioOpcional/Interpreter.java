package Interpreter.ejercicioOpcional;


import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private List<GherkinsExpression> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpreter){

        context = new Context(msgToInterpreter.replace(" ",""));
        for ( String charOriginal :  msgToInterpreter.split(" ")) {
            switch (charOriginal){
                case "Como":
                    grammar.add(new Given(charOriginal.length()));
                    break;
                case "Quiero":
                    grammar.add(new When(charOriginal.length()));
                    break;
                case "Para":
                    grammar.add(new Then(charOriginal.length()));
                    break;
                default:
                    grammar.add(new Word(charOriginal.length()));
                    break;


            }
        }
    }

    public String evaluateMsg(){

        for (GherkinsExpression expression:grammar) {
            expression.interpreter(context);
        }

        return context.output;
    }
}
