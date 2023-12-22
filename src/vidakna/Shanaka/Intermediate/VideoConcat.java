package Intermediate;

public class VideoConcat {
    public static void main(String[] args) {
        String a="Sayuri ";
        String b="monster";
        String c=a.replace(a, "Janeesha ")+ b.replace(b, "God");
       // System.out.println(a+b);
        System.out.println(a.concat(b));
        System.out.println(a.replace('S', 'F'));
        // System.out.println(a.replace("Bac", "Fas"));
        // System.out.println(a.replace("Bacon", "Sayuri")+b);
        // System.out.println(b.replace(b, "Sayuri ")+b);
        System.out.println(a.concat(b));
        System.out.println(c);

        // String a = " Sayuri ";
        // String b = " Ghost ";

        // System.out.println(a.concat(b));
        // System.out.println(a.replace('S', 'F').concat(b.replace("Ghost" , "Monster")));

    }
}
