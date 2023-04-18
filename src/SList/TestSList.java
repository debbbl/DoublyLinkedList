package SList;

public class TestSList {
    public static void main(String[] args){
        SList<String> newList=new SList<String>();
        newList.appendEnd("Linked list ");
        newList.appendEnd("is ");
        newList.appendEnd("easy");
        newList.display();
        System.out.println("Removing the word \"linked list\" : "+newList.removeInitial());
        System.out.println("Checking is \'difficult\" is in the list: "+newList.contains("difficult"));
        newList.clear();
        newList.display();
    }
}
