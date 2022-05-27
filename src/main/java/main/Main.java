package main;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {

        final String NUMBER = "º NUMBER";

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        int n = parseInt(showInputDialog("HOW MANY STUDENTS FOR COURSE A?"));
        for (int i = 0; i < n; i++) {
            int number = parseInt(showInputDialog((i + 1) + NUMBER));
            a.add(number);
        }

        n = parseInt(showInputDialog("HOW MANY STUDENTS FOR COURSE B?"));
        for (int i = 0; i < n; i++) {
            int number = parseInt(showInputDialog((i + 1) + NUMBER));
            b.add(number);
        }

        n = parseInt(showInputDialog("HOW MANY STUDENTS FOR COURSE C?"));
        for (int i = 0; i < n; i++) {
            int number = parseInt(showInputDialog((i + 1) + NUMBER));
            c.add(number);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        showMessageDialog(null, "TOTAL STUDENTS: " + total.size());
    }
}
