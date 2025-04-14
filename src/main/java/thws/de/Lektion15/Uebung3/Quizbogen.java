package thws.de.Lektion15.Uebung3;

public class Quizbogen {

    
    
    public static void main(String[] args){
        QuizFrage q1 = new Textfrage("Was ist die Hauptstadt von Deutschland ?");
        String[] antworten1 = {"Bayern", "Hessen", "Frankfurt", "Berlin"};
        QuizFrage q2 = new Multiplechoicefrage("Was ist das beste Budesland Deutschlands ?", antworten1);

        Quiz quiz = new Quiz(q1);
        quiz.fuegeFrageHinzu(q2);
        quiz.generiereQuizbogen();

    }
}
