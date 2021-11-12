import java.util.*;

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

    private List<Map.Entry<Integer, String>> actions =  new ArrayList<>();

    Document(){
        text = "";
    }

    public void addAction(String value, Integer action){
        actions.add(new AbstractMap.SimpleEntry<>(action, value));
    }

    public void write(String textString){
        addAction(textString, 0);
        text += textString;
    }

    public void removeWord(){
        String[] words = text.split(" ");
        addAction(words[words.length-1], 1);
        text = String.join(" ", Arrays.copyOf(words, words.length - 1));
    }

    public String getString(){
        return text;
    }

    public void print(){
        System.out.println("Document.print()");
        System.out.println(text);
    }

    public void undoRemove(String lastRemoved){
        text = text + " " + lastRemoved;
    }

    public void undoWrite(String lastWritten){
        int startInd = 0;
        int endInd = text.length() - lastWritten.length() - 1;
        text = text.substring(0, endInd + 1);
    }

    public void undo(){
        int size = actions.size();
        if(size == 0) return;

        Map.Entry lastAction = actions.get(size - 1);

        if((int) lastAction.getKey() == 1){
            String lastRemoved = (String) lastAction.getValue();
            undoRemove(lastRemoved);
        }

        if((int) lastAction.getKey() == 0){
            String lastWritten = (String) lastAction.getValue();
            undoWrite(lastWritten);
        }
        actions.remove(size - 1);
    }
}