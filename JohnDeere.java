import javax.swing.*;
import java.util.ArrayList;

public class JohnDeere {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\Users\\adith\\Desktop\\John_Deere_logo.svg.png");
        JOptionPane.showMessageDialog(null, "Welcome", "John Deere", JOptionPane.INFORMATION_MESSAGE, icon);
        int option = showHostNameInputDialog();
        ArrayList<String> List = new ArrayList<>();
        ArrayList<ArrayList<String>> FieldOp = new ArrayList<>();

        while (option != 4) {
            if (option == 0) {
                List.add(showCreateNameInputDialog());

                FieldOp.add(showCreateFieldOpInputDialog());


            } else if (option == 1) {
                String a = showCreateNameInputDialog();
                if (List.contains(a)) {
                    int index = List.indexOf(a);
                    List.remove(a);
                    FieldOp.remove(index);
                    List.add(index, showUpdateNameInputDialog());
                    FieldOp.add(index, showCreateFieldOpInputDialog());
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid input", "John Deere",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (option == 2) {
                String b = showCreateNameInputDialog();
                int index1 = List.indexOf(b);

                List.remove(b);
                FieldOp.remove(index1);
            } else if (option == 3) {
                display(List, FieldOp);
            }

            option = showHostNameInputDialog();
        }

    }

    public static int showHostNameInputDialog() {
        String[] options = {"CREATE ", "UPDATE", "DELETE", "DISPLAY", "EXIT"};
        int result = JOptionPane.showOptionDialog(null, "CHOOSE AN OPTION", "JOHN DEERE",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[1]);
        return result;
    }

    public static String showCreateNameInputDialog() {
        String Nam;

        do {
            Nam = JOptionPane.showInputDialog(null, "Enter Field Name?",
                    "JohnDeere", JOptionPane.QUESTION_MESSAGE);
            if (Nam == null) {
                JOptionPane.showMessageDialog(null, "Choice cannot be empty!", "JohnDeere",
                        JOptionPane.ERROR_MESSAGE);

            } //end if

        } while (Nam == null);
        return Nam;
    }

    public static String showUpdateNameInputDialog() {
        String Nam;
        do {
            Nam = JOptionPane.showInputDialog(null, "Enter New Field Name?",
                    "JohnDeere", JOptionPane.QUESTION_MESSAGE);
            if (Nam == null) {
                JOptionPane.showMessageDialog(null, "Choice cannot be empty!", "JohnDeere",
                        JOptionPane.ERROR_MESSAGE);

            } //end if

        } while (Nam == null);
        return Nam;
    }

    public static void display(ArrayList<String> l, ArrayList<ArrayList<String>> x) {
        String a = "";
        String output = "";
        for (int i = 0; i < l.size(); i++) {
            String everything = l.get(i);
            output += everything;
            for (int j = 0; j < x.get(i).size(); j++) {

                String out = x.get(i).get(j);

                output += "- " + out + " ";

            }
        }
        JOptionPane.showMessageDialog(null, output);

    }

    public static ArrayList<String> showCreateFieldOpInputDialog() {
        String n;
        int result = 1;
        ArrayList<String> li = new ArrayList<>();
        String[] options = {"Seeding", "Spraying", "Tillage", "Harvest"};
        n = JOptionPane.showInputDialog(null, "Enter Number of Fields?",
                "JohnDeere", JOptionPane.QUESTION_MESSAGE);
        for (int i = 0; i < Integer.parseInt(n); i++) {

            result = JOptionPane.showOptionDialog(null, "CHOOSE A FIELD OPERATION", "JOHN DEERE",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[1]);
            li.add(options[result]);
        }


        return li;
    }


}