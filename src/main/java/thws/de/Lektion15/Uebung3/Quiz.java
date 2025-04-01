package thws.de.Lektion15.Uebung3;

public class Quiz {
    
    QuizFragen start;

    public Quiz(QuizFragen start){
        this.start = start;
    }

    public void fuegeFrageHinzu(QuizFragen frage){
        if (start == null) {
            start = frage; 
        } else {
            QuizFragen temp = start; 
            while (temp.next != null) {
                temp = temp.next; 
            }
            temp.next = frage; 
        }
    }

    public void generiereQuizbogen(){
        QuizFragen temp = start;
        while(temp != null){
            System.out.println(temp.erstelleFrage());
            temp = temp.next;
        }
    }
    
}
