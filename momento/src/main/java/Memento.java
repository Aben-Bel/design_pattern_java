import java.util.*;

public class Memento {
    public static void main(String[] args){
        System.out.println("Design pattern Memento");
    }
}

class EditorMemento{
    private String text;

    EditorMemento(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

class History{
    private List<EditorMemento> history = new ArrayList<>();

    public EditorMemento pop(){
        if(history.size() == 0) return null;
        EditorMemento lastMemento = history.get(history.size() - 1);
        history.remove(history.size() -1);
        return lastMemento;
    }

    public void push(EditorMemento memento){
        history.add(memento);
    }
}

class Editor {
    private String text;

    Editor(){
        text = "";
    }

    public EditorMemento takeSnapShot(){
        return new EditorMemento(text);
    }

    public void undo(EditorMemento editorMemento){
        setText(editorMemento.getText());
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void write(String toBeWritten){
        text = text + toBeWritten;
    }

    public void removeWord(){
        String[] words = text.split(" ");
        text = String.join(" ", Arrays.copyOf(words, words.length - 1));
    }

}