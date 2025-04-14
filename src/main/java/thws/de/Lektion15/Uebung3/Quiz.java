package thws.de.Lektion15.Uebung3;

public class Quiz {
    
    QuizFrage start;

    public Quiz(QuizFrage start){
        this.start = start;
    }

    public void fuegeFrageHinzu(QuizFrage frage){
        if (start == null) {
            start = frage; 
        } else {
            QuizFrage temp = start; 
            while (temp.next != null) {
                temp = temp.next; 
            }
            temp.next = frage; 
        }
    }

    public void generiereQuizbogen(){
        QuizFrage temp = start;
        while(temp != null){
            System.out.println(temp.erstelleFrage());
            temp = temp.next;
        }
    }
    
}
