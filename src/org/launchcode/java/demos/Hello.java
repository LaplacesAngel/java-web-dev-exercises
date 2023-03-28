package org.launchcode.java.demos;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        String staticVariable = "dog";
        staticVariable = "Rutabaga-and-peaches ";
        String staticVariable2 = "Movies-and-Fogies ";
        String chombiman = "    Hi boy        ";
        char charVariable = 'd';

        chombiman.trim();

        System.out.println("Hello, World");
        System.out.println(staticVariable);
        System.out.println(charVariable);
        System.out.println(staticVariable.charAt(3));
        System.out.println(staticVariable.substring(2,21));
        System.out.println(staticVariable.length());
        System.out.println(staticVariable.indexOf('a'));
        System.out.println(staticVariable.indexOf('z'));
        System.out.println(staticVariable.split(" "));
        System.out.println(staticVariable.toUpperCase().concat(staticVariable2.toLowerCase()).concat(chombiman.trim()));
        System.out.println(chombiman.contains("Hi "));
        System.out.println(chombiman.equals("    Hi boy        "));


        float hi = 3.0f;
        System.out.println(hi);

        double hiyo = 10000.12345678912;
        System.out.println(hiyo);

        boolean yo = false;
        System.out.println(yo);
    }
}
