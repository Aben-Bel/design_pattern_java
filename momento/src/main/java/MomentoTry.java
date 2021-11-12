import java.util.Arrays;
public class MomentoTry {
    public static void main(String[] args){
        // create document
        Document doc = new Document();

        // write something
        doc.write("I am writing down to the document object using the public write method.");
        doc.write("Now we will try to implement undo for the document.");
        doc.write("Basically, what it does is undo last write or if i removed a single word, undo the removed word");
        doc.write("To make this thing more scalable. I will try to use TDD");

        // let's print doc
        System.out.println("MomentoTry Example");
        doc.print();


    }
}

class Document{
    private String text;

    Document(){
        text = "";
    }

    public void write(String textString){
        text += textString;
    }

    public void removeWord(){
        String[] words = text.split(" ");
        text = String.join(" ", Arrays.copyOf(words, words.length - 1));
    }

    public String getString(){
        return text;
    }

    public void print(){
        System.out.println("Document.print()");
        System.out.println(text);
    }
}